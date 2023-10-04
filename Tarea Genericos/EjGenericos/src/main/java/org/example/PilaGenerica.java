package org.example;
import java.util.LinkedList;

public class PilaGenerica <T>{
    private LinkedList<T> lista= new LinkedList<>();

    public PilaGenerica() {
    }

    public LinkedList<T> getLista() {
        return lista;
    }

    public boolean estaVacia(){
        boolean resultado=false;

        if (this.lista.isEmpty()) {
            resultado=true;
        }

        return resultado;
    }

    public T extraer()
    {
        T resultado = this.lista.getLast();
        this.lista.remove(resultado);
        return resultado;
    }

    public T primero()
    {
        T resultado = this.lista.getFirst();
        return resultado;
    }

    public void aniadir(T o)
    {
        this.lista.add(0,o);
    }

    @Override
    public String toString() {
        return "PilaGenerica{" +
                "lista=" + lista +
                '}';
    }
}
