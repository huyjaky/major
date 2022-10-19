package modul;

public class countermodul {
    private Integer count;
    
    
    public void count (String text, String text_check) {
        String[] array = text.split("");
        text = null;
        this.count = 0;
        for (String i : array) {
            if (text_check.equals(i)) {
                count += 1;
            }
        }
    }

    public String get_count () {
        return this.count+"";
    }
}
