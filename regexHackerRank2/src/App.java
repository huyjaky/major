import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //aPattern regex = Pattern.compile(null);
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        input.close();
        if (S.length() != 15) {
            System.out.println("false");
            return;
        }
        String[] array = S.split("[.]");
        if (array.length == 0) {
            System.out.println("true");
            return;
        }
        Integer count = 0;
        for (String i : array) {
            if (i.length() == 3) {
                count += 1;
            }
        }
        if (count == 4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
