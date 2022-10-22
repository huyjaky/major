import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class quanlySinhVien {
    private ArrayList<SinhVien> list_sv;

    public quanlySinhVien () {
        this.list_sv = new ArrayList<>();
    }

    public void add_sv(SinhVien sv) {
        this.list_sv.add(sv);
    }

    public String diem_cao_nhat() {
        Collections.sort(this.list_sv, new Comparator<SinhVien>() {

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                // TODO Auto-generated method stub
                if (o1.getDiemTB() > o2.getDiemTB()) {
                    return 1;
                } else {
                    return -1;
                }
            }
            
        });

        return this.list_sv.get(this.list_sv.size()-1).toString();
    }

    public void in_danhsach() {
        for (SinhVien i : this.list_sv) {
            System.out.println(i);
        }
    }
}
