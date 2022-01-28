import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sc.close();

        sentence = sentence.trim();

        if(sentence.length()==0){
            System.out.println(0);
        }
        else
        {
            String [] words = sentence.split("[ !,?._'@]+");

            System.out.println(words.length);

            for(String word : words){
                System.out.println(word);
            }
        }
    }
}
