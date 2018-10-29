import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        String phrase = "Happy";
        String result = "";
        
        result = reverse(phrase);
        System.out.println(result);
    }
    
    public static String reverse (String phrase) {
        String result = "";
        for(int i = 0; i < phrase.length(); i++) {
            result = phrase.charAt(i) + result;
        }
        return result;
    }
}