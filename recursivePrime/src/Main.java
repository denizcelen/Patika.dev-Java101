import java.util.Scanner;

public class Main {

     static boolean isPrime(int number, int counter){

         if (number==counter||number==2||counter>number/2){
             return true;
        }
        else if((number&counter)==0) {
             return false;
         }

        return isPrime(number,counter+1);

     }




    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
         System.out.print("Lütfen Sayı Giriniz: ");
         int number= inp.nextInt();
         if(isPrime(number,2)==true){
             System.out.println(number + " bir asal sayıdır.");
         }
         else{
             System.out.println(number + " bir asal sayı değildir.");
         }

    }
}
