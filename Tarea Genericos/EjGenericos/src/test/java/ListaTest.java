import org.example.ListaOrdenada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ListaTest {

    @Test
    public void testListaOrdenada() { //Comprobamos que añade y ordena correctamente (set y get OK)
        ListaOrdenada<Integer> listaInt = new ListaOrdenada<>();
        listaInt.add(1); //[1] Los elementos se insertan al final pero se ordenan para formar un orden de menor a mayor.
        listaInt.add(0);//[0,1]
        listaInt.add(-1); //[-1,0,1]
        assertEquals(-1,listaInt.get(0));
    }

    @Test
    public void testListaVacia0() { //Comprobamos que al inicializar la lista vacia el tamaño es 0
        ListaOrdenada<Integer> listaInt = new ListaOrdenada<>();
        assertEquals(0,listaInt.size());
    }

    @Test
    public void tamañoOk() { //Comprobamos que como hemos insertado, la lista tiene un tamaño 3
        ListaOrdenada<Integer> listaInt = new ListaOrdenada<>();
        listaInt.add(1); //[1]
        listaInt.add(0);//[0,1]
        listaInt.add(-1); //[-1,0,1]
        assertEquals(3,listaInt.size());
    }

    @Test
    public void eliminarElemento(){ //Probamos que devuelva true o false si el elemento existe o no en la lista
        ListaOrdenada<Integer> listaInt = new ListaOrdenada<>();
        listaInt.add(1); //[1]
        listaInt.add(0);//[0,1]
        assertTrue(listaInt.remove(1));
        assertFalse(listaInt.remove(-1));
    }

    @Test
    public void buscarIndiceSiEsCorrectoOIncorrecto(){
        ListaOrdenada<Integer> listaInt = new ListaOrdenada<>();
        listaInt.add(1); //[1]
        listaInt.add(0);//[0,1]
        listaInt.add(3); //[-1,0,1]
        assertEquals(2,listaInt.indexOf(3));
        assertEquals(-1,listaInt.indexOf(5));
    }

}
