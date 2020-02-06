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
public class DireccionBean implements Serializable {
    
    private PropertyChangeSupport propertySupport;
    
    public DireccionBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
      
    private String Direccion;

    public static final String DIRECCION = "Direccion";
    /**
     * Get the value of Direccion
     *
     * @return the value of Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * Set the value of Direccion
     *
     * @param Direccion new value of Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    private String CP;

    public static final String PROP_CP = "CP";

    /**
     * Get the value of CP
     *
     * @return the value of CP
     */
    public String getCP() {
        return CP;
    }

    /**
     * Set the value of CP
     *
     * @param CP new value of CP
     */
    public void setCP(String CP) {
        String oldCP = this.CP;
        this.CP = CP;
        propertySupport.firePropertyChange(PROP_CP, oldCP, CP);
    }
public static DireccionBean createAddressBean(String direccion, String cp){
        DireccionBean ret = new DireccionBean();
        ret.Direccion = direccion;
        ret.CP = cp;
        return ret;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Address[");
        sb.append(Direccion);
        sb.append(',');
        sb.append(CP);
        sb.append(']');
        return sb.toString();
    }
}
