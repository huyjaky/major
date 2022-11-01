import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{
    public String pattern = "[0-2][0-5][0-5]|[0-9]{2}|[0-9]";
}

