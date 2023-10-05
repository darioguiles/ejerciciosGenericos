package org.example;
import java.util.Arrays;

public class MatrizGenerica <T>{
    private int fila;
    private int columna;
    private T[][] matriz;



    public MatrizGenerica(int fila, int columna) { //Constructor de nuestra clase
        this.fila = fila;
        this.columna = columna;
        this.matriz = (T[][]) new Object[fila][columna]; //Es necesario este casteo porque no podemos hacer new T[][]
    }

    public void set(int fila, int columna, T elemento) //Mete un elemento en la fila o columna que elijamos
    {
        this.matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna) //Saca un elemento de la fila y columna elegida
    {
        T resultado = this.matriz[fila][columna];
                return resultado;
    }

    public int columnas(){
        return this.columna;
    } //devuelve el numero de columnas de la matriz

    public int filas(){
        return this.fila;
    } //devuelve el numero de filas de la matriz

    @Override
    public String toString() {
        return "MatrizGenerica{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
