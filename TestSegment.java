import org.junit.*;
import static org.junit.Assert.*;

public class TestSegment {
    @Test
    public void TestConstructor(){
        Segment s1 = new Segment();
        Segment s2 = new Segment(3,4,5,6);
        assertEquals(0.0,0.0,s1.longitud());
    }
}
