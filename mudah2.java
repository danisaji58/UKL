import java.util.Scanner;

public class mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        int hasil = angka % 2;
        String kondisi = hasil == 0? "Genap" : "Ganjil";
        System.out.println(angka +" "+kondisi);
        
    }
}
