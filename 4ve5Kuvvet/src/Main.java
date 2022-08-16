import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("------------ 4 ve 5'in Kuvvetlerini Bulan Program ---------");
        System.out.print("Lütfen Sayıyı giriniz: ");
        int sayi= input.nextInt();
        for(int kuvvet4 = 1; kuvvet4<sayi; kuvvet4*=4){
            System.out.println(sayi + "'dan küçük 4'ün kuvvetleri");
            System.out.println(kuvvet4);
        }
        System.out.println("----------------------------");
        for(int kuvvet5=1; kuvvet5<sayi; kuvvet5*=5){
            System.out.println(sayi + "'dan küçük 5'ün kuvvetleri");
            System.out.println(kuvvet5);
        }



    }
}
