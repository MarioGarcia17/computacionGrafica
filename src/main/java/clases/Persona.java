/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Administrador
 */
public class Persona {
    
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String Identificacion;

    /**
     * Get the value of Identificacion
     *
     * @return the value of Identificacion
     */
    public String getIdentificacion() {
        return Identificacion;
    }

    /**
     * Set the value of Identificacion
     *
     * @param Identificacion new value of Identificacion
     */
    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    private String Edad;

    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public String getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public Persona() {
    }

    public Persona(String nombre, String Identificacion, String Edad) {
        this.nombre = nombre;
        this.Identificacion = Identificacion;
        this.Edad = Edad;
    }

    
    
}
