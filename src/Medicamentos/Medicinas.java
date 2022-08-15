/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicamentos;

/**
 *
 * @author Emanuel
 */
public class Medicinas {
    private boolean estadoSalud;
    private int energia;
    private int aburrimiento;
    private int necesidades;
    private int hambre;
    private int tiempoRestante;

    public Medicinas(boolean estadoSalud, int energia, int aburrimiento, int necesidades, int hambre, int tiempoRestante) {
        this.estadoSalud = estadoSalud;
        this.energia = energia;
        this.aburrimiento = aburrimiento;
        this.necesidades = necesidades;
        this.hambre = hambre;
        this.tiempoRestante = tiempoRestante;
    }
    
    

    public boolean isEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(boolean estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
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

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }
    
    
            
}
