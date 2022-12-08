import java.util.Scanner;

public class App {
    public static boolean check(String right_s, String left_s) {
        String temp = "";
        String[] array = left_s.split("");
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
            array[i] = null;
        }
        if (temp.equals(right_s)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean check_palindrome (String s) {
        Integer mid_num = s.length()/2;   
        if (s.length() % 2 !=0) {
            String right_s = s.substring(0, mid_num);
            String left_s = s.substring(mid_num + 1, s.length());
            if (check(right_s, left_s)) {
                return true;
            } else {
                return false;
            }
        } else {
            String right_s = s.substring(0, mid_num);
            String left_s = s.substring(mid_num, s.length());
            if (check(right_s, left_s)) {
                return true;
            } else {
                return false;
            }
        }

    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(check_palindrome(s));
        input.close();
    }
}
