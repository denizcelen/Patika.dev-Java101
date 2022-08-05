import java.util.Scanner;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.print("Lütfen ürünün fiyatını giriniz(TL): ");
    double fiyat= scanner.nextFloat();
    double kdv=fiyat* 0.18;
    double sonuc=kdv+fiyat;

    if(fiyat>1000){
        kdv=fiyat*0.08;
    }
    System.out.println("Ürüne eklencek KDV miktarı: " + kdv+ "TL");
    System.out.println("Ürünün KDV eklenmiş fiyatı: "+ sonuc + "TL");

    }
}