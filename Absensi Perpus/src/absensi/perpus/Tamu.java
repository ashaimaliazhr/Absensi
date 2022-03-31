package absensi.perpus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner; 
public class Tamu {
    String nama;
    String jenisKelamin;
    String alamat;
    String aktivitas;
    
    void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAbsensi Tamu");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Aktivitas : ");
        aktivitas = input.nextLine(); 
    }
    
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + aktivitas);

    }
}
