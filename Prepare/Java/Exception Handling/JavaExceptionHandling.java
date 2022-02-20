import java.util.Scanner;

public class JavaExceptionHandling {
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextInt()){
                int a = sc.nextInt();
                int b = sc.nextInt();
    
                MyCalculator mc = new MyCalculator();
                try {
                    System.out.println(mc.power(a, b));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            sc.close();
        }
    }
    
    class MyCalculator{
        long power(int n, int p) throws Exception{
            if(n<0 || p<0){
                throw new Exception("n or p should not be negative.");
            }else if(n==0 && p==0){
                throw new Exception("n and p should not be zero.");
            }else{
                return (long) Math.pow(n, p);
            }
        }
    }
    