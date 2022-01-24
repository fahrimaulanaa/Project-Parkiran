import java.util.Scanner;

public class parkiran {
    static Scanner sc = new Scanner(System.in);

    protected static void salam(){
        System.out.println("Terima kasih selamat datang kembali");
    }

    public static void main(String[] args) {

        int jam, harga;
        String nama;

        System.out.println("Selamart datang di parkiran modern \n");
        System.out.println("Harga parkir di parkiran modern");
        System.out.println("Harga parkir: 3000/jam untuk semua jenis kendaraan \n");
        
        System.out.println("Berapa lama waktu anda parkir(dalam jam): ");
        jam = sc.nextInt();

        harga = 3000 * +jam;

        System.out.println("Masukkan nama anda: ");
        nama = sc.next();

        System.out.println("Selamat pagi "+nama+",total biaya parkir anda adalah: "+harga);

        System.out.println("Silahkan masukkan nominal pembayaran: \n");
        int nominal = sc.nextInt();

        if(nominal == harga){
            salam();
        }else{
            System.out.println("Mohon masukkan nominal sesuai harga akhir");
        }
    }
}

//memuat operator dan percabangan