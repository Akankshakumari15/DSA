public class Longest_Common_Prefix {
     public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        String common_prefix = findLongestCommonPrefix(str);
        System.out.println("Longest Common Prefix: " + common_prefix);
    }

    static String findLongestCommonPrefix(String[] str) {
        if (str == null || str.length == 0)
            return " ";

        String prefix = str[0]; // Assume first string is the common prefix

        for (int i = 1; i < str.length; i++) {
            int j = 0;
            // Compare characters of prefix and current string
            while (j < prefix.length() && j < str[i].length()
                    && prefix.charAt(j) == str[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j); // Update prefix

            // If at any point the prefix becomes empty, return 
            if (prefix.isEmpty())
                return "";
        }
      return prefix;
    }
}

