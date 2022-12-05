import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int n;
        int value;
        System.out.print("Dizinin eleman sayısını giriniz: ");
        n=inp.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Dizinin "+ (i+1)+". elemanını giriniz: ");
            value= inp.nextInt();
            arr[i]=value;
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
