import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i = 0;
        if (leap >= game.length) {
            return true;
        }
        while (i < game.length) {
            if (i + leap < game.length-1 && game[i + leap] == 0) {
                i += leap;
                continue;
            } else if (game [i + 1] == 0 && i + 1 < game.length-1) {
                i++;
                continue;
            } else if (i + leap >= game.length-1 || i + 1 >= game.length-1) {
                return true; 
            } else {
                return false; // bai hoc dau doi ve vim 
            }
        }
        return false;

    }

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();            
            int[] game = new int[n]; 
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt(); 
            } 


            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}