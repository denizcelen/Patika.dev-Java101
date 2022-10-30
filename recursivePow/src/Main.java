
import java.util.Scanner;

public class Main {

    static int pow(int a,int b){
        Scanner inp = new Scanner(System.in);
        int result=1;

        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
        else{

            result= pow(a,(b-1))*a;
        }
        return result;

    }



    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int taban=inp.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int us=inp.nextInt();
        System.out.println("Sonuç: " + pow(taban,us));

    }
}
