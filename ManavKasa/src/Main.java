import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("------------ Manav  Kasa Programı ------------");
        System.out.print("Kaç kg armut alındı?(yoksa 0 giriniz): ");
        Float armut= scanner.nextFloat();
        System.out.print("Kaç kg elma alındı?(yoksa 0 giriniz): ");
        Float elma= scanner.nextFloat();
        System.out.print("Kaç kg domates alındı?(yoksa 0 giriniz): ");
        Float doma= scanner.nextFloat();
        System.out.print("Kaç kg patlıcan alındı?(yoksa 0 giriniz): ");
        Float pat= scanner.nextFloat();
        System.out.print("Kaç kg muz alındı?(yoksa 0 giriniz): ");
        Float muz= scanner.nextFloat();
        float tutar= (float) ((armut*2.14) + (elma*3.67) + (doma*1.11)+ (pat*5)+ (muz*0.95));
        System.out.println("Toplam tutar" + tutar + "TL");
    }
}
