
import java.util.Scanner;
public class Main {
    static  boolean isPalindrome (int number) {
        int temp=number, reverseNumber=0, lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }

       if(reverseNumber==number){
           return true;
       }
       else{
           return false;
       }
    }
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Palindrom Sayı Programı");
        System.out.print("Lütfen Sayıyı giriniz: ");
        int sayi=inp.nextInt();
        isPalindrome(sayi);
        if(isPalindrome(sayi)==true){
            System.out.println(sayi + " bir palinderom sayıdır");
        }
        else{
            System.out.println(sayi + " bir palinderom sayı değildir");
        }

    }


}


