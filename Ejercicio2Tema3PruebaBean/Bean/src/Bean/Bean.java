package Bean;

import java.io.Serializable;
import javax.swing.JTextField;

public class Bean extends JTextField implements Serializable {

    //Atributos
    private boolean activado;
    private int numero = 0;

    //Constructor
    public Bean() {
        iniciarEvento();
    }

    //Getters y setters
    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Métodos para el control de las propiedades
    public void iniciarEvento() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventoTeclado(evt);
            }
        });

        /*this.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                activar(evt);
            }
        });*/
    }

    public void eventoTeclado(java.awt.event.KeyEvent evt) {
        if (this.getText().length() >= numero) {
            evt.consume();
        }
    }

    public void activar() {
        if (!activado) {
            this.setEnabled(false);
        }
    }
}
