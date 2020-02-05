/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.EventListener;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Beli
 */
public class RelojBean extends JLabel implements ActionListener, Serializable {
    
    DateTimeFormatter formateador;
    Thread hilo;
    private SuenaAlarmaListener listener;
    
    protected boolean h24;
    protected AlarmaBean alarma;
    
    private Timer temporizador;

    public static final String PROP_ALARMA = "alarma";
    public static final String PROP_H24 = "h24";

    
    public interface SuenaAlarmaListener extends EventListener{
        void sonarAlarma(AlarmaEvent ev);
    }
    
    /**
     * Get the value of alarma
     *
     * @return the value of alarma
     */
    public AlarmaBean getAlarma() {
        return alarma;
    }

    /**
     * Set the value of alarma
     *
     * @param alarma new value of alarma
     */
    public void setAlarma(AlarmaBean alarma) {
        AlarmaBean oldAlarma = this.alarma;
        this.alarma = alarma;
    }

    /**
     * Get the value of h24
     *
     * @return the value of h24
     */
    public boolean isH24() {
        return h24;
    }

    /**
     * Set the value of h24
     *
     * @param h24 new value of h24
     */
    public void setH24(boolean h24) {
        boolean oldH24 = this.h24;
        this.h24 = h24;
        if (this.h24) {
            formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        }
        else{
            formateador = DateTimeFormatter.ofPattern("hh:mm:ss");
        }
    }

    public RelojBean() {
        formateador = DateTimeFormatter.ofPattern("hh:mm:ss");
        temporizador = new Timer (1000, this);
        temporizador.start();
    }  

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String hora = formateador.format(LocalDateTime.now());
        setText(hora);
            if(listener != null && alarma.getActivada().equals("true") && formatear12Hora(alarma.getHoraAlarma()).equals(formatear12Hora(hora))){
                listener.sonarAlarma(new AlarmaEvent(this));
                removeSuenaAlarmaListener(listener);
            }
                
    }
    
    private String formatear12Hora(String hora){
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        DateFormat outputformat = new SimpleDateFormat("hh:mm");
        String mHora = "";
        try{
            Date horaParseada;
            horaParseada = df.parse(hora);
            mHora = outputformat.format(horaParseada);
        }catch(ParseException e){
            Logger.getLogger(RelojBean.class.getName()).log(Level.SEVERE, null, e);
        }
        return mHora;
    }
    
    public void removeSuenaAlarmaListener(SuenaAlarmaListener listener) {
        this.listener = null;
    }

    public void addSuenaAlarmaListener(SuenaAlarmaListener listener) {
        this.listener = listener;
    }
}
