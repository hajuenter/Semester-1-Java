
package calculator_java;
import java.util.Scanner;
/**
 *
 * @author Bahrulapk
 */
public class Calculator_Java {

    public static void main(String[] args) {
        //deklarasi
    Scanner inputUser;
    float a, b, hasil;
    char operator;
    inputUser = new Scanner(System.in);
        
        
        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("nilai operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();
        
        System.out.println("Input User =  " + a + " " + operator + " " + b);
        
        // operator
        switch (operator) {
            case '+':           // penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
                
            case '-':           // pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
                
            case '*':           // perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
                
            case '/':           // pembagian
                if (b == 0){
                    System.out.println("pembagi nol menghasilkan nilai tak hingga");
                }
                else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                }
                break;
                
            default:            // else
                System.out.println("operator salah");
                break;
        }
        
    }
}    
