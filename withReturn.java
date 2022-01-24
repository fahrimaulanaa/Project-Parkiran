import java.util.*;
public class withReturn {
    static  Scanner input = new Scanner(System.in);

    private static int hitung1(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Masukkan bilangan1: ");
        int bil1 = input.nextInt();

        System.out.println("Masukkan bilangan2: ");
        int bil2 = input.nextInt();

        hitung1(bil1, bil2);

        System.out.println("Hasil: "+hitung1(bil1,bil2));

        salam();

    }

    public static void salam(){
        System.out.println("Selamat pagi");
    }

}
