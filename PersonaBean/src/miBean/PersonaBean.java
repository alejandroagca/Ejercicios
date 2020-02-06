/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miBean;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public class PersonaBean implements Serializable {
    
        
    private PropertyChangeSupport propertySupport;
    
    public PersonaBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
        
    private String nombre;

    public static final String PROP_NOMBRE = "nombre";

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
        String oldNombre = this.nombre;
        this.nombre = nombre;
        propertySupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }

    private String apellidos;

    public static final String PROP_APELLIDOS = "apellidos";

    /**
     * Get the value of apellidos
     *
     * @return the value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Set the value of apellidos
     *
     * @param apellidos new value of apellidos
     */
    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        propertySupport.firePropertyChange(PROP_APELLIDOS, oldApellidos, apellidos);
    }

    private String telefono;

    public static final String PROP_TELEFONO = "telefono";

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        propertySupport.firePropertyChange(PROP_TELEFONO, oldTelefono, telefono);
    }

        private DireccionBean direccion;

    public static final String PROP_DIRECCION = "direccion";

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public DireccionBean getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(DireccionBean direccion) {
        DireccionBean oldDireccion = this.direccion;
        this.direccion = direccion;
        propertySupport.firePropertyChange(PROP_DIRECCION, oldDireccion, direccion);
    }

}
