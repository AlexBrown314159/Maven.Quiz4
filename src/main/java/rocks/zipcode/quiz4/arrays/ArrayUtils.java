package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int i = values.length / 2;
        return values[i];
    }

    public static String[] removeMiddleElement(String[] values) {
        int len = values.length;
        String[] str = new String[len-1];
        int icount = 0;
        for (int i = 0; i < len; i++) {
            if (i == len/2) {

            }
            else {
                str[icount] = values[i];
                icount++;
            }
        }
        return str;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        int len = values.length;
        String[] str = new String[len-1];

        for (int i = 0; i < len-1; i++) {
        str[i] = values[i];
        }

        return str;
    }
}