package org.example;
import java.util.LinkedList;

public class PilaGenerica <T>{
    private LinkedList<T> lista= new LinkedList<>(); //Creacion e instancion de nuestra pila de elementos genericos

    public PilaGenerica() {
    }

    public LinkedList<T> getLista() {
        return lista;
    } //Metodo de clase que nos devuelve la lista

    public boolean estaVacia(){ //Metodo de clase que nos devuelve True si la lista está vacia o False si contiene
        boolean resultado=false;

        if (this.lista.isEmpty()) {
            resultado=true;
        }

        return resultado;
    }

    public T extraer() //Este metodo extrae el último elemento y lo saca de la lista (es una pila por lo que se rige por el F.I.L.O.)
    {
        T resultado = this.lista.getLast();
        this.lista.remove(resultado);
        return resultado;
    }

    public T primero() //Devuelve el ultimo elemento de la lista pero sin sacarlo
    {
        T resultado = this.lista.getFirst();
        return resultado;
    }

    public void aniadir(T o)
    {
        this.lista.add(0,o);
    } //Añade un elemento (al principio de la lista)

    @Override
    public String toString() {
        return "PilaGenerica{" +
                "lista=" + lista +
                '}';
    }
}
