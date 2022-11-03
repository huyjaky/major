package modul;

import java.io.File;

public class countermodul {
    public String tree_folder = "";

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

 
}
