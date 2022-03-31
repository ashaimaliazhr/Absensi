package absensi.perpus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class AbsensiPerpus {

    
    public static void main(String[] args) {
        salamPembuka salam = new salamPembuka ("Aplikasi Absensi Perpustakaan");
        salamPembuka salam2 = new salamPembuka("Selamat Datang di Aplikasi Absensi Perpustakaan");
        Petugas petugas = new Petugas();
        Member member = new Member();
        Tamu tamu = new Tamu();
        salamPenutup salam1 = new salamPenutup("Terimakasih Telah Mengisi Data Absensi, Sampai Jumpa");
        Scanner input = new Scanner(System.in);
        int pilihan;
        int jumlah;
        //Alur Program
        salam.method();
        salam2.method();
        System.out.println("1. Petugas Perpustakaan");
        System.out.println("2. Anggota Perpustakaan");
        System.out.println("3. Tamu");
        System.out.print("Masukkan pilihan(1/2/3): ");
        pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukkan Jumlah Petugas Perpustakaan yang Perlu di Absensi: ");
                jumlah = input.nextInt();
                for (int i=1; i<=jumlah; i++){
                    petugas.method();
                    petugas.tampil();
                }
                salam1.method();
                break;

            case 2:
                System.out.println("Masukkan Jumlah Anggota Perpustakaan yang Perlu di Absensi");
                jumlah = input.nextInt();
                for (int i=1; i<=jumlah; i++){
                    member.method();
                    member.tampil();
                }
               salam1.method();
                break;
                
            case 3 :
                System.out.println("Masukkan Jumlah Tamu yang Perlu di Absensi");
                jumlah = input.nextInt();
                for (int i=1; i<=jumlah; i++){
                    tamu.method();
                    tamu.tampil();
                }
               salam1.method();
                break;
                
            default :
                System.out.println("Maaf, Input yang Anda Masukkan Salah");
        }



    }
    
    }
