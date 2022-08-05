import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("------------Daire Alan ve Çevre Programı------------");
        System.out.println("Yapmak istedğiniz İşlemi Seçiniz ");
        System.out.print("Alan ve Çevre için 1'i, Daire dilimi alanı için 2'yi tuşlayın: ");
        int sec= scanner.nextInt();
        double pi=3.14;
        if(sec==1){
            System.out.print("Dairenin yarıçapını giriniz: ");
            double r= scanner.nextDouble();
            double alan= pi*r*r;
            double cevre= 2*pi*r;
            System.out.println("Dairenin alanı: " + alan);
            System.out.println("Dairenin çevresi: " + cevre);
        }
        if(sec==2){
            System.out.print("Dairenin yarıçapını giriniz: ");
            double r= scanner.nextDouble();
            System.out.print("Alanı bulunacak dilimin merkez açısını giriniz: ");
            double aci= scanner.nextDouble();
            double dilim= (pi*r*r)*(aci/360);
            System.out.println("Daire diliminin alanı: " + dilim);

        }
        if(sec!=1 && sec!=2){
            System.out.println("Lütfen geçerli bir işlem giriniz");
        }
    }
}
