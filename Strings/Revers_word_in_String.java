import java.util.Arrays;

public class Revers_word_in_String {
    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        StringBuilder sb=new StringBuilder();
        String[] words = s.split(" ");

        for(String str:words){
            sb.append(new StringBuilder(str).reverse()).append(" ");
        }
        System.out.println(sb.toString().trim());



    }
}
