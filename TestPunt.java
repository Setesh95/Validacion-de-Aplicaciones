import com.sun.istack.internal.Nullable;
import org.junit.*;
import sun.security.action.PutAllAction;

import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt(1,1);
        assertEquals(1,p.getX());
        assertEquals(1,p.getY());
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt(0,0);
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    @Test
    public void testSet(){
        Punt p = new Punt(0,0);
        p.setX(3);
        p.setY(4);
        assertEquals(3, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(4, p.getY());
    }

    @Test
    public void testSuma(){
        Punt p1= new Punt(2,2);
        Punt p2= new Punt(3,3);
        p1.suma(p2);
        assertEquals(5,p1.getX());
        assertEquals(5,p1.getY());

    }
    @Test(expected = IllegalArgumentException.class)
    public void TestExcepciones(){
        Punt p1 = new Punt(-3,-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestExcepcionesSetY(){
        Punt p1 = new Punt(3,4);
        p1.setY(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestExcepcionesSetX(){
        Punt p1 = new Punt(3,4);
        p1.setX(-3);
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}
