/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra;

/**
 *
 * @author Tefy
 */
public abstract class Guerrero extends ElementosMapa{
    public boolean ruido;
    public String imagen2;
    public Guerrero objetivo;
    public boolean tipoGuerrero; // true = volador, false = terrestre  

    public Guerrero(String imagen2, int nivel, String nombre, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, nombre, vida, imagen, aparicion, campo, ataquePorSegundo);
        this.imagen2 = imagen2;
    }
    
    

    
    public void decrementarVida(int poder){
        if (this.vida > 0){
            this.vida -= poder;
        }
    }
    
    public abstract void atacar();
    public void moverse(){
        
    
    }    
    public void run(){
        // definir objetivo
        atacar();
        moverse();
    }

    @Override
    public String toString() {
        return "Guerrero{" + "nombre=" + nombre + ", imagen2=" + imagen2 + ", objetivo=" + objetivo + ", tipoGuerrero=" + tipoGuerrero + '}';
    }
    
    
    
    
}
