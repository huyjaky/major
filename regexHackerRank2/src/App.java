import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        //aPattern regex = Pattern.compile(null);
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        input.close();
        S = S.replaceAll("[^a-zA-Z]", ".");
        System.out.println(S);
    }
}
