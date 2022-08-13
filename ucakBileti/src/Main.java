import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas, tip;

        System.out.println("------------ Uçak Bileti Fiyatı Hesaplama ------------");
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        int km = input.nextInt();
        float bfiyat = (float) (km * 0.1);
        float ind12= (float) (bfiyat*0.5);
        float ind1224= (float) (bfiyat*0.1);
        float ind65= (float) (bfiyat*0.3);
        float sfiyat=bfiyat;
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();
        if ((tip == 1 || tip == 2) && km > 0) {

                if (yas < 12) {
                    sfiyat = (float) bfiyat-ind12;
                } else if (yas >= 12 && yas <= 24) {
                    sfiyat = (float) bfiyat-ind1224;
                } else if (yas > 65) {
                    sfiyat = (float) bfiyat-ind65;
                }
                else{
                    sfiyat=bfiyat;
                }
                if(tip==2){
                    sfiyat= (float) (2*(sfiyat*0.8));
                }
                System.out.println("Toplam tutar: " + sfiyat + "TL");
            }

        else{
            System.out.println("Hatalı Veri Girdiniz");
        }


    }
}