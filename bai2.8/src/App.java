import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Integer day = input.nextInt();
        input.close();
        
        Integer years = 0;
        Integer months = 0;
        Integer days = 0;
        while (true) {
            if (day > 365) {
                years += 1;
                day -= 365;
            } else if (day < 365 && day >= 30) {
                months += 1;
                day -= 30;
            } else if (day < 30) {
                days = day;
                break;
            }
        }
        System.out.printf("%d \n%d \n%d", years, months, days);
    }
}
