package com.company;
import java.util.Scanner;
public class Deret_angka_prima {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        System.out.print("Masukkan Nilai Akhir Bilangan Prima = "); int angka= nilai.nextInt();
        int jumlah=0;
        System.out.print("Deret Bilangan Prima : ");
        for (int a=2;a<=angka;a++){
            int mod=1;
            for (int b=2;b<a;b++){
                if(a%b==0)
                {
                    mod=0;
                }
            }
            if(mod==1)
            {
                System.out.print(a + " ");
                jumlah=jumlah+a;
            }
        }
        System.out.println();
        System.out.println("Jumlah Dari Deret Bilangan Prima Adalah "+jumlah);
    }
}

