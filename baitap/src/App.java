import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.w3c.dom.views.DocumentView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Integer rows = input.nextInt();
        Integer cols = input.nextInt();
        if (rows < cols) {
            cols = rows;
        } else if (rows > cols) {
            rows = cols;
        }

        int[][] array = new int[rows][cols];
        for (int i = 0 ; i < rows; i++) {
            for (int a = 0; a < cols; a++) {
                array[i][a] = input.nextInt();
            }
        }

        Map<Integer, String> map_rows = new HashMap<Integer, String>();
        Map<Integer, String> map_cols = new HashMap<Integer, String>();

        int duong_cheo_chinh = 0;
        int duong_cheo_phu = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
            duong_cheo_chinh += array[i][count];
            count += 1;
            duong_cheo_phu += array[i][cols-1];
            cols -= 1;
            Integer x = 0;
            Integer y = 0;
            Integer max = 0;
            for (int a = 0; a < array[i].length; a++) {
                if (max <= array[i][a]) {
                    max = array[i][a];
                    x = i;
                    y = a;
                }
            }
            String locaeString = x+" "+y;
            map_rows.put(max, locaeString);
            
            Integer min = 99;
            Integer count2 = 0;
            for (int[] a : array) {
                if (a[i] < min ) {
                    min = a[i];
                    x = count2;
                    y = i;
                }
                count2 += 1;
            }
            locaeString = x+" "+y;
            map_cols.put(min, locaeString);
        }
        System.out.println(duong_cheo_chinh);
        
        System.out.println(duong_cheo_phu);
        
        


    }
}
//nhap vao mot mang  hai chieu co n hang va m cot 
// nhap gia tri cho mang hai chieu
// in mang hai chieu ra man hinh
// tinh tong gia tri tren duong cheo chinh
// tong gia tri tren duong cheo phu
// tim phan tu co gia tri lon nhat cua hang va nho nhat cua cot



