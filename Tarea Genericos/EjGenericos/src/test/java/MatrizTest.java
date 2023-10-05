import org.example.MatrizGenerica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MatrizTest {

    @Test
    public void numColumnasYFilasOK() { //Probamos que nuestras columnas y filas son correctas y el metodo que las saca también
        MatrizGenerica<String> m = new MatrizGenerica<>(3,4);
        assertEquals(4,m.columnas());
        assertEquals(3,m.filas());
    }

    @Test
    public void matrizCreadaEstaVacia() { //Comprobamos que al crear una matriz a la que no le pasamos nada se crea vacia con Null
        MatrizGenerica<String> m = new MatrizGenerica<>(3,4);
        assertNull(m.get(0, 0));
        assertNull(m.get(1, 1));
    }

    @Test
    public void setYgetFuncionan() { //Podemos colocar y sacar datos correctamente
        MatrizGenerica<String> m = new MatrizGenerica<>(3,4);
        m.set(1,1,"Hola");
        assertEquals("Hola",m.get(1,1));
    }


}
