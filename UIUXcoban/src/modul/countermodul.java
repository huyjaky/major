package modul;

import java.util.ArrayList;

public class countermodul {
    private Double gia_ca;
    private ArrayList <Double> danhsach_giaca = new ArrayList<>();

    public void tong_gia(Double gia) {
        this.gia_ca += gia;
    }

    public void in_tong_hoadon() {
        this.danhsach_giaca.add(gia_ca);
        this.gia_ca = 0d;

    }

    public void in_danhsach_giaca() {
        for (Double double1 : this.danhsach_giaca) {
            System.out.println(double1);
        }
    }

}

// o day thi dung cai abstract button va dung switch case de cong gia ca lai va khi goi modul in tong hoa don thi no se reset gia ca
// abstractbutton s = (abstractbutton) e.getresource() / boolean f = s.getmodul().isselected()