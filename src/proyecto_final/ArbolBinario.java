/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.Vector;

/**
 *
 * @author raulg
 */
public class ArbolBinario {

     Nodo raiz;
     Vector  libros;
    public ArbolBinario() {
        raiz = null;
        libros = new Vector();
    }

    //metodo para insertar un Nodo
    public void agregarNodo(int cant, String nom, String aut) {
        Nodo nuevo = new Nodo(cant, nom, aut);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo auxiliar = raiz;
            Nodo padre;
            while (true) {
                padre = auxiliar;
                if (cant < auxiliar.dato) {
                    auxiliar = auxiliar.nodoIzquierdo;
                    if (auxiliar == null) {
                        padre.nodoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.nodoDerecho;
                    if (auxiliar == null) {
                        padre.nodoDerecho = nuevo;
                        return;
                    }
                }
            }

        }

    }
    //Metodo para saber cuando esta vacio
    public boolean estaVacio() {
        return raiz == null;
    }
    
        public Nodo BuscarArbol(int d){
        Nodo aux = raiz;
        while(aux.dato!=d){
            if(d<aux.dato){
                aux = aux.nodoIzquierdo;
            }else{
                aux = aux.nodoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    
    public Vector llamaInOrder(Nodo r){
        libros.clear();
        return inOrden(r);
    }
    public Vector llamaPreOrder(Nodo r){
        libros.clear();
        return preOrden(r);
    }
    public Vector llamaPosOrder(Nodo r){
        libros.clear();
         posOrden(r);
         
        return libros;
    }
    
    public Vector inOrden(Nodo n){      
        if(n!=null){
            inOrden(n.nodoIzquierdo);
            System.out.print(n.dato + ", ");
            libros.add(n);
            inOrden(n.nodoDerecho);
        }
        return libros;
    }
    
    public Vector preOrden(Nodo r){
        if(r!=null){
            System.out.print(r.dato + ", ");
            libros.add(r);
            preOrden(r.nodoIzquierdo);
            preOrden(r.nodoDerecho);
        }
        return libros;
    }
      public void posOrden(Nodo r){
        if(r!=null){
            posOrden(r.nodoIzquierdo);
            posOrden(r.nodoDerecho);
            libros.add(r);
            System.out.print(r.dato + ", ");
         
        }
       
    }

      public boolean eliminar(int d){
          Nodo auxiliar=raiz;
          Nodo padre=raiz;
          boolean esHijoIzq=true;
          while(auxiliar.dato!=d){
              padre=auxiliar;
              if(d<auxiliar.dato){
                  esHijoIzq=true;
                  auxiliar=auxiliar.nodoIzquierdo;
              }else{
                  esHijoIzq=false;
                  auxiliar=auxiliar.nodoDerecho;
              }
              if(auxiliar==null){
                  return false;
              }
          }
          if(auxiliar.nodoDerecho==null && auxiliar.nodoIzquierdo==null){
              if(auxiliar==raiz){
                  raiz=null;
              }else if(esHijoIzq){
                 padre.nodoIzquierdo=null;
              }else{
                  padre.nodoDerecho=null;
              } 
          }else if(auxiliar.nodoDerecho==null){
              if(auxiliar==raiz){
                  raiz=auxiliar.nodoIzquierdo;
              }else if(esHijoIzq){
                 padre.nodoIzquierdo=auxiliar.nodoIzquierdo;
              }else{
                  padre.nodoDerecho=auxiliar.nodoDerecho;
              }
          }else if(auxiliar.nodoIzquierdo==null){
              
              if(auxiliar==raiz){
                  raiz=auxiliar.nodoDerecho;
              }else if(esHijoIzq){
                 padre.nodoIzquierdo=auxiliar.nodoDerecho;
              }else{
                  padre.nodoDerecho=auxiliar.nodoDerecho;
              }
          }else{
            Nodo reemplazo=RemplazarNodo(auxiliar);
            if(auxiliar==raiz){
               raiz=reemplazo;
            }else if(esHijoIzq){
                padre.nodoIzquierdo=reemplazo;
            }else{
                padre.nodoDerecho=reemplazo;
            }
            reemplazo.nodoIzquierdo=auxiliar.nodoIzquierdo;
          }
          return true;
      }
      //Metodo que regresa el Nodo reemplazo
      public Nodo RemplazarNodo(Nodo remp){
          Nodo remplazar =remp;
          Nodo remplazo=remp;
          Nodo auxiliar=remp.nodoDerecho;
          while(auxiliar!=null){
              remplazar=remplazo;
              remplazo=auxiliar;
              auxiliar=auxiliar.nodoIzquierdo;
          }if(remplazo!=remp.nodoDerecho){
              remplazar.nodoIzquierdo=remplazo.nodoDerecho;
              remplazo.nodoDerecho=remp.nodoDerecho;
          }
          System.out.println("El nodo reemplazo es " + remplazo);
          return remplazo;
      }
}
