import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Minimum ve Maximum Sayı Bulma Programı");
        int sayi,sayi2;
        int kacs;
        int buyuks=0;
        int kucuks=0;
        int i=1;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        kacs = inp.nextInt();


            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = inp.nextInt();
            buyuks=sayi;
            kucuks=sayi;
            while(i<kacs) {
                i++;
                System.out.print(i + ". Sayıyı giriniz: ");
                sayi2 = inp.nextInt();

                if (sayi2 > buyuks) {
                    buyuks = sayi2;
                }
                if (sayi2 < kucuks) {
                    kucuks = sayi2;
                }
            }



        System.out.println("En büyük sayı: " + buyuks);
        System.out.println("En küçük sayı: " + kucuks);
    }
}