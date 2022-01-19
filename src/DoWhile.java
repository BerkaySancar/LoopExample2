import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Kullanıcı tek sayı girene kadar sayı al, sayılardan çift ve 4 ün katı olanları toplayıp ekrana yazdır.
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int number;
        do {
            System.out.print("Sayı girin:");
            number = scan.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }
        }
        while (number % 2 ==0) ;
        System.out.println(total);
    }
}
