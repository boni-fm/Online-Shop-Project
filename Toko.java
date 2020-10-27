package project_001;

public class Toko {
    private String namaToko;
    private int idToko;

    public Toko() {
    }

    public Toko(String namaToko, int idToko) {
        this.namaToko = namaToko;
        this.idToko = idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public int getIdToko() {
        return idToko;
    }

    public void setIdToko(int idToko) {
        this.idToko = idToko;
    }
    
    
}
