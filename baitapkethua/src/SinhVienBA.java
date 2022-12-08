public class SinhVienBA extends SinhVienvku {
    private Double diemMarketing, diemKeToan, diemTB;

    public SinhVienBA(String ten, String maSV, String lop, Double diemMarketing, Double diemKeToan) {
        super(ten, maSV, lop);
        this.diemMarketing = diemMarketing;
        this.diemKeToan = diemKeToan;
        diemTB = (this.diemKeToan + this.diemMarketing) / 2;
        
    }

    public Double getDiemMarketing() {
        return diemMarketing;
    }

    public Double getDiemKeToan() {
        return diemKeToan;
    }

    @Override
    public String toString() {
        return "SinhVienBA |" + toStringvku() +"diemMarketing=" + diemMarketing + ", diemKeToan=" + diemKeToan;
    }

    
}
