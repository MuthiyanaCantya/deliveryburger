public class Pembeli {

    private String nama;
    private Alamat alamat;

    Pembeli(String nama, Alamat alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public Alamat getAlamat() {
        return alamat;
    }
}
