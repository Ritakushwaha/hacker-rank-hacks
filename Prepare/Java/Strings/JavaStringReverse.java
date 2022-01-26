import java.util.*;

public class JavaStringReverse {

    public static boolean isPalindrome(String str){
 
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        if(str.equals(input1.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(A.length()<=50){
            if(isPalindrome(A)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
