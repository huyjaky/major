import java.util.regex.Pattern;


public class App {
    public static void main(String[] args) throws Exception {
        Pattern regex = Pattern.compile("^[0-255]{1}.*[0-255]{1}.*[0-255]{1}.*[0-255]{1}$");
        String s = "000.12.12.034" ;
        if (regex.matcher(s).find()) {
            System.out.println(s);

        }
        
    }
}
