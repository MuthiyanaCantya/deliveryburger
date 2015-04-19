public class Bill {
    
    private int noBill;
    private Pemesanan pesanan;
    
    Bill(Pemesanan pesanan){
        noBill = 1109;
        this.pesanan = pesanan;
    }

    public int getNoBill() {
        return noBill;
    }

    public Pemesanan getPesanan() {
        return pesanan;
    }
    
    public void cetakBill(){
        System.out.println("----------------------------------------------------");
        System.out.println(pesanan.getTglPesan());
        System.out.println("No Bill : " + getNoBill());
        System.out.println("Kasir   : " + getPesanan().getKasir().getNama() +
                           " \t ID : " + getPesanan().getKasir().getId());
        System.out.println("Nama    : " + getPesanan().getPembeli().getNama());
        System.out.println("Alamat  : " + getPesanan().getPembeli().getAlamat().getJalan()
                         + ", " + getPesanan().getPembeli().getAlamat().getKecamatan() 
                         + ", " + getPesanan().getPembeli().getAlamat().getKota());
    }
}
