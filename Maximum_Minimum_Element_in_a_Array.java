import java.util.Scanner;
public class Maximum_Minimum_Element_in_a_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");   
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array:");   
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        
        //to find the maximum & minimum element from the array
        int max = arr[0]; int maxIndex = 0;
        int min = arr[0]; int minIndex = 0;
        for (int i = 1; i < size; i++) {
                     if (arr[i] > max) {
                         max = arr[i];
                         maxIndex = i;
                     }
                     if (arr[i] < min) {
                         min = arr[i];
                         minIndex = i;
                     }
                 }
         System.out.println("Maximum element: " + max + " at index " + maxIndex);
         System.out.println("Minimum element: " + min + " at index " + minIndex);
             }
         }
         