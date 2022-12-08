public class SinhVienvku {
    private String ten, maSV, lop, hocluc;
    public Double diemTB;
    public SinhVienvku(String ten, String maSV, String lop) {
        this.ten = ten;
        this.maSV = maSV;
        this.lop = lop;
        if ( this.diemTB > 6 && this.diemTB < 8) {
            this.hocluc = "kha";
        } else if ( this.diemTB <= 6) {
            this.hocluc = "yeu";
        } else if (this.diemTB >= 8 && this.diemTB <= 10) {
            this.hocluc = "gioi";
        }
    }
    public String getTen() {
        return ten;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getLop() {
        return lop;
    }
    public String getHocluc() {
        return hocluc;
    }
    public Double getDiemTB() {
        return diemTB;
    }
    public String toStringvku() {
        return "ten=" + ten + ", maSV=" + maSV + ", lop=" + lop + ", hocluc=" + hocluc + ", diemTB="
                + diemTB;
    }
}
