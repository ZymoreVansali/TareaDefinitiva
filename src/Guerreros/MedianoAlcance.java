/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guerreros;

import tareaguerra.Guerrero;

/**
 *
 * @author Tefy
 */
public class MedianoAlcance extends Guerrero{

    public MedianoAlcance(String imagen2, int nivel, String nombre, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(imagen2, nivel, nombre, vida, imagen, aparicion, campo, ataquePorSegundo);
        this.movimiento = true;
        this.ruido = false;
        this.tipoGuerrero = false;
        this.distanciaAtaque = 5;
        this.poderAtaque = 10;
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
