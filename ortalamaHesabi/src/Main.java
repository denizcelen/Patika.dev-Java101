import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ortalama Hesaplama Programı");
        System.out.print("DÖngünün sonlanacağı sayıyı giriniz: ");
        int k= input.nextInt();
        int toplam =0;
        int sayi =0;
        int i=1;


        while(i <=k){
            i++;
            if(i %12==0){
                sayi=sayi+i;
                toplam++;
            }

        }
        int orta= sayi / toplam;
        if(sayi !=0){

            System.out.println(k + "'ya kadadr olan 3'e ve 4'e bölünen sayıların ortalaması: "+ orta+ "dir.");
        }
        else{
            System.out.println(sayi + "'ye kadar 3'e 4e bölünen sayı yoktur'" );
        }

    }
}
