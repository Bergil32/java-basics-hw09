import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> matches = new ArrayList<>();

        array1 = Arrays.stream(array1).distinct().toArray(String[]::new);
        array2 = Arrays.stream(array2).distinct().toArray(String[]::new);

        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s1.equals(s2)) {
                    matches.add(s1);
                    break;
                }
            }

        }

        return matches.toArray(new String[0]);
    }
}
