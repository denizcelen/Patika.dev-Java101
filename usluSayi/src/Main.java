import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("------------ Üslü Sayı Hesaplama Programı ------------");
        System.out.print("Kuvveti(üssü) alınacak sayıyı giriniz: ");
        int alt= input.nextInt();
        System.out.print("Kuvvet(üs) olacak sayıyı giriniz: ");
        int ust= input.nextInt();
        int sonuc=1;
        for(int i=1;i<=ust;i++){
            sonuc=sonuc*alt;
        }
        System.out.println(alt + "'in " + ust + "'inci kuvveti: " + sonuc);
    }
}
