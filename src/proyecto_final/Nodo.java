package proyecto_final;


public class Nodo
{
	public int info;
	public Nodo izq;
	public Nodo der;
        Nodo nodoDer;
        int dato;

    public Nodo() {
    }
      
        
    public Nodo(int dato) {
        this.dato = dato;
        this.nodoDer = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

	
	
}
