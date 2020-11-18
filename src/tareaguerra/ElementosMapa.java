/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra;

import GUI.PantallaJuego;
import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tefy
 */
public abstract class ElementosMapa extends Thread implements Serializable{ // mamá de guerreros y estructuras
    //public JFrame refPantalla;
    public String nombre;
    public int distanciaAtaque;
    public int poderAtaque;
    public boolean movimiento;
    public int vida;
    public String imagen;
    public int aparicion;
    public int campo;
    public int nivel;
    public int ataquePorSegundo;
    private boolean running = false;
    private boolean pause = false;
    

    public ElementosMapa(int nivel, String nombre, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        this.nombre = nombre;
        this.vida = vida;
        this.imagen = imagen;
        this.aparicion = aparicion;
        this.campo = campo;
        this.ataquePorSegundo = ataquePorSegundo;
        this.running = false;
        this.pause = false;
        this.nivel = nivel;
        //this.refPantalla = new PantallaJuego();
    }
    //public abstract void atacar();
    
    public abstract void crecer(int nivel);
    
    
    
    
    
    
    
    
    
}
