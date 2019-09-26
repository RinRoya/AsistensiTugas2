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
public class Buku {

    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;

    public Buku() {
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }

    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getCetakanKe() {
        return cetakanKe;
    }

    public void setCetakanKe(int cetakanKe) {
        this.cetakanKe = cetakanKe;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public void infoBuku() {
        System.out.println("INFORMASI BUKU");
        System.out.println("Nama Pengarang\t: " + getNamaPengarang());
        System.out.println("Judul Buku\t: " + getJudulBuku());
        System.out.println("Tahun Terbit\t: " + getTahunTerbit());
        System.out.println("Cetakan Ke\t: " + getCetakanKe());
        System.out.println("Harga Jual\t: Rp" + getHargaJual() + "0");
    }
}
