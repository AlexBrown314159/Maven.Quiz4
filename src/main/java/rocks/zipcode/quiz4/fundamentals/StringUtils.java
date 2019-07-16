package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String myStr = "";
        int i = str.length()/2;
        int k = str.length()/2 + 1;
        myStr = str.substring(0, i);
        myStr = myStr + str.substring(i, k).toUpperCase();
        myStr = myStr + str.substring(k);
        return myStr;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String myStr = "";
        int i = str.length()/2;
        int k = str.length()/2 + 1;
        myStr = str.substring(0, i);
        myStr = myStr + str.substring(i, k).toLowerCase();
        myStr = myStr + str.substring(k);
        return myStr;
    }

    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == str.charAt(i+1)) {
                    return true;
                }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String myStr = "";

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                i = i + 1;
            }
            else {
               myStr = myStr + str.substring(i, i+1);
            }
        }
        myStr = myStr + str.substring(str.length()-1, str.length());
        System.out.println(myStr);
        return myStr;
    }

    public static String invertCasing(String str) {
        String myStr = "";
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i+1);
            if (s.matches(".*[a-z].*")) {
                    s = s.toUpperCase();
                    }
            else if (s.matches(".*[A-Z].*")) {
                    s = s.toLowerCase();
            }
            myStr = myStr + s;
        }
        return myStr;
    }
}