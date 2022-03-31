package absensi.perpus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Member {
    String nama;
    String noAnggota;
    String status;
    String jenisKelamin;
    String alamat;
    String aktivitas;
    
    void method(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nAbsensi Anggota Perpustakaan");
        System.out.print("Nama: ");
        nama =  input.nextLine();
        System.out.print("No Anggota: ");
        noAnggota = input.nextLine();
        System.out.print("Pekerjaan: ");
        status = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        jenisKelamin = input.nextLine();
        System.out.println("Alamat: ");
        alamat = input.nextLine();
        System.out.println("Aktivitas di Perpustakaan : ");
        aktivitas = input.nextLine();

    }
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("No Anggota: " + noAnggota);
        System.out.println("Pekerjaan: " + status);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("aktivitas : " + aktivitas);
    }
    
}
