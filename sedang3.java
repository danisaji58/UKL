import java.util.Scanner;
import java.util.Random;

public class sedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;
        
        while (lanjut) {
            
            double bil1 = Math.round(random.nextDouble() * 10 + 1); 
            double bil2 = Math.round(random.nextDouble() * 10 + 1);
            
            
            String[] operators = {"*", "/", "+", "-", "%"};
            String operator = operators[random.nextInt(operators.length)];
            
            
            double hasil = 0; 
            
            switch (operator) {
                case "*":
                    hasil = bil1 * bil2;
                    break;
                case "/":
                    hasil = bil1 / bil2;
                    break;
                case "+":
                    hasil = bil1 + bil2;
                    break;
                case "-":
                    hasil = bil1 - bil2;
                    break;
                case "%":
                    hasil = bil1 % bil2;
                    break;
                    default:
                    break;
            }

            System.out.printf("%.2f %s %.2f = ", bil1, operator, bil2);
             double jawaban = input.nextDouble();
          
            
           
            System.out.printf("Jawaban yang benar: %.2f\n", hasil); 
            if (Math.abs(jawaban - hasil) < 0.01) { 
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah!");
            }
            
           
            System.out.print("\nIngin melanjutkan kuis? (y/n): ");
            String pilihan = input.next();
            if (pilihan.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }
        
        System.out.println("Terima kasih telah mengikuti kuis!");
        input.close();
    }
}