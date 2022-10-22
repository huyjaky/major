public class SinhVien {
    private String hoten;
    private String lop;
    private Double diemTB;
    
    public SinhVien(String hoten, String lop, Double diemTB) {
        this.hoten = hoten;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien [hoten=" + hoten + ", lop=" + lop + ", diemTB=" + diemTB + "]";
    }

    public Double getDiemTB() {
        return diemTB;
    }

    

    
}
