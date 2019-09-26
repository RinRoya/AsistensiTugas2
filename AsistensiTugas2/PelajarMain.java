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
public class PelajarMain {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        try {
            System.out.print("Masukkan Nama\t\t: ");
            String nama = baca.nextLine();
            System.out.print("Masukkan NIP\t\t: ");
            int nip = baca.nextInt();
            System.out.print("Masukkan Nilai Ujian 1\t: ");
            double nilai1 = baca.nextDouble();
            System.out.print("Masukkan Nilai Ujian 2\t: ");
            double nilai2 = baca.nextDouble();
            System.out.print("Masukkan Nilai Tugas\t: ");
            double tugas = baca.nextDouble();
            System.out.println();
            System.out.println("========= KETERANGAN =========");

            Pelajar AsisTugas2Tugas = new Pelajar();
            AsisTugas2Tugas.setNama(nama);
            AsisTugas2Tugas.setNip(nip);
            AsisTugas2Tugas.setNilaiUjian1(nilai1);
            AsisTugas2Tugas.setNilaiUjian2(nilai2);
            AsisTugas2Tugas.setNilaiTugas(tugas);
            AsisTugas2Tugas.status();

        } catch (Exception e) {
            System.out.println();
            System.out.println("========= PERINGATAN =========");
            System.out.println("Masukkan data dengan benar");
        }
    }
}
