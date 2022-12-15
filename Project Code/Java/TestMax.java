import static org.junit.Assert.*;   
import org.junit.Test;  
  
public class TestMax{  
  
    @Test  
    public void testgetMax(){  
        assertEquals(4,Calculate.getMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculate.getMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  