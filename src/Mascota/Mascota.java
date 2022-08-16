/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

import Actividades.Actividades;
import Alimentos.Alimentos;
import Medicamentos.Medicinas;
import javax.swing.JOptionPane;

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
    private boolean estadoSalud; //Si es verdadero la mascota esta Saludable, Si es falso esta enfermo.
    private String nombre;
    private boolean vida;//Si es verdadero la mascota esta viva, Si es falso esta MUERTA!!.

    public Mascota() {
        this.edad = 0;
        this.estadoSalud = true;
        this.energia = 100;
        this.hambre = 0;
        this.aburrimiento = 0;
        this.necesidades = 0;
        this.vida = true;
        this.nombre = "Predeterminado";
    }

    public String nombrarMascota() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
        this.nombre = nombre;
        return nombre;
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

    public void alimentar(Alimentos comida) {
        setEnergia(comida.getCantidadEnergia());
        setHambre(comida.getCantidadAlimento());
    }

    public void Actividad(Actividades actividad) {
        setEnergia(-actividad.getCantidadEnergia());
        setAburrimiento(actividad.getCantidadAburrimiento());
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
        if (energia > 0) {
            this.energia += energia;
            if (this.energia > 100) {
                this.energia = 100;
            }
        } else {
            this.energia += energia;
            if (this.energia < 0) {
                this.vida = false;
            }
        }
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre -= hambre;
        if (this.hambre < 0) {
            this.hambre = 0;
        }
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        if (this.aburrimiento <= 25) {
            this.aburrimiento -= aburrimiento;
            if (this.aburrimiento <= 0) {
                this.aburrimiento = 0;
                this.vida = false;
            }
        } else {
            this.aburrimiento -= aburrimiento;
        }
    }

    public int getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int necesidades) {
        this.necesidades -= necesidades;
        if (this.necesidades < 0) {
            this.necesidades = 0;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanceTiempo() {
        this.energia--;
        this.aburrimiento++;
        this.hambre++;
        this.necesidades++;
    }

    public boolean comprobarEnfermedad() {
        if (this.estadoSalud == false) {

        }
        return false;
    }

    public void usarMedicamento(Medicinas medicamento) {
        if (this.estadoSalud == medicamento.isEstadoSalud()) {
            this.estadoSalud = false;
        } else {
            this.estadoSalud = true;
            if (this.energia < 10) {
                this.setEnergia(20);
            }
            if (this.aburrimiento > 90) {
                this.setAburrimiento(20);
            }
            if (this.hambre > 90) {
                this.setHambre(20);
            }
            if (this.necesidades > 90) {
                this.setNecesidades(20);
            }
        }
    }

    public boolean comprobarEstado(boolean estadoM) {
        int contador;
        if (estadoM) {
            contador = 0;
        } else {
            contador = 1;
        }

        if (contador == 0) {
            if (this.energia < 10) {
                this.estadoSalud = false;
            } else if (this.aburrimiento > 90) {
                this.estadoSalud = false;
            } else if (this.hambre > 90) {
                this.estadoSalud = false;
            } else if (this.necesidades > 90) {
                this.estadoSalud = false;
            }
            
            if (this.estadoSalud==false) {
                return true;
            }
        }
        
        if (contador == 1) {
            int contadorInterno = 0;
            if (this.energia < 10) {
                contadorInterno++;
            } else if (this.aburrimiento > 90) {
                contadorInterno++;
            } else if (this.hambre > 90) {
                contadorInterno++;
            } else if (this.necesidades > 90) {
                contadorInterno++;
            }
            
            if (contadorInterno >= 2) {
                this.estadoSalud=false;
            }
        }
        return true;
    }

    public void IrAlSanitario() {
        this.necesidades -= 10;
        if (this.necesidades < 0) {
            this.necesidades = 0;
        }
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
    public void Descansar() {
        this.energia += 10;
        this.necesidades += 5;
        this.hambre += 5;
        this.aburrimiento += 5;

        if (this.energia > 100) {
            this.energia = 100;
        }
        if (this.aburrimiento > 100) {
            this.aburrimiento = 100;
        }
        if (this.hambre > 100) {
            this.hambre = 100;
        }
        if (this.necesidades > 100) {
            this.necesidades = 100;
        }
    }

}
