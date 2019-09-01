package comp7700.assignment2;

/**
 *
 * @author melanasmith
 */
public class Finder {
    
    public Integer findMax(int[] intArray) {
        if(intArray == null || intArray.length < 1) {
            return null;
        }
        else {
            int max = intArray[0];
            for(int num: intArray) {
                max = Integer.max(max, num);
            }
            
            return max;
        }
    }
    
    public Integer findMin(int[] intArray) {
        if(intArray == null || intArray.length < 1) {
            return null;
        }
        else {
            int min = intArray[0];
            for(int num: intArray) {
                min = Integer.min(min, num);
            }
            
            return min;
        }
    }
}
