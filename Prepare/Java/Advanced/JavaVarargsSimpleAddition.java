import java.io.*;
import java.util.*;


class Add {
    public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";            
        }
        System.out.println("=" + sum);
    }
}

public class JavaVarargsSimpleAddition {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int n5=sc.nextInt();
        int n6=sc.nextInt();
        Add ob=new Add();
        ob.add(n1,n2);
        ob.add(n1,n2,n3);
        ob.add(n1,n2,n3,n4,n5); 
        ob.add(n1,n2,n3,n4,n5,n6);
        sc.close();
    }
}
