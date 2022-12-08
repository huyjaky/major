public class App {
    public static void main(String[] args) throws Exception {
        SinhVienBA svba1 = new SinhVienBA("a", "22BA", "21BA", 6.0, 5d);
        SinhVienBA svba2 = new SinhVienBA("b", "22BA", "22BA", 8d, 9d);
        SinhVienBA svba3 = new SinhVienBA("c", "22BA", "22BA", 7d, 7d);

        SinhVienIT svit1 = new SinhVienIT("a", "22IT", "22IT", 8d, 9d);
        SinhVienIT svit2 = new SinhVienIT("b", "22IT", "22IT", 7d, 7d);
        SinhVienIT svit3 = new SinhVienIT("a", "22IT", "22IT", 5d, 4d);

        danhsachSV dSv = new danhsachSV();
        dSv.add_Sv_Ba(svba1); dSv.add_Sv_Ba(svba2); dSv.add_Sv_Ba(svba3);
        dSv.add_Sv_It(svit1); dSv.add_Sv_It(svit2); dSv.add_Sv_It(svit3);

        dSv.ds_sv_gioi();
    }
}
