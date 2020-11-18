/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaguerra.Defensas;

/**
 *
 * @author Usuario
 */
public class Cohetes extends Defensas implements IAtaca{

    public Cohetes(int nivel, int tipoObjetivo,String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, 2,"Cohetes", 5, 25, false, 1, imagen, 6, 1, 2);
    }

    
}
