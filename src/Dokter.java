import java.util.ArrayList;

public class Dokter extends TenagaKesehatan{
    private ArrayList<TenagaKesehatan> perawat= new ArrayList();
    private String jenis;
    private int jumlahBawahan;

    public Dokter(String nama, double pendapatan, String jenis, int jumlahBawahan) {
        super(nama, pendapatan);
        this.jenis = jenis;
        this.jumlahBawahan = jumlahBawahan;
    }

    public Dokter(String nama, double pendapatan, RumahSakit mod)
    {
        super(nama, pendapatan, mod);
    }

    public Dokter(String nama, double pendapatan, String jenis, int jumlahBawahan, RumahSakit mod)
    {
        super(nama, pendapatan, mod);
        this.jenis = jenis;
        this.jumlahBawahan = jumlahBawahan;
    }

    public void rekurtBawahan(TenagaKesehatan tk){
        perawat.add(tk);
    }

    public void showData() {
        System.out.println(TenagaKesehatan.space + "[Dokter] " + nama + " - Total Pendapatan: " + pendapatan);
        TenagaKesehatan.space.append("   ");
        for (TenagaKesehatan tk : perawat)
        {
            System.out.print(TenagaKesehatan.space+"{Bawahan "+nama+"} ");
            tk.showData();
        }
        TenagaKesehatan.space.setLength(TenagaKesehatan.space.length() - 3);
    }

    public void update(double jumlah) {
        if(jenis.equals("Umum"))
        {
            pendapatan += (jumlah * 1.5 + jumlahBawahan) / 5;
            System.out.println("\t\t--- Pendapatan "+nama+" bertambah menjadi "+ ((jumlah * 1.5 + jumlahBawahan) / 5));
        }
        else if(jenis.equals("Spesialis"))
        {
            pendapatan += (jumlah *  2 + jumlahBawahan) / 5;
            System.out.println("\t\t--- Pendapatan "+nama+" bertambah menjadi "+ ((jumlah * 2 + jumlahBawahan) / 5));
        }

    }

}
