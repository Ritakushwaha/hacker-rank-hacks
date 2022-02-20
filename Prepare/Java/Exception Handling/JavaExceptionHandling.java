import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MyCalculator mc = new MyCalculator(a,b);
        System.out.println(mc.power(a, b));
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