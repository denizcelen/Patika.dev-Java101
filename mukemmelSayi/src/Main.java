import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("--------- Mükemmel Sayı Programı ------------");
        int sayi;
        int bolen=0;
        System.out.print("Lütfen sayı giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                bolen=bolen+i;
            }
        }
        if(bolen==sayi){
            System.out.println(sayi + " bir mükemmel sayıdır.");
        }
        else{
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }
    }
}
