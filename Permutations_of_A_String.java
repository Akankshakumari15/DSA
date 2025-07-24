public class Permutations_of_A_String{

    public static void main(String[] args) {
        String str = "tap";
        System.out.println("Original String: "+str);
        permute(str, 0, str.length() - 1);
    }

    // Recursive function to generate permutations
    static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
            return;
        }

        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);           // Swap current index with loop index
            permute(str, left + 1, right);      // Recurse for the rest
            str = swap(str, left, i);           // Backtrack
        }
    }
    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}


