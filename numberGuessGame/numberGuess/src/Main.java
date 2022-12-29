import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();
        boolean isWin = false;
        boolean isRight = false;
        int right = 0;
        int selected = 0;
        int[] wrong = new int[5];


        System.out.println("------------ Sayı Tahmin Oyunu ------------");
        int number = rnd.nextInt(100);
        System.out.println("5 hakkınız var");
        while (right < 5) {
            System.out.print("Tahmininizi giriniz" + "(" + (right + 1) + ". hakkınız):");
            selected = inp.nextInt();
            if (selected <= 100 || selected > 0) {
                if (selected == number) {
                    isWin = true;
                    break;
                } else {
                    wrong[right] = selected;
                    right++;
                    if (selected < number) {
                        System.out.println(selected + " sayısı gizli sayıdan küçüktür");

                    } else {
                        System.out.println(selected + " sayısı gizli sayıdan büyüktür");

                    }

                }
            } else {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
            }

        }
        if (wrong.length == 5) {
            isRight = false;
        }

        if (!isRight) {
            System.out.println("Haklarınız doldu! Maalesef Oyunu kaybettiniz :( Gizli sayı: " + number);
            System.out.println("Yanlış tahminler:" + Arrays.toString(wrong));
        }
        if (isWin) {
            System.out.println("Tebrikler! oyunu kazandınız! Doğru tahmin: " + selected);
        }


    }
}
