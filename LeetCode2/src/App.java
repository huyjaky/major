class App {
    public static int climbStairs(int n) {
        if (n == 2) {
            return 2;
        }
        Integer num = n - 1; 
        Integer count = 1;
        do {
            count += num;
            num -= 2;
        } while (num >= 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4)); 
    }
}
