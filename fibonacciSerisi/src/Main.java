import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("------------ Fibonacci Serisi Hesaplama Programı ------------");
        int seri;
        int eleman1=0;
        int eleman2=1;
        System.out.print("Seri kaç elemanlı olsun?: ");
        seri=inp.nextInt();
        System.out.print(seri + "  elemanlı Fibonacci serisi: " + eleman1 + " "+ eleman2 + " ");
        for(int i=2;i<seri; i++){
            int toplam=eleman1+eleman2;
            System.out.print( toplam + " ");
            eleman1=eleman2;
            eleman2=toplam;

        }
    }
}
