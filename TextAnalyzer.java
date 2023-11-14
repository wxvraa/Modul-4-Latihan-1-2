import java.util.Scanner;

public class TextAnalyzer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan teks: ");
            String teks = scanner.nextLine();

            //analisis teks
            int jumlahKarakter = hitungJumlahKarakter(teks);
            int jumlahKata = hitungJumlahKata(teks);

            System.out.println("Jumlah karakter : " + jumlahKarakter);
            System.out.println("Jumlah kata: " + jumlahKata);

            //cari kata dalam teks
            System.out.println("Masukkan kata yag ingin dicari: ");
            String kataCari = scanner.nextLine();

            boolean ditemukan = cariKata(teks, kataCari);
            if (ditemukan){
                System.out.println("Kata\"" + kataCari + "\" ditemukan dalam teks.");
            } else{
                System.out.println("Kata\"" + kataCari + "\" tidak ditemukan dalam teks.");
            }
        }
        private static int hitungJumlahKarakter(String teks){
            return teks.length();
        }
        private static int hitungJumlahKata(String teks){
            if (teks.isEmpty()){
                return 0;
            }else{
                //menggunakan split()untuk memisahkan kata-kata berdasarkan spasi
                String[] kataArray = teks.split("\\s+");
                return kataArray.length;
            }
        }
        private static boolean cariKata(String teks, String kataCari){
            //menggunakan equalsIgnoreCase() untuk membandingkan tanpa memperhatikan huruf besar/kecil
            return teks.toLowerCase().contains(kataCari.toLowerCase());
        }
    }
