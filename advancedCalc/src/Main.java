import java.util.Scanner;

public class Main {
    static void plus(){
        Scanner inp= new Scanner(System.in);
        int i, sonuc=0,sayi;
        while(true){
        System.out.println("Sayıyı giriniz (0 işlemi sonlandırır): ");
        sayi= inp.nextInt();

        if(sayi==0){
            break;
        }
            sonuc+=sayi;
        }
        System.out.println("Sayıların toplamı: " + sonuc);
    }

    static void sub(){
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç adet sayı girilecek?: ");
        int counter= inp.nextInt();
        int number, result=0;

        for(int i=1; i<=counter;){
            System.out.print(i + ". sayı: ");
            number=inp.nextInt();
            i++;

            if(i==1){
                result+=number;
                continue;
            }
            result=(result*-1)-number;
        }
        System.out.println("Sayıların Farkı: " + result);
    }

    static void times(){
        Scanner inp= new Scanner(System.in);
        int i=1;
        int result=1;
        int number=1;

        while(true){
            System.out.print(i + ".sayı: (1 girmek işlemi sonlandırır.)");
            number= inp.nextInt();
            if(number==1){
                break;
            }
            if(number==0){
                result=0;
                break;
            }
            result*=number;
            System.out.println("Sayıların çarpımı: " + result);

        }
    }

    static void div(){
        Scanner inp= new Scanner(System.in);
        float sayi1,sayi2,result=1;
        System.out.print("İlk sayıyı giriniz: ");
        sayi1= inp.nextFloat();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2= inp.nextFloat();
        if(sayi1!=1 && sayi2!=0){
            result=sayi1/sayi2;
            System.out.println("Sayıların Bölümü: " + result);
        }
        else if(sayi1==1&& sayi2!=0){
            result=1;
            System.out.println("Sayıların Bölümü: " + result);
        }

        else if(sayi2==0){
            System.out.println("Bölen 0 olamaz. lüften tekrar deneyin.");
        }


    }

    static void pow (){
        Scanner inp= new Scanner(System.in);
        int as, us, result=1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        as= inp.nextInt();
        System.out.print("Sayının üssünü giriniz: ");
        us= inp.nextInt();
        if(us==0){
            result=1;
        }
        for(int i=1;i<=us;i++){
            result*=as;
        }

        System.out.println("Sonuç: " + result);
    }

    static void fact(){
        Scanner inp= new Scanner(System.in);
        int number, result =1;
        System.out.print("Faktöriyeli alınacak sayı?: ");
        number=inp.nextInt();
        for(int i=1; i<=number;i++){
            result *=i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod(){
        Scanner inp= new Scanner(System.in);
        int sum=1;
        int result,number=1;
        System.out.println("Aritmetik ortalama (mod işlemi):");
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter= inp.nextInt();
        for(int i=1;i<=counter;i++){
            System.out.println(i+ " .sayıyı giriniz");
            number=inp.nextInt();
            sum+=number;
        }
        result=sum/counter;
        System.out.println("Sayıların aritmetik ortalaması (modu): " + result);
        }

    static void cev(){
        Scanner inp= new Scanner(System.in);
        int kenar1, kenar2, cevre, alan =0;
        System.out.println("Dikdörtgen Çevresi Hesaplama Programı");
        System.out.print("1. Kenarı giriniz: ");
        kenar1=inp.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        kenar2=inp.nextInt();
        cevre =2*(kenar1+kenar2);
        alan=kenar1*kenar2;
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
        System.out.println("Dikdörtgenin Alanı: " + alan);
    }









    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("------------ Gelişmiş Hesap Makinesi ------------");
        String menu="1- Toplama İşlemi\n" +
        "2- Çıkarma İşlemi\n" +
        "3- Çarpma İşlemi\n" +
        "4- Bölme işlemi\n" +
        "5- Üslü Sayı Hesaplama\n" +
        "6- Faktoriyel Hesaplama\n" +
        "7- Mod Alma\n" +
        "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
        "0- Çıkış Yap";
        int select;

        do{
        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz: ");
        select=inp.nextInt();
        switch(select){
            case 1:
                plus();
                break;
            case 2:
                sub();
                break;

            case 3:
                times();
                break;

            case 4:
                div();
                break;

            case 5:
                pow();
                break;

            case 6:
                fact();
                break;

            case 7:
                mod();
                break;

            case 8:
                cev();
                break;

            case 0:
                System.out.println("Görüşmek Üzere");
                break;


            default:
                System.out.println("Yanlış bir işlem seçtiniz lütfen tekrar deneyiniz.");
        }






        }while (select!=0);



    }
}
