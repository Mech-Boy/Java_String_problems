public class Excel_sheet_column_title {
    public static void main(String[] args) {
        int i=702;
        StringBuilder ans=new StringBuilder();
        char j=' ';
        char k=' ';

        int temp=0;
        if (i<=26) {
            j = (char) (i + 64);
            ans.append(j);
        }else {
            while (i > 0) {

                int x=i%26;
                if(x==0){
                    ans.append('Z');
                    i--;
                }
                else{
                    ans.append((char)('A'+x-1));
                }
                i/=26;
            }

        }
        System.out.println( ans.reverse().toString());
    }
}
