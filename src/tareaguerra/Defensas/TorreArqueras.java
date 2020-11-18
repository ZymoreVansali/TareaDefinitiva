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
public class TorreArqueras extends Defensas implements IAtaca{

    public TorreArqueras(int nivel, int tipoObjetivo,String nombre, int distanciaAtaque, int poderAtaque, boolean movimiento, int vida, String imagen, int aparicion, int campo, int ataquePorSegundo) {
        super(nivel, 3,"Torre de arqueras", 3, 15, false, 1, imagen, 4, 1, 4);
    }

    
}