// HackerRank https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=false&h_r=next-challenge&h_v=zen

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    
    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */


    public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        Double sum1 = (double) x1;
        Double sum2 = (double) x2;
        if ((x1 < x2 && v1 <= v2) || v1 == v2) {
            return "NO";
        } 
        while (true) {
            if (Math.abs(sum1 - sum2) == 0) {
                return "YES";
            } else if (Math.abs(sum1 - sum2) <= Math.abs((sum1+v1) - (sum2+v2))) {
                return "NO";
            }
            sum1 += v1;
            sum2 += v2;
        }
        
    }
}

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
