package project_001;

public class Jne extends Kurir {
    private int beratBarang, harga;
    private String jenis;

    public int getBeratBarang() {
        return beratBarang;
    }

    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }
    
    public int hargaREG() {
        harga = 10000;
        return harga + (getBeratBarang() * 2000);
    }

    public void descReg() {
        System.out.println("adalah layanan pengiruman keseluruh wilayah indonesia,dengan perkiraan waktu.\n"
                + "penyampaian kiriman 1-7 hari kerja,tergantung pada zona daerah tujuan pengiriman.");
    }

    public int hargaSpecial() {
        harga = 20000;
        return harga + (getBeratBarang() * 2000);
    }

    public void descSpecial() {
        System.out.println("SUPER SPEED (SS) adalah layanan pengiriman dengan mengutamakan kecepatan dan.\n"
                + "penyampaiannya sesuai dengan waktu yang telah ditentukan/disepakati yakni dalam 24 jam\n"
                + "atau lebih. Perlu di ingatkan bahwa untuk layanan ini hanya berlaku didaerah jawa\n"
                );
    }
    
    public void paketPilihan(int pilihan) {
        if (pilihan == 1) {
            harga = hargaREG();
            jenis = "REG";
        }
        else if(pilihan == 2) {
            harga = hargaSpecial();
            jenis = "Special";
        }
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
}
