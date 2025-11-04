import java.util.Scanner;

public class TunjanganPegawai {

    static double hitungTunjangan(double gajiKotor, int jumlahAnak) {
        double tunjangan;
        if (jumlahAnak < 3) {
            tunjangan = 0.2 * gajiKotor; 
        } else {
            tunjangan = 0.3 * gajiKotor;  
        }
        return tunjangan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji kotor: ");
        double gajiKotor = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        double tunjangan = hitungTunjangan(gajiKotor, jumlahAnak);

        System.out.println("Besar tunjangan yang diterima: Rp " + tunjangan);
    }
}
