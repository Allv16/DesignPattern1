import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        RumahSakit rs = new RumahSakit("Novacare", "Jl. Diponegoro 441", 1000000000);
        Dokter direktur = new Dokter("Maya", 150000000, "Spesialis", 2,  rs);
        Dokter dokter1 = new Dokter("Samuel", 10000000, "Spesialis", 2, rs);
        Dokter dokter2 = new Dokter("Sarah", 5000000, "Umum", 2, rs);
        Perawat perawat1 = new Perawat("Emily", 4000000,1, rs);
        Perawat perawat2 = new Perawat("David", 5000000, 2, rs);
        Perawat perawat3 = new Perawat("Anna", 8000000, 6, rs);
        Perawat perawat4 = new Perawat("Maria", 4500000, 2, rs);

        rs.setDirektur(direktur);
        direktur.rekurtBawahan(dokter1);
        direktur.rekurtBawahan(dokter2);
        dokter1.rekurtBawahan(perawat1);
        dokter1.rekurtBawahan(perawat2);
        dokter2.rekurtBawahan(perawat3);
        dokter2.rekurtBawahan(perawat4);

        rs.tampilDaftarTenagaKesehatan();

        System.out.println("\n\nTampilkan Observernya saat memulangkan 4 pasien dengan biaya 100000/pasien");
        rs.pulangkanPasien(100000, 4);
        System.out.println("\nSetelah memulangkan pasien\n");


        rs.tampilDaftarTenagaKesehatan();

    }
}