package modul;

public class countermodul {
    private Integer counter_click = 0;
    
    public void add_click () {
        this.counter_click += 1;
    }

    public String getclick() {
        return this.counter_click+"";
    }


}
