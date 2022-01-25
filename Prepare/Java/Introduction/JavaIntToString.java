
import java.util.*;

public class JavaIntToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String n1 = String.valueOf(n);

        if(n1.equals(Integer.toString(n))){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}