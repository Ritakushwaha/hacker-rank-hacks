/**
 * Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
 */

import java.util.*;
import java.util.regex.*;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int testCases = sc.nextInt();
            for(int i=0; i<testCases;i++){
                String username = sc.next();
                if(Pattern.matches("^[a-zA-Z][0-9_|a-zA-Z]{7,29}$", username)){
                    System.out.println("Valid");
                }else{
                    System.out.println("Invalid");
                }
            }
        }catch(InputMismatchException i){
            System.out.println("First input should be integer.");
        }finally{
            sc.close();
        }
    }
}
