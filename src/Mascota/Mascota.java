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
        setHambre(-comida.getCantidadAlimento());
    }

    public void Actividad(Actividades actividad) {
        setEnergia(-actividad.getCantidadEnergia());
        setAburrimiento(-actividad.getCantidadAburrimiento());
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
        if (energia == -1) {
            this.energia += energia;
            if (this.energia - energia <= 10 && this.estadoSalud == true) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.energia - energia > 0 && this.energia - energia < 10 && this.estadoSalud == false && this.energia >= 10) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.energia <= 0) {
                JOptionPane.showMessageDialog(null, "La estadistica de ENERGIA llego a su MINIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
                this.energia = 0;
            }
        } else if (energia > 0) {
            this.energia += energia;
            
            if (this.energia >= 100) {
                this.energia = 100;
            }
        } else if (energia<0){
            if (this.energia + energia < 11 && this.estadoSalud == true) {
                this.energia += energia;
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.energia > 10 && this.estadoSalud == false && this.energia + energia <= 10) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.energia + energia <= 0) {
                JOptionPane.showMessageDialog(null, "La estadistica de ENERGIA llego a su MINIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else{
                comprobarEstado();
                this.energia += energia;
            }
        }
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        if ( hambre== 1) {
            this.hambre += hambre;
            if (this.hambre - hambre >= 90 && this.estadoSalud == true) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.hambre - hambre > 90 && this.hambre - hambre < 100 && this.estadoSalud == false && this.hambre <= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.hambre >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de HAMBRE llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            }
        } else if (hambre < 0) {
            this.hambre += hambre;
            
            if (this.hambre <= 0) {
                this.hambre = 0;
            }
        } else if (hambre>0){
            if (this.hambre + hambre > 90 && this.estadoSalud == true) {
                this.hambre += hambre;
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.hambre < 90 && this.estadoSalud == false && this.hambre + hambre >= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.hambre + hambre >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de HAMBRE llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else{
                comprobarEstado();
                this.hambre += hambre;
            }
        }
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        if ( aburrimiento== 1) {
            this.aburrimiento += aburrimiento;
            if (this.aburrimiento - aburrimiento >= 90 && this.estadoSalud == true) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.aburrimiento - aburrimiento > 90 && this.aburrimiento - aburrimiento < 100 && this.estadoSalud == false && this.aburrimiento <= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.aburrimiento >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de ABURRIMIENTO llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            }
        } else if (aburrimiento < 0) {
            this.aburrimiento += aburrimiento;
            
            if (this.aburrimiento <= 0) {
                this.aburrimiento = 0;
            }
        } else if (aburrimiento>0){
            if (this.aburrimiento + aburrimiento > 90 && this.estadoSalud == true) {
                this.aburrimiento += aburrimiento;
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.aburrimiento < 90 && this.estadoSalud == false && this.aburrimiento + aburrimiento >= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.aburrimiento + aburrimiento >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de ABURRIMIENTO llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else{
                comprobarEstado();
                this.aburrimiento += aburrimiento;
            }
        }
    }

    public int getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int necesidades) {
        if ( necesidades== 1) {
            this.necesidades += necesidades;
            if (this.necesidades - necesidades >= 90 && this.estadoSalud == true) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.necesidades - necesidades > 90 && this.necesidades - necesidades < 100 && this.estadoSalud == false && this.necesidades <= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.necesidades >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de NECESIDADES llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            }
        } else if (necesidades < 0) {
            this.necesidades += necesidades;
            
            if (this.necesidades <= 0) {
                this.necesidades = 0;
            }
        } else if (necesidades>0){
            if (this.necesidades + necesidades > 90 && this.estadoSalud == true) {
                this.necesidades += necesidades;
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Tienes alguna estadista en estado critico. \nTu mascota esta ENFERMA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.estadoSalud = false;
            } else if (this.necesidades < 90 && this.estadoSalud == false && this.necesidades + necesidades >= 90) {
                comprobarEstado();
                JOptionPane.showMessageDialog(null, "Estas enfermo y volviste a enfermar. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else if (this.necesidades + necesidades >= 100) {
                JOptionPane.showMessageDialog(null, "La estadistica de NECESIDADES llego a su MAXIMO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            } else{
                comprobarEstado();
                this.necesidades += necesidades;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanceTiempo() {
        setEnergia(-1);
        setAburrimiento(1);
        setHambre(1);
        setNecesidades(1);
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
                this.setAburrimiento(-20);
            }
            if (this.hambre > 90) {
                this.setHambre(-20);
            }
            if (this.necesidades > 90) {
                this.setNecesidades(-20);
            }
        }
    }

    public void comprobarEstado() {
        if (this.estadoSalud == false) {
            int contador = 0;

            if (this.energia < 10) {
                contador++;
            }
            if (this.aburrimiento > 90) {
                contador++;
            }
            if (this.hambre > 90) {
                contador++;
            }
            if (this.necesidades > 90) {
                contador++;
            }

            if (contador >= 2) {
                JOptionPane.showMessageDialog(null, "Tienes mas de una estadistica en estado CRITICO. \nTu mascota esta MUERTA", "Notificacion", JOptionPane.ERROR_MESSAGE);
                this.vida = false;
            }

        }
    }

    public void IrAlSanitario() {
        this.necesidades -= 10;
        if (this.necesidades < 0) {
            this.necesidades = 0;
        }
    }

    public void Descansar() {
        this.setEnergia(10);
        this.setHambre(5);
        this.setNecesidades(5);
        this.setAburrimiento(5);
    }

}
