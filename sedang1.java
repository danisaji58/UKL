import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif : ");
        int bilangan = input.nextInt();
        
        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = bilangan;
            for (int i = bilangan - 1; i >= 1; i--) {
                System.out.print(i +"*");
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        }
        
        input.close();
    }
}
