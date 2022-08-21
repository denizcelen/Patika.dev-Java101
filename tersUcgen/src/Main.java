import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("------------ Ters Üçgen Programı ------------");
        int bas;
        String star="*";
        System.out.print("Üçgen kaç satır olsun?: ");
        bas=inp.nextInt();
        bas=bas+1;
        while(bas>0){
            bas--;
            System.out.println(star.repeat(bas));
        }
    }
}
