public class Subsequence_Checker {
    public static void main(String[] args) {
        String str1 = "hello me, myself akanksha";
        String str2 = "hello";

        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            i++;
        }

        if (j == str2.length()) {
            System.out.println("Yes, it is a subsequence.");
        } else {
            System.out.println("No, it is not a subsequence.");
        }
    }
}
