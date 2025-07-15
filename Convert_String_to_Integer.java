import java.util.Scanner;

public class Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        sc.close();
        
        
        //String str = "atoi";
        int n=0;
        for (int i = 0; i < str.length(); i++) {
            n=n*10+(str.charAt(i)-'0');
        }
        System.out.println(n);
    }
}

