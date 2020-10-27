package project_001;

public class KeranjangBelanja {
    private Barang arrLaptop[];
    private Barang arrKomputer[];
    private Barang arrAksesoris[];

    public KeranjangBelanja() {
    }

    public KeranjangBelanja(Barang[] arrLaptop, Barang[] arrKomputer, Barang[] arrAksesoris) {
        this.arrLaptop = arrLaptop;
        this.arrKomputer = arrKomputer;
        this.arrAksesoris = arrAksesoris;
    }

    public Barang[] getArrLaptop() {
        return arrLaptop;
    }

    public void setArrLaptop(Barang[] arrLaptop) {
        this.arrLaptop = arrLaptop;
    }

    public Barang[] getArrKomputer() {
        return arrKomputer;
    }

    public void setArrKomputer(Barang[] arrKomputer) {
        this.arrKomputer = arrKomputer;
    }

    public Barang[] getArrAksesoris() {
        return arrAksesoris;
    }

    public void setArrAksesoris(Barang[] arrAksesoris) {
        this.arrAksesoris = arrAksesoris;
    }
    
    public int totalHarga() {
        int jumLaptop = 0, jumKomp = 0, jumAks = 0;
        
        for (int i = 0; i < arrLaptop.length; i++) {
            jumLaptop = jumLaptop + arrLaptop[i].getHarga();
        }
        for (int i = 0; i < arrKomputer.length; i++) {
            jumKomp = jumKomp + arrKomputer[i].getHarga();
        }
        for (int i = 0; i < arrAksesoris.length; i++) {
            jumAks = jumAks + arrAksesoris[i].getHarga();
        }
        
        return jumLaptop + jumKomp + jumAks;
    }
    
    public int totalBerat() {
        int beratLaptop = 0, beratKomp = 0, beratAks = 0;
        
        for (int i = 0; i < arrLaptop.length; i++) {
            beratLaptop += arrLaptop[i].getBerat();
        }
        for (int i = 0; i < arrKomputer.length; i++) {
            beratKomp += arrKomputer[i].getBerat();
        }
        for (int i = 0; i < arrAksesoris.length; i++) {
            beratAks += arrAksesoris[i].getBerat();
        }
        
        return beratAks + beratKomp + beratLaptop;
    }
    
}
