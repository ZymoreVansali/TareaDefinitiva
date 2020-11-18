/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guerreros;

/**
 *
 * @author Tefy
 */
public class GrandesBestias extends MedianoAlcance{

    public GrandesBestias(String imagen2, int nivel, String nombre, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(imagen2, nivel, nombre, vida, imagen, aparicion, campo, ataquePorSegundo);
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crecer(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
