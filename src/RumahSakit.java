import java.util.ArrayList;

public class RumahSakit {
    private String namaRumahSakit, alamat;
    private Dokter direktur;
    private ArrayList<TenagaKesehatan> tenagaKesehatan;
    private double danaRumahSakit;

    public RumahSakit(String namaRumahSakit, String alamat, double danaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
        this.alamat = alamat;
        this.danaRumahSakit = danaRumahSakit;
        tenagaKesehatan = new ArrayList<TenagaKesehatan>();
    }

    public void registerObserver(TenagaKesehatan tk) {
        tenagaKesehatan.add(tk);
    }

    public void notifyObserver(double jumlah) {
        for (int i=0; i < tenagaKesehatan.size(); i++)
            tenagaKesehatan.get(i).update(jumlah);
    }

    public void pulangkanPasien(double biaya, int jmlPasien)
    {
        danaRumahSakit += biaya * jmlPasien * 10;
        System.out.println("\t\t\t\tDana Rumah Sakit bertambah menjadi " + (biaya * jmlPasien * 10));
        notifyObserver(biaya * jmlPasien);
    }

    public void tampilDaftarTenagaKesehatan()
    {
        System.out.println("Rumah Sakit " + namaRumahSakit);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Dana: " + danaRumahSakit);
        direktur.showData();
    }

    public void setDirektur(Dokter direktur) {
        this.direktur = direktur;
    }
}
