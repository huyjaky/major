import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.print.DocFlavor.STRING;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Integer count = input.nextInt();
        String space = input.nextLine();
        TreeSet <String> list = new TreeSet<>();
        
        for (int i = 0; i < count; i++) {
            String s = input.nextLine();
            String[] array = s.split(" ");
            Pattern regex = Pattern.compile("[a-zA-Z0-9]+[@][a-z]+[.][a-z]");
            for (String a : array) {
                if (regex.matcher(a).find()) {
                    a = a.replaceAll("[.]$", "");
                    list.add(a);
                }
            }
        }
        String s = "";
        for (String i : list) {
            s += i + ";";
        }
        System.out.println(s.replaceAll("[;]$", ""));
        input.close();
    }
}