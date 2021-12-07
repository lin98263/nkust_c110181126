import java.util.HashSet;
import java.util.ArrayList;

public class HashNum {
    public static void main(String[] args) {
        ArrayList<String> word1 = new ArrayList<String>();
        ArrayList<Character> word = new ArrayList<Character>();
        HashSet<String> num = new HashSet<String>();

        int b;
        String[] num1 = {"0" , "0", "1" , "1" , "1" , "2" , "2" , "3" , "3" , "4" };

        for(int d = 0; d < num1.length; d++){
            num.add(num1[d]);

        }

        for(String aa : num){
            word1.add(aa);
        }

        b =num1.length - word1.size();

        for(int c = 0; c < b; c++){
            word1.add("_");
        }
        System.out.println(word1);
    }

}