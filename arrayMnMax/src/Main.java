
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int [] list={15,12,788,1,-1,-788,2,0};
        System.out.println("Liste: " + list);
        System.out.print("Girilen sayı: ");
        int sayi=inp.nextInt();
        Arrays.sort(list);
        int min=list[0];
        int max=list[7];
        for(int i:list){
            if(i>min&&i<sayi){
                min=i;
            }
            if(i<max&&i>sayi){
                max=i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}
