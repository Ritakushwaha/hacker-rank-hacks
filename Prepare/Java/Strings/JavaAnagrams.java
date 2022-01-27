import java.util.*;
import java.util.HashMap;

public class JavaAnagrams {

    public static HashMap<Character,Integer>  getCharOccurence(String s1){
        int length = s1.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<length; i++){
            int cnt=1;
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),cnt+1);
            }
            else{
                map.put(s1.charAt(i), cnt);
            } 
        }
        return map;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        sc.close();
  
        try{
            if( a == null || b == null || a.equals("") || b.equals("")){
                throw new IllegalArgumentException();
            }
            if ( a.length() != b.length()){
                System.out.println("Not Anagrams");
            }
            else{
                HashMap<Character,Integer> a_1 = getCharOccurence(a);
                HashMap<Character,Integer> b_1 = getCharOccurence(b);
    
                if(a_1.equals(b_1)){
                    System.out.println("Anagrams");
                }else{
                    System.out.println("Not Anagrams");
                }
            }
        }
        catch(IllegalArgumentException i){
            System.exit(0);
        }
    }
}

