import java.util.Scanner;
public class Occurrence_of_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean counted = false;

            // Check if the element has already been counted
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    counted = true;
                    break;
                }
            }
            if (counted) {
                continue;
            }
           // Count occurrences of arr[i]
            for (int p = 0; p < arr.length; p++) {
                if (arr[p] == arr[i]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurred " + count + " times.");
        }
    }
}
