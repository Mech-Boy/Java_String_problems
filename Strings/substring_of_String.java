public class substring_of_String {
    public static void main(String[] args) {
        String word="abc";
      String[]  patterns = {"a", "abc", "bc", "d"};

        int a=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                a++;
            }
        }
        System.out.println(a);
    }
}
