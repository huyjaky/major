
import java.math.BigDecimal;
import java.util.*;

class App{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) break;
            BigDecimal BD1 = new BigDecimal(s[i]);
            for (int j = i; j < s.length; j++) {
                if (s[j] == null) break;
                BigDecimal BD2 = new BigDecimal(s[j]);
                if (BD1.compareTo(BD2) == -1) { 
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    BD1 = new BigDecimal(s[i]);
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i+1] == null) break;
            BigDecimal BD1 = new BigDecimal(s[i]);
            BigDecimal BD2 = new BigDecimal(s[i+1]);
            if (s[i].contains(".") && BD1.compareTo(BD2) == 0) {
                String temp = s[i];
                s[i] = s[i+1];
                s[i+1] = temp;
            }

        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}