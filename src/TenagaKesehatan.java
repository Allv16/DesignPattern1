public abstract class TenagaKesehatan {
    public static StringBuffer space = new StringBuffer();
    protected String nama;
    protected double pendapatan;
    protected RumahSakit model;

    public TenagaKesehatan(String nama, double pendapatan) {
        this.nama = nama;
        this.pendapatan = pendapatan;
    }

    public TenagaKesehatan(String nama, double pendapatan, RumahSakit mod) {
        this.nama = nama;
        this.pendapatan = pendapatan;
        model = mod;
        model.registerObserver(this);
    }

    public abstract void showData();

    public abstract void update(double jumlah);

    public String getNama() {
        return nama;
    }

    public double getPendapatan() {
        return pendapatan;
    }

}
