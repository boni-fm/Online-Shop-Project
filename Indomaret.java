package project_001;

public class Indomaret implements KodePembayaran {
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
        System.out.println("-----INDOMARET-----");
        System.out.println("1. Simpan kode pembayaran Indomaret anda");
        System.out.println("2. Tunjukan kode pembayaran ke kasir Indomaret terdekat dan lakukan pembayaran");
        System.out.println("3. Tinggu sampai transaksi anda selesai");
    }
}
