import java.util.Scanner;

/**
 * 
 * Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
 * 
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

static boolean flag = true; 
static int B,H;

static{
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    scan.nextLine();
    H = scan.nextInt();
    scan.close();
    try{
        if(B<=0 || H<=0){
            flag=false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }
}

public static void main(String[] args){
    if(flag){
      int area=B*H;
      System.out.print(area);
    }
    
  }//end of main

}//end of class
