import java.util.Arrays;
import java.util.Scanner;
public class To_Find_Missing_No_In_Array {
    public static int findMissingElement(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Not enough elements to determine a missing number
        }
         // Sort the array to ensure it's in ascending order
        Arrays.sort(arr);
         // Check for missing number between consecutive elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1; // Missing number found
            }
        }
        // If no missing number in between, check for the next number
        return arr[arr.length - 1] + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int missingNumber = findMissingElement(arr);
        if (missingNumber == -1) {
            System.out.println("No missing number found.");
        } else {
            System.out.println("The missing number is: " + missingNumber);
        }
    }
}
