/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

import Actividades.Actividades;
import Alimentos.Alimentos;

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
    private boolean vida;
    
    public Mascota(){
        this.edad = 0;
        this.estadoSalud = true;
        this.energia = 100;
        this.hambre = 0;
        this.aburrimiento = 0;
        this.necesidades = 0;
        this.vida = true;
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
        this.vida = true;
        this.nombre = nombre;
    }

    public boolean isEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(boolean estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }
    
    public void alimentar(Alimentos comida){
        int SEnergia = this.energia+comida.getCantidadEnergia();
        int RHambre = this.hambre-comida.getCantidadAlimento();
        setEnergia(SEnergia);
        setHambre(RHambre);
    }
    
     public void alimentar(Actividades actividad){
        int REnergia = actividad.getCantidadEnergia();
        int RAburrimiento = this.hambre-actividad.getCantidadAburrimiento();
        setEnergia(-REnergia);
        setHambre(RAburrimiento);
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
        if (energia>100) {
            this.energia=100;
        } else {
            this.energia+=energia;
        }
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        if (hambre<0) {
            this.energia=0;
            this.vida=false;
        } else {
            this.hambre-=hambre;
        }
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        if (aburrimiento<0) {
            this.aburrimiento=0;
            this.vida=false;
        } else {
            this.aburrimiento-=0;
        }
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
    
    public void IrAlSanitario(){
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
        if (this.energia+10>100) {
            this.energia+=100;
        } else if (this.aburrimiento+5>100) {
            this.vida=false;
        } else if (this.hambre+5>100) {
            this.vida=false;
        } else if (this.necesidades+5>100) {
            this.vida=false;
        } else {
            this.energia+=10;
            this.aburrimiento+=5;
            this.hambre+=5;
            this.necesidades+=5;
        }
    }
    
}
