public class gedang {

    protected static String hewan = "Kucing";

    protected static boolean kewan(){

        System.out.println(hewan);
        return true;
    }

    //method hitung luas

    private static void hitung_luas(int p, int l){
        int luas = p * l;
        System.out.println(luas);
    }

    public static void main(String[] args) {
        kewan();

        //Pemanggilan method hitung luas

        hitung_luas(9,10);
        hitung_luas(5,9);

    }

}
