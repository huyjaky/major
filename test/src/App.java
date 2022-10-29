import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


public class App {
    private Integer number1 = 1;
    private Integer number = 1;

    public static Integer loop (Integer number1, Integer number2) {
        if (number2 > 100) {
            return number1;
        }
        Integer temp = number2;
        number2 += number1;
        number1 = temp;
        System.out.println(number1);
        return loop(number1, number2);
    }
    
    
    public static void main(String[] args) throws Exception {
        // Scanner input = new Scanner(System.in);
        // String str = input.nextLine();
        // input.close();
        // Pattern regex = Pattern.compile(".*"+str+".*");
        // String[] array = {"phan duc huy", "pham gia bao"};
        // for (String i : array) {
        //     if (regex.matcher(i).find()) {
        //         System.out.println(i);
        //         System.out.println(i.lastIndexOf(" "));
        //     }
        // }
        // System.out.println("script for present java history".toUpperCase());
        // Pattern regex = Pattern.compile("^[a-zA-Z0-9]+[@][a-z.]+[.][a-z]$");
        // String s = "bd@tnmbonlinejk.SDF.SDF.com";
        // System.out.println(s);
        // if (regex.matcher(s).find()) {
        //     System.out.println(s);
        // }
        // String s = "CR	gm@cr.railnet.gov.in	Mumbai	drm@bb.railnet.gov.in";
        // String [] array = s.split("[]");
        // System.out.println(Arrays.toString(array));
        // String s = "256";
        // Pattern regex = Pattern.compile("[0-9]{1}", Pattern.CASE_INSENSITIVE);
        // if (regex.matcher(s).find()) {
        //     System.out.println(s);
        // }
        // System.out.println("vl chim en");
        // System.out.println("vailol luon dau cat moi");
        MYELT
    }
}
