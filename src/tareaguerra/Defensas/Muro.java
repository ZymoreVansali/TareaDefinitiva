/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra.Defensas;

import tareaguerra.Defensas.Defensas;

/**
 *
 * @author Usuario
 */
public class Muro extends Defensas{

    public Muro(int nivel, int tipoObjetivo,String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, 0,"Muro", 0, 0, false, 1, imagen, 3, 1, 0);
    }

    
}
