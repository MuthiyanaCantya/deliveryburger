public class Burger {

    private String jenis;
    private String harga;
    private int jmlOrder;
    public Burger next;

    public Burger(String jenis, int order) {
        next = null;
        this.jenis = jenis;
        jmlOrder = order;
    }

    public String getJenis() {
        return jenis;
    }

    private void setHarga(String jenis) {
        if (jenis.equalsIgnoreCase("BeefBurger")) {
            harga = "10000";
        } else if (jenis.equalsIgnoreCase("CheeseBurger")) {
            harga = "11000";
        } else if (jenis.equalsIgnoreCase("ChickenBurger")) {
            harga = "9000";
        } else {
            harga = "0";
        }
    }

    public String getHarga() {
        setHarga(jenis);
        return harga;
    }

    public int getJmlOrder() {
        return jmlOrder;
    }
}
