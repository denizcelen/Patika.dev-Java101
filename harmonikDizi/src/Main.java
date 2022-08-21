import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("------------ Harmonik Dizi Hesaplama Programı ------------");
        int dizi;
        double ters;
        double toplam=0;
        System.out.println("Dizin biteceği sayıyı giriniz: ");
        dizi=inp.nextInt();
        for(double i=1;i<=dizi;i++){
            toplam+=(1/i);

        }
        System.out.println("Dizinin toplamı: " + toplam);
    }
}
