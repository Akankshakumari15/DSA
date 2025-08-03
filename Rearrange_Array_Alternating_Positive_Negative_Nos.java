import java.util.*;
public class Rearrange_Array_Alternating_Positive_Negative_Nos {
       public static void rearrange(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

       // Separate positive and negative numbers
        for (int i=0; i<arr.length;i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        int i = 0, p = 0, n = 0;
        // Alternate placement of negative and positive numbers
        while (p < positive.size() && n < negative.size()) {
            arr[i++] = negative.get(n++);
            arr[i++] = positive.get(p++);
        }

        // Copy remaining elements (if any)
        while (n < negative.size()) {
            arr[i++] = negative.get(n++);
        }
        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, -4, -1, 4, -5, -2,7};
        rearrange(arr);
        System.out.println("Rearranged array:");
        System.out.println(Arrays.toString(arr));
    }
}


