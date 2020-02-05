/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.util.EventObject;

/**
 *
 * @author Beli
 */
public class AlarmaEvent extends EventObject{

    public AlarmaEvent(Object o) {
        super(o);
    }

    @Override
    public RelojBean getSource() {
        return (RelojBean)super.getSource();
    }
    
}
