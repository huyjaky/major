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
        Pattern regex = Pattern.compile("^[a-zA-Z0-9]+[@][a-z]+[.][a-z]$");
        String s = "bd@tnmbonline.com";
        if (regex.matcher(s).find()) {
            System.out.println(s);
        }
        
        
    }
}
