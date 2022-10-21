import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        Pattern regex = Pattern.compile(".*hackerrank.*");
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        String[] array = S.split(" ");
        Integer count = 0;
        for (String i : array) {
            if (regex.matcher(i).find()) {
                count += 1;
            }
        }
        System.out.println("Number of matches : "+count);
    }
}
