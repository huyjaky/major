package modul;

import java.io.File;

public class countermodul {

    public boolean check_file_excute(String url) {
        File folder1 = new File(url);
        if (folder1.canExecute()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_file_canread(String url) {
        File folder1 = new File(url);
        if (folder1.canRead()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean check_file_canwrite(String url) {
        File folder1 = new File(url);
        if (folder1.canWrite()) {
            return true;
        } else {
            return false;
        }
    }

    public 

}
