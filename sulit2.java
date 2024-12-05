import java.util.Scanner;

public class sulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        
        
        boolean ditemukan = false;
        int duplikat = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    ditemukan = true;
                    duplikat = arr[i];
                    break;
                }
            }
            if(ditemukan) {
                break;
            }
        }
        
        
        if(ditemukan) {
            System.out.println("Array memiliki elemen duplikat: " + duplikat);
        } else {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
        
        input.close();
    }
}
