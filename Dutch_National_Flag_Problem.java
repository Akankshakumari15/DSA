//sorting_of_array_consisting_three_colours:red(0's)white(1's)blue(2's)
public class Dutch_National_Flag_Problem {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 2, 0, 0, 1, 1};
        // Dutch National Flag Algorithm
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++; mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("\nAfter sorting: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
            if (k < arr.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
