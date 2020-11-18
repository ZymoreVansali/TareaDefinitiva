/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra.Defensas;

import java.awt.Label;
import tareaguerra.ElementosMapa;

/**
 *
 * @author Daniel
 */
public class Defensas extends ElementosMapa{
    public int tipoObjetivo; // 1 tierra, 2 aire, 3 ambos, 4 ninguno
    
    public Defensas(int nivel, int tipoObjetivo, String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, nombre, vida, imagen, aparicion, campo, ataquePorSegundo);
    }



    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void crecer(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decrementarVida(int poder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
