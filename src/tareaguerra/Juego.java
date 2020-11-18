/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra;

import GUI.PantallaJuego;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Tefy
 */
public class Juego {
    public ArrayList <Guerrero> guerrerosDisponibles;
    ArrayList <Guerrero> aliados;
    ArrayList <Guerrero> enemigos;
    JFrame refPantallaJuego;
    // Falta array de defensas

    public Juego() {
        this.guerrerosDisponibles = new ArrayList<Guerrero>();
        this.aliados = new ArrayList<Guerrero>();
        this.enemigos = new ArrayList<Guerrero>();
        this.guerrerosDisponibles = (ArrayList <Guerrero>) FileManager.readObject("src\\DatosGuardados\\GuerrerosDisponibles.dat");
        
        
    }
    


    
    
    
}
