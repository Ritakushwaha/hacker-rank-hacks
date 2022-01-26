import java.util.*;

public class JavaStringsIntroduction {

    public static String capitalize(String str)
    {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int s_len;
        sc.close();
        s_len = A.length()+B.length();
        System.out.println(s_len);
        if(A.compareTo(B)<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        System.out.println(capitalize(A)+" "+capitalize(B));
    }
}