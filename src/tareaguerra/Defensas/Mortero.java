package tareaguerra.Defensas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import tareaguerra.Defensas.Defensas;

/**
 *
 * @author Usuario
 */
public class Mortero extends Defensas implements IAtaca{

    public Mortero(int nivel, int tipoObjetivo,String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, 1,"Mortero", 4, 15, false, 1, imagen, 2, 1, 1);
    }

    
}
