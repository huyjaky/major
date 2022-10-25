import java.util.Scanner;
import java.util.regex.Pattern;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here 
class MyRegex {
    String pattern = "^[0-255]{1}[.][0-255]{1}[.][0-255]{1}[.][0-255]{1}$";
}
