import comp7700.assignment2.Finder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author melanasmith
 */
public class FinderJUnitTest {
    
    @Test
    public void test_ValidMaxArray() {
        Finder finder = new Finder();
        int[] intArray = new int[]{ 1,2,3,4,5,6 };
        
        int result = finder.findMax(intArray);
        assertEquals(6, result);
    }
    
    @Test
    public void test_ValidMinArray() {
        Finder finder = new Finder();
        int[] intArray = new int[]{ 1,2,3,4,5,6 };
        
        int result = finder.findMin(intArray);
        assertEquals(1, result);
    }
    
    @Test
    public void test_EmptyMaxArray() {
        Finder finder = new Finder();
        int[] intArray = new int[0];
        
        assertEquals(null, finder.findMax(intArray));
    }
    
    @Test
    public void test_EmptyMinArray() {
        Finder finder = new Finder();
        int[] intArray = new int[0];
        
        assertEquals(null, finder.findMin(intArray));
    }
    
    @Test
    public void test_NullMaxArray() {
        Finder finder = new Finder();
        int[] intArray = null;
        
        assertEquals(null, finder.findMax(intArray));
    }
    
    @Test
    public void test_NullMinArray() {
        Finder finder = new Finder();
        int[] intArray = null;
        
        assertEquals(null, finder.findMin(intArray));
    }
    
}
