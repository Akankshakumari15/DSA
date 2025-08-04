import java.util.Scanner;
public class Reverse_an_array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array:");
       int size  = sc.nextInt();
       int [] arr = new int[size];
       System.out.println("Enter elements of array:");
            for(int i=0;i<=size-1;i++){
            arr[i]= sc.nextInt();
           }
       sc.close();
        int left=0;int right = size-1;
        while(left<right){
        //swapping of the elements in place
        int temp =arr[left];
        arr[left]=arr[right];
        arr[right]= temp;
        left++;
        right--;
        }
        System.out.println("The reversed array is:");
        for(int k = 0 ; k<arr.length;k++){
            System.out.print(arr[k]);
            if(k<arr.length-1){
                System.out.print(" ");
            }
        } 
        System.out.println();
    }
}
