package test;

import java.math.BigDecimal;

import javax.sound.midi.SoundbankResource;

public class test {
    public static void main(String[] args) {
        String a = "0";
        BigDecimal BD1 = new BigDecimal(a);
        BigDecimal BD2 = new BigDecimal("000.000");
        System.out.println(BD1.compareTo(BD2));
        int i = a;
        System.out.println();


    }
}
