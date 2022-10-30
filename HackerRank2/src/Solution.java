<<<<<<< HEAD
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
=======
    import java.util.*;

    public class Solution {

        public static boolean canWin(int leap, int[] game, Integer i) {
            // Return true if you can win the game; otherwise, return false.
            

            try {
                            try {
                if (game[i+leap] == 0) {
                    i += leap;
                } else if (game[i+1] == 0) {
                    i += 1;
                } 
            } catch (Exception e) {
                // TODO: handle exception
                return true;
            }
            if (i > game.length) {
                return true;
            } if (game[i+1] != 0 && (i+leap) == 1) {
                return false;
            }
            } catch (Exception e) {
                // TODO: handle exception
                return false;
            }
            return canWin(leap, game, i);

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

                System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
            }
            scan.close();
        }
    }
>>>>>>> 2a251de79769947fd95296280542e849716d1bbf
