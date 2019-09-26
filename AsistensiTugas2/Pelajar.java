/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsistensiTugas2;
/**
 *
 * @author OWNER
 */
public class Pelajar {

    private long nip;
    private String nama;
    private double nilaiUjian1;
    private double nilaiUjian2;
    private double nilaiTugas;

    public long getNip() {
        return nip;
    }

    public void setNip(long nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiUjian1() {
        return nilaiUjian1;
    }

    public void setNilaiUjian1(double nilaiUjian1) {
        this.nilaiUjian1 = nilaiUjian1;
    }

    public double getNilaiUjian2() {
        return nilaiUjian2;
    }

    public void setNilaiUjian2(double nilaiUjian2) {
        this.nilaiUjian2 = nilaiUjian2;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double nilaiAkhir() {
        double NilaiAkhir = 0.4 * getNilaiUjian1() + 0.4 * getNilaiUjian2() + 0.2 * getNilaiTugas();
        return NilaiAkhir;
    }

    public String isLulus() {
        String status;
        if (nilaiAkhir() >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }
        return status;
    }

    public void status() {
        System.out.println("DATA PELAJAR");
        System.out.println("Nama\t\t\t: " + getNama());
        System.out.println("NIP\t\t\t: " + getNip());
        System.out.println("Nilai Ujian 1\t\t: " + getNilaiUjian1());
        System.out.println("Nilai Ujian 2\t\t: " + getNilaiUjian2());
        System.out.println("Nilai Tugas\t\t: " + getNilaiTugas());
        System.out.println("Keterangan Pelajar\t: " + isLulus());
    }
}
