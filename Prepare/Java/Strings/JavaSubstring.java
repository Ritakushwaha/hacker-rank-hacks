import java.util.*;

public class JavaSubstring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        int [] arr = new int[2];

        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(A.substring(arr[0],arr[1]));
        sc.close();
    }
}
