
package menghitungbilanganpangkat;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class MenghitungBilanganPangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pengguna = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = pengguna.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = pengguna.nextInt();
        int hasil = hitungPangkat(angka, pangkat);
        System.out.println("Hasil " + angka + "^" + pangkat + " adalah: " + hasil);
        pengguna.close();
    }    // Fungsi rekursif untuk menghitung bilangan pangkat
    public static int hitungPangkat(int angka, int pangkat) {
        if (pangkat == 0) {
            return 1; // angka rekursif = a^0 = 1
        } else {
            return angka * hitungPangkat(angka, pangkat - 1);
        }
    } }


    
    

