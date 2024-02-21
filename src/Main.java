import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Değişkenler
         int n;
         int toplam = 0;
         // Kullanıcıdan sayı girmesini istiyoruz ve girdiği sayılardan 2 ve 4 e tam bölünenleri kontrol ediyoruz.
         do {
             System.out.print("Sayı giriniz : ");
             n = inp.nextInt();
             if ((n % 2 == 0) && (n % 4==0)) {
                 toplam += n;
             }
         } while (n % 2==0);
        System.out.println(toplam);
    }
}