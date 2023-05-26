public class Perawat extends TenagaKesehatan{
    private int pengalaman;

    public Perawat(String nama, double pendapatan, int pengalaman) {
        super(nama, pendapatan);
        this.pengalaman = pengalaman;
    }

    public Perawat(String nama, double pendapatan, int pengalaman, RumahSakit mod)
    {
        super(nama, pendapatan, mod);
        this.pengalaman = pengalaman;

    }

    public void showData() {
        System.out.println("[Perawat] " + nama + " - Total Pendapatan: " + pendapatan);
    }

    public void update(double jumlah) {
        pendapatan += (jumlah * pengalaman) / 10;
        System.out.println("\t\t--- Pendapatan "+nama+" bertambah menjadi "+((jumlah * pengalaman) / 10));
    }
}
