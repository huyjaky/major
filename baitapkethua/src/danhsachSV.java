import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhsachSV {
    ArrayList <SinhVienBA> list_Sv_Ba = new ArrayList<>();
    ArrayList <SinhVienIT> list_Sv_It = new ArrayList<>();

    public void add_Sv_Ba (SinhVienBA sv) {
        list_Sv_Ba.add(sv);
    }

    public void add_Sv_It (SinhVienIT sv) {
        list_Sv_It.add(sv);
    }

    

    public void ds_sv_22BA () {
        for (SinhVienBA i : list_Sv_Ba) {
            if (i.getLop().equals("22BA")) {
                System.out.println(i.toString());
            }
        }
    }

    public void ds_sv_gioi () {
        for (SinhVienBA i : list_Sv_Ba) {
            if (i.getHocluc().equals("gioi")) {
                System.out.println(i);
            }
        }
        for (SinhVienIT i : list_Sv_It) {
            if (i.getHocluc().equals("gioi")) {
                System.out.println(i);
            }
        }
    }
    
    public void sv_max () {
        Collections.sort(list_Sv_Ba, new Comparator<SinhVienBA>() {

            @Override
            public int compare(SinhVienBA o1, SinhVienBA o2) {
                // TODO Auto-generated method stub
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        });
        Collections.sort(list_Sv_It, new Comparator<SinhVienIT>() {

            @Override
            public int compare(SinhVienIT o1, SinhVienIT o2) {
                // TODO Auto-generated method stub
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        });
        if (list_Sv_Ba.get(list_Sv_Ba.size() - 1).getDiemTB() >= list_Sv_It.get(list_Sv_It.size() - 1).getDiemTB()) {
            System.out.println(list_Sv_Ba.get(list_Sv_Ba.size() - 1).toString());
        } else {
            System.out.println(list_Sv_It.get(list_Sv_It.size() - 1).getDiemTB());
        }
    }



}
