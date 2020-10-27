package project_001;

public class Gopay implements KodePembayaran {
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
        System.out.println("-----GOPAY-----");
        System.out.println("1. gunakan prangkat smartphone anda lalu login ke aplikasi Gopay");    
        System.out.println("2. lalu Masukan kode pembayaran gopay belanjaan anda ");
        System.out.println("3. Tunggu transaksi anda selesai");
       
    }
}
