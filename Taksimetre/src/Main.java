import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Taksimetreye hoşgeldiniz! ");
        System.out.print("Lütfen gidilen mesafeyi giriniz(KM): ");
        double mesafe = scanner.nextDouble();
        double tutar = 10+(mesafe*2.20);
        if(tutar<=20){
            System.out.println("Taksi ücreti: 20 TL");
        }
        else{
            System.out.println("Taksi ücreti: " + tutar + "TL");
        }
    }
}
