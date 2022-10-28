package modul;

import java.time.LocalDate;
import java.util.HashMap;

public class countermodul {
    private Double gia_ca;
    private HashMap <Double, LocalDate> danhsach_giaca = new HashMap<Double, LocalDate>();

    public void tong_gia(Double gia) {
        this.gia_ca += gia;
    }

    public void in_tong_hoadon() {
        this.danhsach_giaca.put(gia_ca, LocalDate.now());
        this.gia_ca = 0d;
    }

    public String in_danhsach_giaca() {
        String s = "";
        for (int i = 0; i < this.danhsach_giaca.size(); i++) {
            System.out.println(this.danhsach_giaca.get(i));
        }
        return s;
    }
}

// o day thi dung cai abstract button va dung switch case de cong gia ca lai va khi goi modul in tong hoa don thi no se reset gia ca
// abstractbutton s = (abstractbutton) e.getresource() / boolean f = s.getmodul().isselected()