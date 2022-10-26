import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        quanlySinhVien list = new quanlySinhVien();
        while (true) {
            System.out.println("--------------------------------------------");
            System.out.println("1. nhap thong tin sinh vien" + "\n" +
                                "2. in ra danh sanh sinh vien" + "\n" + 
                                "3. in ra sinh vien co diem so cao nhat");
            System.out.println("--------------------------------------------");
            System.out.print("nhap lua chon: "); Integer choice = input.nextInt();
            switch (choice) {
                case 1:
                    String space = input.nextLine();
                    System.out.print("nhap ho va ten: "); String hoten = input.nextLine();
                    System.out.print("nhap lop: "); String lop = input.next();
                    System.out.print("nhap diem TB: "); Double diemTB = input.nextDouble();
                    SinhVien sinhvien = new SinhVien(hoten, lop, diemTB);
                    list.add_sv(sinhvien);
                    break;
                case 2:
                    list.in_danhsach();
                    break;
                case 3:
                    System.out.println(list.diem_cao_nhat());
                    break;
                default:
                    input.close();
                    return;
            }
        }
    }
}
