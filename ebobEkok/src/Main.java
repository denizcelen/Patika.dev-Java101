import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("EBOB - EKOK Hesaplama Programı");
        int s1, s2,kucuks;
        int ebob=1;
        int i=1;
        int ekok;
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        s1= inp.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        s2= inp.nextInt();
        if(s1<s2){
            kucuks=s1;
        }
        else{
            kucuks=s2;
        }
        while(i<kucuks){
            i++;
            if(s1%i==0 && s2%i==0){
                ebob=i;
                break;
            }
        }
         ekok=(s1*s2)/ebob;
        System.out.println(s1 + " ve " + s2 + " sayılarının EBOB'u: " + i + ", " + "EKOK'u: " + ekok + "dir.");

    }
}
