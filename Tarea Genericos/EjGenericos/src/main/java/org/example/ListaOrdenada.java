package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada <E extends Comparable<E>> {
//
    private List<E> lista = new ArrayList<>();
    public  ListaOrdenada(){

    }
    public void add(E o)
    {
        this.lista.add(o);
        Collections.sort(this.lista); //Comparamos así sin necesidad de crear un comparator, es por eso que obligamos a heredar
    }

    public E get(int index) //Metodo de clase que devuelve un objeto dentro de la lista en la posicion que le pasemos
    {
        return this.lista.get(index);
    }
    
    public int size() //Metodo de clase que devuelve el tamaño de la lista
    {
        return this.lista.size();
    }

    public boolean isEmpty() //Metodo de clase que dice si la lista está vacia True, o False si contiene 1 elemento
    {
        return this.lista.isEmpty();
    }

    public boolean remove (E o) //Metodo que elimina un elemento, devolviendo true si lo puede eliminar o false si no
    {
        return this.lista.remove(o);
    }

    public int indexOf (E o) //Metodo que devuelve el indice en la lista de un objeto que le pasemos, devolverá -1 si no lo encuentra.
    {
        return this.lista.indexOf(o);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "lista=" + lista +
                '}';
    }
}
