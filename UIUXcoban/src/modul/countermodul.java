package modul;

import java.time.LocalDate;
import java.util.HashMap;

public class countermodul {
    public Double gia_ca = 0d;
    private HashMap <Double, LocalDate> danhsach_giaca = new HashMap<Double, LocalDate>();

    public void tong_gia_monchinh(Double gia) { //monchinh
        this.gia_ca += gia;
    }

    public void tong_gia_monphu (Double gia) {
        this.gia_ca += gia;
    }

    public void xoa_don_monchinh(Double gia) {
        this.gia_ca -= gia;
    }

    public void xoa_don_monphu (Double gia) {
        this.gia_ca -= gia;
    }

    public String inhoadon() {
        LocalDate lc = LocalDate.now();
        this.danhsach_giaca.put(this.gia_ca,lc);
        return this.gia_ca+"";
    }

    public String in_lichsu_hoadon() {
        String s = "";
        for (int i = 0; i < this.danhsach_giaca.size(); i++) {
            s += this.danhsach_giaca.get(i);
        }
        return this.gia_ca + "";
    }

}

// o day thi dung cai abstract button va dung switch case de cong gia ca lai va khi goi modul in tong hoa don thi no se reset gia ca
// abstractbutton s = (abstractbutton) e.getresource() / boolean f = s.getmodul().isselected()