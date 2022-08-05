import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("------------ Vücüt Kütle İndeksi Programı ------------");
        System.out.print("Lütfen boyunuzu giriniz(cm): ");
        double boy= scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz(kg): ");
        double kilo= scanner.nextDouble();
        double bmi= kilo/(Math.pow((boy/100),2));
        System.out.println("Vücüt Kütle İndeksinz: " + bmi);

    }
}
