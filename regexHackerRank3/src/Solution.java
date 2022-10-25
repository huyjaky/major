import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt();
        
        for (int i = 0; i < count; i++) {
            String s = input.nextLine();
            String[] array = s.split(" ");
            Pattern regex = Pattern.compile("[a-zA-Z0-9]+[@][a-z]+[.][a-z]");
            for (String a : array) {
                if (regex.matcher(a).find()) {
                    System.out.println(a);
                }
            }
        }
        input.close();
    }
}