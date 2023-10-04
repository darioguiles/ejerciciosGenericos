package org.example;
import java.util.Arrays;

public class MatrizGenerica <T>{
    private int fila;
    private int columna;
    private T[][] matriz;



    public MatrizGenerica(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.matriz = (T[][]) new Object[fila][columna];
    }

    public void set(int fila, int columna, T elemento)
    {
        this.matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna)
    {
        T resultado = this.matriz[fila][columna];
                return resultado;
    }

    public int columnas(){
        return this.columna;
    }

    public int filas(){
        return this.fila;
    }

    @Override
    public String toString() {
        return "MatrizGenerica{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
