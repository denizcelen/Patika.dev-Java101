import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Sayı Sıralama Programına Hoşgeldiniz!");
        System.out.print("Lütfen sıralamak istedğiniz ilk sayıyı yazınız: ");
        s1=input.nextInt();
        System.out.print("Lütfen sıralamak istedğiniz ikinci sayıyı yazınız: ");
        s2=input.nextInt();
        System.out.print("Lütfen sıralamak istedğiniz üçüncü sayıyı yazınız: ");
        s3=input.nextInt();

        if(s1>s2 && s1>s3){
            if(s2>s3){
                System.out.println("Sayıların Sıralanışı: " + s1 + "," + s2 + "," + s3);
            }
            else if(s2<s3){
                System.out.println("Sayıların Sıralanışı: " + s1 + "," + s3 + "," + s2);
            }
        }
        if(s2>s1 && s2>s3){
            if(s1>s3){
                System.out.println("Sayıların Sıralanışı: " + s2 + "," + s1 + "," + s3);
            }
            else if(s1<s3){
                System.out.println("Sayıların Sıralanışı: " + s2 + "," + s3 + "," + s1);
            }
        }
        if(s3>s1 && s3>s2){
            if(s1>s2){
                System.out.println("Sayıların Sıralanışı: " + s3 + "," + s1 + "," + s2);
            }
            else if(s1<s2){
                System.out.println("Sayıların Sıralanışı: " + s3 + "," + s2 + "," + s1);
            }
        }
        }
    }

