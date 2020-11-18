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
public class Bombas extends Defensas implements IAtaca{

    public Bombas(int nivel, int tipoObjetivo,String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, 1,"Bombas", 4, 40, false, 1, imagen, 7, 1, 0);
    }

    
}
