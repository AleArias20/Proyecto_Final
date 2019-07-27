/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

/**
 *
 * @author alfonso
 */
public class Lista {

  private Nodo primero;
  private Nodo ultimo;
  private int tamano;

  public Lista() {
    this.primero = null;
    this.ultimo = null;
    this.tamano = 0;
  }

//Metodo utilizado para denotar que la lista se encuentra vacia.
  public boolean siVacio() {
    return (this.primero == null);
  }

//Metodo para agregar al final de la lista.
  public Lista addLast(int dato) {
    if (siVacio()) {
      Nodo nuevo = new Nodo(dato);
      primero = nuevo;
      ultimo = nuevo;
      nuevo.nodoDer = nuevo;
    } else {
      Nodo nuevo = new Nodo(dato);
      nuevo.nodoDer = null;
      ultimo.nodoDer = nuevo;
      ultimo = nuevo;
    }
    this.tamano++;
    return this;
  }

//Metodo para borrar al final de la lista.
  public void deleteLast() {
    Nodo eliminar = null;
    if (!siVacio()) {

      if (primero == ultimo) {
        primero = null;
        ultimo = null;
      } else {
        Nodo actual = primero;
        while (actual.nodoDer != ultimo) {
          actual = actual.nodoDer;
        }
        eliminar = actual.nodoDer;
        actual.nodoDer = null;

        ultimo = actual;
      }
      this.tamano--;
    }

  }

  public int tamano() {
    return tamano;
  }

//Metodo que imprime la lista y los valores ingresados.
  public void imprimir() {
    if (tamano != 0) {
      Nodo temp = primero;
      String str = "";
      for (int i = 0; i < this.tamano; i++) {
        str = str + temp.dato + "\n";
        temp = temp.nodoDer;
      }

      System.out.println(str);
    }
  }
}
