import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("------------ Tek Sayıya Kadar Toplama Programı ------------");
        int inp = 0;
        int toplam=0;
        while (inp % 2 == 0){
            System.out.print("Lütfen sayı giriniz: ");
            inp= input.nextInt();
            if(inp%2==0 || inp%4==0){
                toplam=inp+toplam;
            }
            if(inp%2==1){
                break;
            }

        }
        System.out.println("Girilen sayılardan çift ve 4'ün katları olanların toplamı: " + toplam + " dır.");
    }
}
