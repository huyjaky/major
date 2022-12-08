public class SinhVienIT extends SinhVienvku {
    Double diemC, diemJava;
    Double diemTB;

    public SinhVienIT(String ten, String maSV, String lop, Double diemC, Double diemJava) {
        super(ten, maSV, lop);
        this.diemC = diemC;
        this.diemJava = diemJava;
        diemTB = (this.diemC + this.diemJava) / 2;
    }

    public Double getDiemC() {
        return diemC;
    }

    public Double getDiemJava() {
        return diemJava;
    }

    @Override
    public String toString() {
        return "sinhvienIT |" + toStringvku() + "diemC = " + this.diemC + " | " + "diem Java" + this.diemJava;
    }
    
 
    
}
