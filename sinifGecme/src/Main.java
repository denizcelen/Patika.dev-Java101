import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    System.out.println("------------ Sınıf Geçme Programı ------------");
    int mat, fiz , tur, kim, muz, ort;
    System.out.print("Matematik notunu giriniz: ");
    mat= input.nextInt();
    if(mat<0 || mat>100){
        mat=0;
    }
    System.out.print("Fizik notunu giriniz: ");
    fiz= input.nextInt();
    if(fiz<0 || fiz>100){
        fiz=0;
        }
    System.out.print("Türkçe notunu giriniz: ");
    tur= input.nextInt();
    if(tur<0 || tur>100){
        tur=0;
    }
    System.out.print("Kimya notunu giriniz: ");
    kim= input.nextInt();
    if(kim<0 || kim>100){
        kim=0;
    }
    System.out.print("Müzik notunu giriniz: ");
    muz= input.nextInt();
    if(muz<0 || muz>100){
        muz=0;
    }

    ort= (mat+fiz+tur+kim+muz)/5;
    if(ort>=55){
        System.out.println("Tebrikler sınıf geçtiniz!" + "Ortalamanız: " + ort);
    }
    else{
        System.out.println("Maalesef sınıfta kaldınız:( " + "Ortalamanız: " + ort);
    }
    }
}
