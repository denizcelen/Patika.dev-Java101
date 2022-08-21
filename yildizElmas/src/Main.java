import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("------------ Yıldız Elmas Programı ------------");
        System.out.print("Sayı giriniz: ");
        int bas = inp.nextInt();
        int bos =bas;

        String star = "*";
        String bosluk=" ";
        for(int i=1;i<bas+1; i++) {
            bos--;
            System.out.println(bosluk.repeat(bos) + star.repeat(2*i-1));
        }
        bos=0;
        while (bas>0){
            bas--;
            bos++;
            System.out.println(bosluk.repeat(bos) + star.repeat(2*bas-1));
            if(bas==1){
                break;
            }
        }


    }
}
