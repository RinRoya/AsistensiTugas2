/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsistensiTugas2;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class BukuMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan Nama Pengarang\t: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Judul Buku\t: ");
            String judul = input.nextLine();
            System.out.print("Masukkan Tahun Terbit\t: ");
            int tahun = input.nextInt();
            System.out.print("Masukkan Cetakan Ke\t: ");
            int cetakan = input.nextInt();
            System.out.print("Masukkan Harga Jual\t: ");
            double harga = input.nextDouble();
            System.out.println();
            System.out.println("========= KETERANGAN =========");

            Buku AsisTugas2Latihan = new Buku();
            AsisTugas2Latihan.setNamaPengarang(nama);
            AsisTugas2Latihan.setJudulBuku(judul);
            AsisTugas2Latihan.setTahunTerbit(tahun);
            AsisTugas2Latihan.setCetakanKe(cetakan);
            AsisTugas2Latihan.setHargaJual(harga);
            AsisTugas2Latihan.infoBuku();

        } catch (Exception e) {
            System.out.println();
            System.out.println("========= PERINGATAN =========");
            System.out.println("Masukkan data dengan benar");
        }
    }
}
