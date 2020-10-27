package project_001;

public class Barang {
    private String namaBarang;
    private int jenis, harga, berat;

    public Barang() {
    }

    public Barang(String namaBarang, int jenis, int harga, int berat) {
        this.namaBarang = namaBarang;
        this.jenis = jenis;
        this.harga = harga;
        this.berat = berat;
    }
    

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }    
}
