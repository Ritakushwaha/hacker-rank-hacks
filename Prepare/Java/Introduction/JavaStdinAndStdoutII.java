import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String [] args) {
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();
        
        System.out.println("String: "+c);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);

    }
}
