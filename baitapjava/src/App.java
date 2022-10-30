import java.util.Arrays;
import java.util.Scanner;

public class App {
    static void menu() {
        System.out.println("1. nhap");
        System.out.println("2. xuat");
        System.out.println("3. sap xep");
        System.out.println("4. xuat ra danh sach sinh vien gioi");
        System.out.println("5. thoat");
    }
    
    public static void main(String[] args) throws Exception {
        SinhVien [] danh_sach_SV = new SinhVien[50];
        Scanner input = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("---------------------------------------------");
            System.out.print("nhap lua chon: "); Integer lua_chon = input.nextInt();
            if (lua_chon == 5) break;
            switch (lua_chon) {
                case 1:
                    System.out.print("nhap so luong sinh vien can nhap (luu y phai be hon 50): ");
                    Integer n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        String space = input.nextLine();
                        System.out.print("nhap ho va ten: "); String hoTen = input.nextLine();
                        System.out.print("nhap diem java: "); Double java = input.nextDouble();
                        System.out.print("nhap diem c: "); Double c = input.nextDouble();
                        SinhVien sinhVien = new SinhVien(hoTen, c, java);
                        danh_sach_SV[i] = sinhVien;
                    }
                    break;
                case 2:
                    for (SinhVien sinhVien : danh_sach_SV) {
                        if (sinhVien == null) {
                            break;
                        } else {
                            System.out.println(sinhVien.xuat());
                        }
                    }
                    break;
                case 3:
                    try {
                        for (int i = 0; i < danh_sach_SV.length; i++) {
                        if (danh_sach_SV[i] == null) break;
                        for (int j = i; j < danh_sach_SV.length; j++) {
                            if (danh_sach_SV[i].getDiemTB() < danh_sach_SV[j].getDiemTB()) {
                                SinhVien temp = danh_sach_SV[i];
                                danh_sach_SV[i] = danh_sach_SV[j];
                                danh_sach_SV[j] = temp;
                            }
                        }
                    }
                    } catch (Exception e) {
                        // TODO: handle exception
                        break;
                    }
                    break;
                case 4:
                    try {
                        for (SinhVien sinhVien : danh_sach_SV) {
                        if (sinhVien.getHocLuc().equals("Gioi")) {
                            System.out.println(sinhVien.xuat());
                        }
                    }
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    break;
                default:
                    break;
            }
            System.out.println("---------------------------------------------");
        }
        input.close();
    }
}
