package absensi.perpus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner; 
public class Petugas {
    String nama;
    String idPetugas;
    String alamat;
    String jenisKelamin;

    void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAbsensi Petugas Perpustakaan");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("ID Petugas: ");
        idPetugas = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.nextLine();
    }

    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("ID Petugas: " + idPetugas);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);

    }
    
}
