/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

/**
 *
 * @author Alejandra Arias
 */
public class Nodo {
    int dato;
    String nombre;
    String aut;
    Nodo nodoIzquierdo;
    Nodo nodoDerecho;

    public Nodo(int dato, String nom, String aut) {
        this.dato = dato;
        this.nombre = nom;
        this.aut = aut;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }
    
    public String toString(){
        return nombre + " Su dato es " + dato;
    }
}
