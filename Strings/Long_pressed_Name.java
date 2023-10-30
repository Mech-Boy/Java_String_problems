public class Long_pressed_Name {
    public static void main(String[] args) {
        String name="aleex";

        String typed = "aaleex";
        char rem=' ';
         int temp=0;
         int camp=0;
        for (int i = 0; i <=name.length()-1; i++) {
            rem=name.charAt(i);
            if(i!= name.length()-1 &&rem==name.charAt(i+1)){
                camp++;
            }
            for (int j = 0; j <= typed.length()-1; j++) {
                if(rem==typed.charAt(j)){
                    temp++;
                }
            }
            if(temp>0&& temp>camp){
                temp=0;
            }else {
                System.out.println("Not my name !");
                break;
            }
        }

        System.out.println("That's my name");
    }
}
