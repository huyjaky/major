package modul;

import java.awt.List;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.ZonedDateTime;

public class countermodul {
    public String tree_folder = "";
    public String history = "";

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

    public String print_url (String name_file) {
        File folder = new File(name_file);
        System.out.println(folder.getAbsolutePath());
        return folder.getAbsolutePath();
    }

    public String print_name_file (String i) {
        File folder = new File(i);
        System.out.println(folder.getName());
        return folder.getName();
    }

    public boolean check_file_or_folder (String name_file) {
        File folder1 = new File(name_file);
        if (folder1.isDirectory()) {
            return true; // folder
        } else {
            return false; // file
        }
    }

    public void print_tree_folder (File folder, String bac) {
        bac += "            ";
        File[] list_file = folder.listFiles();
        if (list_file.length == 0) {
            return;
        }
        for (int i = 0; i < list_file.length; i++) {
            if (list_file[i].isDirectory()) {
                tree_folder +=  bac +"|_" + list_file[i].getName() + "\n";
                print_tree_folder(list_file[i], bac);
            } else if (list_file[i].isFile()) {
                tree_folder +=  bac +"|_" + list_file[i].getName() + "\n";
            }
        }
    }

    public void history() {
        ZonedDateTime zd = ZonedDateTime.now();
        this.history = this.history.trim();
        if (check_file_excute("I:/newjava/major/save.data")) {
            try {
                File file_save = new File("I:/newjava/major/save.data");
                try {
                    if (this.history == "") {
                        Files.write(file_save.toPath(), (zd + "\n" +"null \n").getBytes(), StandardOpenOption.APPEND);
                        return;
                    }
                    Files.write(file_save.toPath(), (zd + "\n" + this.history + "\n").getBytes(), StandardOpenOption.APPEND);
                    System.out.println("check append");
                    return;
                } catch (Exception e) {
                    e.getStackTrace();
                    return;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        try {
            File file_save = new File( System.getProperty("user.dir")+ "/save.data");
            PrintWriter pw = new PrintWriter(file_save);
            pw.println(zd + "\n" + this.history);
            pw.flush();
            pw.close();
            System.out.println("check creat");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    
    public void reset_history () {
        
        try {
            File file_save = new File(System.getProperty("user.dir") + "/save.data");
			java.util.List<String> list_history = Files.readAllLines(file_save.toPath(), StandardCharsets.UTF_8);
            for (int i = 0; i < list_history.size(); i++) {
                list_history.set(i, null);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
