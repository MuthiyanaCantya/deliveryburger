import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Pemesanan {

    private Kasir kasir;
    private Pembeli pembeli;
    private Burger awal;
    private int total = 0;

    public Pemesanan(Kasir kasir, Pembeli pembeli) {
        this.kasir = kasir;
        this.pembeli = pembeli;
        awal = null;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public String getTglPesan() {
        DateFormat tglPesan = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        Date tglPsn = new Date();
        return tglPesan.format(tglPsn);
    }

    public boolean kosong() {
        return awal == null;
    }

    public void tambahPesanan(Burger burgerBaru) {
        Burger pesananBaru = new Burger(burgerBaru.getJenis(), burgerBaru.getJmlOrder());
        if (kosong()) {
            pesananBaru.next = awal;
            awal = pesananBaru;
        } else {
            Burger temp = awal;
            pesananBaru.next = null;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = pesananBaru;
        }

        total += (burgerBaru.getJmlOrder() * Integer.parseInt(burgerBaru.getHarga()));
    }

    public void cetakPesanan() throws Exception {
        System.out.println("----------------------------------------------------");
        Burger temp = awal;
        if (temp == null) {
            throw new Exception("Pesanan kosong");
        } else {
            while (temp != null) {
                System.out.println(temp.getJmlOrder() + "\t" + temp.getJenis()
                        + "\t" + temp.getHarga());
                temp = temp.next;
            }
        }
        System.out.println("Total   : " + total);
        System.out.println("Selamat Menikmati");
    }
}
