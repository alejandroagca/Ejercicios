/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Beli
 */
public class AlarmaBean implements Serializable {
    
    private PropertyChangeSupport propertySupport;
    
    protected String activada;
    protected String horaAlarma;

    public static final String PROP_HORAALARMA = "horaAlarma";
    public static final String PROP_ACTIVADA = "activada";
   
    
    /**
     * Get the value of horaAlarma
     *
     * @return the value of horaAlarma
     */
    public String getHoraAlarma() {
        return horaAlarma;
    }

    /**
     * Set the value of horaAlarma
     *
     * @param horaAlarma new value of horaAlarma
     */
    public void setHoraAlarma(String horaAlarma) {
        String oldHoraAlarma = this.horaAlarma;
        this.horaAlarma = horaAlarma;
        propertySupport.firePropertyChange(PROP_HORAALARMA, oldHoraAlarma, horaAlarma);
    }

    /**
     * Get the value of activada
     *
     * @return the value of activada
     */
    public String getActivada() {
        return this.activada;
    }

    /**
     * Set the value of activada
     *
     * @param activada new value of activada
     */
    public void setActivada(String activada) {
        String oldActivada = this.activada;
        this.activada = activada;
        propertySupport.firePropertyChange(PROP_ACTIVADA, oldActivada, activada);
    }

    
    public AlarmaBean() {
        propertySupport = new PropertyChangeSupport(this);
        System.out.println("Alarma creada");
        
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public static AlarmaBean createAlarmaBean(String activada, String horaAlarma){
        AlarmaBean ret = new AlarmaBean();
        ret.activada = activada;
        ret.horaAlarma = horaAlarma;
        return ret;
    }
}
