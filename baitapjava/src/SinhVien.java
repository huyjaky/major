public class SinhVien {
    private String hoTen;
    private Double c, java, diemTB;
    private String hocLuc;
    
    
    public SinhVien(String hoTen, Double c, Double java) {
        this.hoTen = hoTen;
        this.c = c;
        this.java = java;
        this.diemTB = (this.c + this.java)/2;
        if (this.diemTB > 6 && this.diemTB <= 8) {
            this.hocLuc = "Kha";
        } else if (this.diemTB <= 6) {
            this.hocLuc = "Yeu";
        } else if (this.diemTB > 8) {
            this.hocLuc = "Gioi";
        }
    }


    public Double getDiemTB() {
        return diemTB;
    }


    public String getHocLuc() {
        return hocLuc;
    }


    public String xuat() {
        return "Sinh Vien: " + this.hoTen + " |" + this.c + " |" + this.java + " |" + this.diemTB + " |" + this.hocLuc; 
    }
    

}
