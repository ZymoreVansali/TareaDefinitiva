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
public class Aereos extends Guerrero{

    public Aereos(String imagen2, int nivel, String nombre, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(imagen2, nivel, nombre, vida, imagen, aparicion, campo, ataquePorSegundo);
        this.movimiento = false;
        this.ruido = true;
        this.tipoGuerrero = true;
        this.distanciaAtaque = 20;
        this.poderAtaque = 10;
        
    }

    

    @Override
    public void atacar() {
        while(objetivo.vida > 0){
            objetivo.decrementarVida(this.poderAtaque);
        }
        //else buscar nuevo objetivo
    }

    @Override
    public void crecer(int nivel) {
        if( this.nivel > this.aparicion){
            this.vida += this.vida * ((this.nivel - this.aparicion) / 10);
            this.poderAtaque += this.vida * ((this.nivel - this.aparicion) / 10);
            this.distanciaAtaque += (this.nivel - this.aparicion) * 10;
            
        }
    }
    
    public Aereos clonar (Aereos original){
        Aereos clon;
        clon = new Aereos(original.imagen2, original.nivel, original.nombre, original.vida, original.imagen, original.aparicion, original.campo, original.ataquePorSegundo);
        return clon;
    }
    
    
    
}
