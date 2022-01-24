import java.io.*;
import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i=1; scan.hasNext() ; System.out.println(i++ +" "+scan.nextLine()));
    }
}
