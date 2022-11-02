package test;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        File folder1 = new File("I:/newjava/major/test/src/test2.txt");
        System.out.println(folder1.exists());
        try {
            folder1.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
            
        }
        
    }
}
