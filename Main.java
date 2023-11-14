import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        int cal;
        while (true){
            System.out.println(" CALCULATOR");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            Scanner sc = new Scanner(System.in);
            System.out.println("Pilih Operasi (1/2/3/4/5): ");
            cal = sc.nextInt();

            if(cal == 5){
                System.out.println("Thank you, the calculator stopped");
            }
            double result = 0;
            switch (cal) {
                case 1:
                    System.out.println("Masukkan Angka: ");
                    double angkaAkar = sc.nextDouble();
                    result = Math.sqrt(angkaAkar);
                    break;
                case 2:
                    System.out.println("Masukkan Basis: ");
                    double basisPangkat = sc.nextDouble();
                    System.out.println("Masukkan Eksponen");
                    double eskponenPangkat = sc.nextDouble();
                    result = Math.pow(basisPangkat, eskponenPangkat);
                    break;
                case 3:
                    System.out.println("Masukkan angka: ");
                    double angkaLog = sc.nextDouble();
                    result = Math.log(angkaLog);
                    break;
                case 4:
                    System.out.println("Masukkan angka untuk Faktorial: ");
                    int angkaFaktorial = sc.nextInt();
                    result = faktorial(angkaFaktorial);
                    break;
                default:
                    System.out.println("Pilihan Operasi anda tidak sesuai, pilih yang benar. ");
                    continue;
            }
            System.out.println("Hasil :" + result);
        }
    }

    public static double faktorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * faktorial(n - 1);
        }
    }
}