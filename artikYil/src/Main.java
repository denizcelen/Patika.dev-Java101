import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("------------ Artık Yıl Hesaplama Porgramı ------------");
        System.out.print("Yıl Giriniz: ");
        int ayil= input.nextInt();
        if(ayil%100==0 &&  ayil%400!=0){
            System.out.println(ayil + " Bir artık yıl değildir!");
        }
        else if(ayil%4==0){
            System.out.println(ayil + " Bir artık yıldır!");
        }
        else{
            System.out.println(ayil + " Bir artık yıl değildir!");
        }


    }
}
