import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Integer rows = input.nextInt();
        Integer cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0 ; i < rows; i++) {
            for (int a = 0; a < cols; a++) {
                array[i][a] = input.nextInt();
            }
        }
        for (int[] i : array) {
            System.out.println(i.toString());
        }
        
    }
}
//nhap vao mot mang  hai chieu co n hang va m cot 
// nhap gia tri cho mang hai chieu
// in mang hai chieu ra man hinh
// tinh tong gia tri tren duong cheo chinh
// tong gia tri tren duong cheo phu
// tim phan tu co gia tri lon nhat cua hang va nho nhat cua cot



