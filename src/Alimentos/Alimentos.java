/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentos;


public class Alimentos {
    private int cantidadEnergia;
    private int cantidadAlimento;
    private int tiempoRestante;

    public int getCantidadEnergia() {
        return cantidadEnergia;
    }

    public void setCantidadEnergia(int cantidadEnergia) {
        this.cantidadEnergia = cantidadEnergia;
    }

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public Alimentos(int cantidadEnergia, int cantidadAlimento, int tiempoRestante) {
        this.cantidadEnergia = cantidadEnergia;
        this.cantidadAlimento = cantidadAlimento;
        this.tiempoRestante = tiempoRestante;
    }
    
}
