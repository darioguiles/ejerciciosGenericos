
import org.example.PilaGenerica;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
public class PilaTest {

    @Test
    public void elementoAniadidoOk() {
        PilaGenerica<Integer> pila = new PilaGenerica<>();
        pila.aniadir(5);
        pila.aniadir(10);
        assertEquals(10, pila.primero()); // [->10,5]
    }

    @Test
    public void listaSiVacia() {
        PilaGenerica<Integer> pila = new PilaGenerica<>();
        assertTrue(pila.estaVacia());
    }

    @Test
    public void pilaPrimeroOk() {
        PilaGenerica<Integer> pila = new PilaGenerica<>();
        pila.aniadir(10);
        pila.aniadir(5); //[5,10]
        assertEquals(5, pila.primero()); //[->5,10]
    }

    @Test
    public void extraerFunciona() {
        PilaGenerica<Integer> pila = new PilaGenerica<>();
        pila.aniadir(10);
        pila.aniadir(5); //[3,5,10]
        pila.aniadir(3);
        assertEquals(10, pila.extraer()); //->10 [3,5]
    }

}
