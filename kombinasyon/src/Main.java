import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama Programı");
        System.out.print("Toplam eleman sayısını giriniz: ");
        int n = input.nextInt();
        System.out.print("kaçlı kobinasyon olacak? : ");
        int r = input.nextInt();
        int fark = n - r;
        double fakn = 1;
        double fakr=1;
        double fakk=1;
        if (n<r) {
            System.out.println("Lütfen girdiğiniz değerleri kontrol ediniz.");
        } else {
            for (int i =1; i<=n; i++) {
                 fakn = fakn*i;
            }
            for(int j=1; j<=r; j++){
                fakr=fakr*j;
            }
            for(int k=1;k<=fark; k++){
                fakk=fakk*k;
            }
            double komb = fakn / (fakr * fakk);
            System.out.println(n + " sayısının " + r + " li kombinasyonu: " + komb);
        }
    }
}
