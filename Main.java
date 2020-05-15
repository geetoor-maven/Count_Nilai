
package Tugas4;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa obj = new Mahasiswa();
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        
        System.out.print("-- Masukan Nim Mahasiswa Ke -1  : ");
        String nim = input.next();
        obj.setNim(nim);
        
        System.out.print("-- Masukan Nama Mahasiswa Ke -1 : ");
        String nama = input.next();
        obj.setNama(nama);
        
        System.out.print("-- Masukan Nilai Tugas Mahasiswa Ke -1 : ");
        double nilai_tugas = input.nextDouble();
        obj.setNilai_tugas(nilai_tugas);
        
        System.out.print("-- Masukan Nilai Kehadiran Mahasiswa ke -1 (1-16) : ");
        double nilai_kehadiran = input.nextDouble();
        obj.setNilai_kehadiran(nilai_kehadiran);
        
        System.out.print("-- Masukan Nilai Mid Mahasiswa Ke -1 : ");
        double nilai_mid = input.nextDouble();
        obj.setNilai_mid(nilai_mid);
        
        System.out.print("-- Masukan Nilai Final Mahasiswa ke -1 : ");
        double nilai_final = input.nextDouble();
        obj.setNilai_final(nilai_final);
        
        obj.HitungPresentase();
        obj.HitungNIlaiTotal();
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
        
        System.out.println("-- Presentase Nilai Tugas "+obj.getNama()+" Adalah : "  + obj.getPresentase_tugas());
        System.out.println("-- Presentase Nilai Kehadiran "+obj.getNama()+" Adalah : " + obj.getPresentase_kehadiran());
        System.out.println("-- Presentase Nilai Mid "+obj.getNama()+" Adalah : " + obj.getPresentase_mid());
        System.out.println("-- Presentase Nilai Final "+obj.getNama()+" Adalah : " + obj.getPresentase_final());
        System.out.println("-- Presentase Total Nilai "+obj.getNama()+" Adalah : " + obj.getNilai_total());
        System.out.println("-- Presentase Nilai Huruf "+obj.getNama()+" Adalah : " + obj.getNilai_huruf());
        
        
         System.out.println("---------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------");
    }
    
}
