package project_001;

public class Tiki extends Kurir {
    private int beratBarang, harga;
    private String jenis;

    public int getBeratBarang() {
        return beratBarang;
    }

    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }
    
    public int hargaEko() {
        harga = 12000;
        return harga + (getBeratBarang() * 1500);
    }

    public void descEko() {
        System.out.println("Dengan harga yang terjangkau layanan ini cocok sekali untuk anda karena lebih ekonomis.\n"
                + "namun, pengirimanya membutuhkan waktu yang agak lama(3-5 hari).");
    }

    public int hargaOverNight() {
        harga = 18000;
        return harga + (getBeratBarang() * 2500);
    }

    public void descOverNight() {
        System.out.println("ONS (Over Night Service), layanan yang cocok untuk anda, ketika anda tidak ingin menunggu.\n"
                + "terlalu lama, hanya dalam 1 hari paket yang anda pesan akan sampai. harga dari layanan ini.\n"
                + "terbilang lebih mahal dikarenakan adanya pertimbangan tadi.\n"
                );
    }
    
    public void paketPilihan(int pilihan) {
        if (pilihan == 1) {
            harga = hargaEko();
            jenis = "EKO";
        }
        else if(pilihan == 2) {
            harga = hargaOverNight();
            jenis = "OverNight";
        }
    }

    public int getHarga() {
        return harga;
    }
    
    public String getJenis() {
        return jenis;
    }
}
