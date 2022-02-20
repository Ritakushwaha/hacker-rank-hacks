import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        MyCalculator mc = new MyCalculator(a,b);
        try {
            System.out.println(mc.power(a, b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class MyCalculator{
    int n,p;
    public MyCalculator(int a, int b) {
        this.n = a;
        this.p = b;
    }

    long power(int n, int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }else if(n==0 || p==0){
            throw new Exception("n or p should n be zero.");
        }else{
            return (long) Math.pow(n, p);
        }
    }
}