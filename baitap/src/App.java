import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.views.DocumentView;

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

        int duong_cheo_chinh = 0;
        int duong_cheo_phu = 0;
        int count = 0;
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
            duong_cheo_chinh += i[count];
            count += 1;
            duong_cheo_phu += i[cols];
            cols -= 1;
        }
        System.out.println(duong_cheo_chinh);
        
    }
}
//nhap vao mot mang  hai chieu co n hang va m cot 
// nhap gia tri cho mang hai chieu
// in mang hai chieu ra man hinh
// tinh tong gia tri tren duong cheo chinh
// tong gia tri tren duong cheo phu
// tim phan tu co gia tri lon nhat cua hang va nho nhat cua cot



