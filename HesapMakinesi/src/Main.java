
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------ Hesap Makinesine Hoşgeldiniz ------------");
        System.out.print("Lütfen işlem yapmak istediğiniz ilk sayıyı girin: ");
        int s1 = input.nextInt();
        System.out.print("Lütfen işlem yapmak istediğiniz ikinci sayıyı girin: ");
        int s2 = input.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemi girin");
        System.out.println("Toplama için (1), Çıkarma için (2), Çarpma için (3), Bölme için (4) tuşlayın: ");
        int isle= input.nextInt();

             switch (isle) {
                     case 1:
                     int toplam = s1 + s2;
                     System.out.println("Sayıların toplamı: " + toplam);
                     break;
                     case 2:
                     int fark = s1 - s2;
                     System.out.println("Sayıların farkı: " + fark);
                     break;
                     case 3:
                     int carp = s1 * s2;
                     System.out.println("Sayıların çarpımı: " + carp);
                     break;
                     case 4 :
                     if(s2==0){
                         System.out.println("Sayı sıfıra bölünemez!");
                     }
                     else{
                         System.out.println("Sayıların bölümü: " + (s1/s2));
                     }
                     break;
                     default:
                        System.out.println("Lütfen geçerli bir işlem seçiniz");}
        }
    }
