/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

/**
 *
 * @author Emanuel
 */
public class Mascota {
    
    private int edad;
    private int energia;
    public int hambre;
    private int aburrimiento;
    private int necesidades;
    private boolean estadoSalud;
    private String nombre;
    
    public Mascota(){
        this.edad = 0;
        this.estadoSalud = true;
        this.energia = 100;
        this.hambre = 0;
        this.aburrimiento = 0;
        this.necesidades = 0;
        this.nombre = "Default";            
    }

    public Mascota(String nombre) {
//        this.alimento  = new Alimentos[5];
        this.edad = 0;
        this.estadoSalud = true;
        this.energia = 100;
        this.hambre = 0;
        this.aburrimiento = 0;
        this.necesidades = 0;
        this.nombre = nombre;
    }
    
    public void alimentar(Alimentos comida){
        this.energia-=comida.getCantidadDeEnergia();
        this.hambre+=comida.getCantidadDeSatisfacion();
    }

    public int getEdad() {
        return edad;
    }

    public void incrementarEdad() {
        this.edad += 1;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public int getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int necesidades) {
        this.necesidades = necesidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void avanceTiempo(){
        this.energia--;
        this.aburrimiento++;
        this.hambre++;
        this.necesidades++;
    }
    
    public boolean comprobarEstado(){
        if (this.energia<10) {
            this.estadoSalud = false;
        } else if (this.aburrimiento>90) {
            this.estadoSalud = false;
        } else if (this.hambre>90) {
            this.estadoSalud = false;
        } else if (this.necesidades>90) {
            this.estadoSalud = false;
        }
        return this.estadoSalud;
    }
    
    public void Sanitario(){
        this.necesidades-=10;
    }
    
//    public boolean realizarCura(){
//        if (this.estado=false) {
//            this.estado=true;
//            return this.estado;
//        } else {
//            this.estado=false;
//            return this.estado;
//        }
//    }
    
    public void Descansar(){
        this.energia+=10;
        this.aburrimiento+=5;
        this.hambre+=5;
        this.necesidades+=5;
    }
    
}
