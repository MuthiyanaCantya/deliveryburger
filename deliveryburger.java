import java.util.Scanner;

public class DeliveryBurger {

    public static void main(String[] args) throws Exception {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        boolean bol = true;
        String nama = null, jalan = null, kec = null, kota = null, jenis = null;
        int jmlOrder = 0, pesanan;

        Kasir ks1 = new Kasir("Muthiyana", "13.7767");

        while (bol) {
            System.out.print("Masukkan nama lengkap : ");
            try {
                nama = input1.nextLine();
                for (char i : nama.toCharArray()) {
                    if (i == ' ') {
                        continue;
                    } else if (!Character.isLetter(i)) {
                        throw new Exception("Nama harus huruf");
                    }
                }
                bol = false;
            } catch (Exception e) {
                System.err.println("Error : " + e.getMessage());
            }
        }

        bol = true;
        System.out.println("Masukkan alamat lengkap");
        while (bol) {
            System.out.print(" - Nama jalan dan no  : ");
            try {
                jalan = input1.nextLine();
                if (jalan.length() > 50) {
                    throw new Exception("nama jalan lebih dari 50 karakter");
                }
            } catch (Exception e) {
                System.err.println("Error : " + e.getMessage());
                continue;
            }
            System.out.print(" - Nama kecamatan     : ");
            try {
                kec = input1.nextLine();
                for (char i : kec.toCharArray()) {
                    if (i == ' ') {
                        continue;
                    } else if (!Character.isLetter(i)) {
                        throw new Exception("Nama kecamatan harus huruf");
                    }
                }
            } catch (Exception e) {
                System.err.println("Error : " + e.getMessage());
                continue;
            }
            System.out.print(" - Nama kota/kab.     : ");
            try {
                kota = input1.nextLine();
                for (char i : kota.toCharArray()) {
                    if (i == ' ') {
                        continue;
                    } else if (!Character.isLetter(i)) {
                        throw new Exception("Nama kota/kab harus huruf");
                    }
                }
                bol = false;
            } catch (Exception e) {
                System.err.println("Error : " + e.getMessage());
            }
        }

        Alamat almt1 = new Alamat(jalan, kec, kota);
        Pembeli pbl1 = new Pembeli(nama, almt1);
        Pemesanan psnn1 = new Pemesanan(ks1, pbl1);

        System.out.println("\nMenu :\n"
                + "- BeefBurger\n"
                + "- CheeseBurger\n"
                + "- ChickenBurger\n");
        System.out.print("Banyak pesanan   : ");
        pesanan = input2.nextInt();
        for (int j = 0; j < pesanan; j++) {
            bol = true;
            while (bol) {
                System.out.print("Nama pesanan "+(j+1)+"   : ");
                try {
                    jenis = input1.nextLine();
                    if (jenis.equalsIgnoreCase("BeefBurger")
                            || jenis.equalsIgnoreCase("CheeseBurger")
                            || jenis.equalsIgnoreCase("ChickenBurger")) {
                        bol = false;
                    } else {
                        bol = true;
                        throw new Exception("Tulis nama pesanan sesuai menu");
                    }
                } catch (Exception e) {
                    System.err.println("Error : " + e.getMessage());
                }
            }
            bol = true;
            while (bol) {
                System.out.print("Jumlah pesanan "+(j+1)+" : ");
                try {
                    jmlOrder = input2.nextInt();
                    if (jmlOrder > 10) {
                        bol = true;
                        throw new Exception("jumlah pesanan maks 10");
                    } else {
                        bol = false;
                    }
                } catch (Exception e) {
                    System.err.println("Error : " + e.getMessage());
                }
            }
            Burger bgr1 = new Burger(jenis, jmlOrder);
            psnn1.tambahPesanan(bgr1);
        }

        Bill b1 = new Bill(psnn1);
        b1.cetakBill();
        psnn1.cetakPesanan();
    }
}
