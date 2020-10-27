package project_001;

public class Ovo implements KodePembayaran {
    String noTelp;
    String kodePembayaran = "3030";
    
    public void setNoTelp(String noTelp){
        this.noTelp=noTelp;
    }
    @Override
    public String getKodePembayaran(){
        return kodePembayaran + noTelp;
    }
    
    public void CaraPembayaran(){
        System.out.println("-----OVO-----");
        System.out.println("1. buka aplikasi ovo menggunakan prangkat smartphone anda lalu pilih menu transfer ");
        System.out.println("2. lalu Masukan kode pembayaran ovo belanjaan anda ");
        System.out.println("3. Tunggu sampai transaksi anda selesai");
    }
}
