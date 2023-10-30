public class Equal_half_strings {
    public static void main(String[] args) {
        String s="Uo";
        int a=0;
        int b=0;

        int mid=s.length()/2;

        s.toLowerCase();

        for(int i=0;i<mid;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                a++;
            }
        }
        for(int i=mid;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                b++;
            }
        }

        if(a==b){
            System.out.println("true");
        }else {
            System.out.println("False");
        }



    }
}
