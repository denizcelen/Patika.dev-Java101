import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int matris[][]=new int[2][3];
        int transpoze [][]=new int[3][2];
        System.out.println("------------ Matris Transpozu Bulma Porgramı ------------");
        System.out.print("Matrisin (2x3) elemanlarını giriniz");
        System.out.println("1.Satır elemanları: ");
        for(int i=0; i<3;i++){
            System.out.print((i+1) + " inci eleman: ");
            int eleman= inp.nextInt();
            matris[0][i]=eleman;
        }
        System.out.println("2.Satır elemanları: ");
        for(int i=0; i<3;i++){
            System.out.print((i+1) + " inci eleman: ");
            int eleman= inp.nextInt();
            matris[1][i]=eleman;
        }
        System.out.println(Arrays.deepToString(matris).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        for(int i =0; i<3;i++) {
            for (int j = 0; j < 2; j++) {
                transpoze[i][j] = matris[j][i];
            }
        }

            System.out.println("Matrisin transpozu: ");
        System.out.println(Arrays.deepToString(transpoze).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }
}
