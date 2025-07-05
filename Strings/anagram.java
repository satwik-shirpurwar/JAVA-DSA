import java.util.Arrays;

public class anagram {
    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Step 3: Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
