import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt();
        String space = input.nextLine();
        TreeSet <String> list = new TreeSet<>();
        
        for (int i = 0; i < count; i++) {
            String s = input.nextLine();
            String[] array = s.split("[\\s]");
            Pattern regex = Pattern.compile("[a-zA-Z0-9]+[@][a-z]+[.][a-z]");
            for (String a : array) {
                if (regex.matcher(a).find()) {
                    a = a.replaceAll("[^a-zA-Z0-9]$", "");
                    list.add(a);
                }
            }
        }
        String s = "";
        for (String i : list) {
            s += i + ";";
        }
        list.clear();
        System.out.println(s.replaceAll("[;]$", ""));
        input.close();
    }
}