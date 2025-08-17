import java.util.HashSet;

public class To_Find_Duplicates_in_Array_using_Hashset {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 4, 82, 2, 9, 0,82};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (!seen.add(num)) {
                  // If add returns false, it means the number was already in the set
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements in the array:");

       
        Integer[] dupArray = duplicates.toArray(new Integer[0]);
        for (int i = 0; i < dupArray.length; i++) {
            System.out.println(dupArray[i]);
        }
    }
}


