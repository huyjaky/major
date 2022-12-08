import javax.swing.text.html.HTMLDocument.RunElement;

class App {
    public int climbStairs(int n) {
        Integer n1 = 1, n2 = 2, sum = 3;
        for (int i = 0; i < n; i++) {
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
        }
        return n1;
    }
}