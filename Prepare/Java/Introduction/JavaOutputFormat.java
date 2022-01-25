/*

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================

*/

import java.util.Scanner;

public class JavaOutputFormat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(x<100){
                if(x<10){
                    String s_x = "00"+x; 
                    System.out.printf("%-15s%s%n", s1,s_x);
                }else{
                String s_x = "0"+x; 
                System.out.printf("%-15s%s%n", s1,s_x);
                }
            }
            else{
                System.out.printf("%-15s%s%n", s1,x);
            }
        }
        sc.close();
        System.out.println("================================");
    }
}
