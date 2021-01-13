import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {

        Set<String> set1 = new HashSet<>(Arrays.asList(array1));
        Set<String> set2 = new HashSet<>(Arrays.asList(array2));

        set1.retainAll(set2);

        return set1.toArray(new String[0]);
    }
}
