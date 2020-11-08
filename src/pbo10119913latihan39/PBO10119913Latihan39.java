/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan39;

import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramdhan 
 * KELAS    : IF 10K
 * NIM      : 10119913*/
public class PBO10119913Latihan39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penentu mahasiswa = new Penentu();
        Scanner scanner = new Scanner(System.in);
        int i, jumlahMahasiswa, nilaiTerbesar = 0, nilaiTerkecil;
        String petugas;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        petugas = mahasiswa.namaPetugas();
        jumlahMahasiswa = mahasiswa.getBanyak_mahasiswa();
        int[] nilai = new  int[jumlahMahasiswa];
        for (i =0; i < jumlahMahasiswa; i++) {
            System.out.printf("Nilai Mahasiswa ke-%d\t\t\t\t= ",i+1);
            nilai[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        nilaiTerbesar = mahasiswa.nilaiTerbesar(nilai);
        nilaiTerkecil = mahasiswa.nilaiTerkecil(nilai);
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+nilaiTerbesar);
        System.out.println("Nilai Terkecil Adalah "+nilaiTerkecil);
        System.out.println();
        System.out.print("Petugas : "+petugas);

    }
    
}
