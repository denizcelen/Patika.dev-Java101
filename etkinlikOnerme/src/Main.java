import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    System.out.println("Etkinlik Önerme Programına Hoşgeldiniz!");
    System.out.print("Lütfen Hava Sıcaklığını Giriniz: ");
    int temp= input.nextInt();
    if(temp<5){
        System.out.println("Kayağa gidebilirsiniz.");
    }
    else if (temp>=5 && temp<15){
        System.out.println("Sinemaya gidebilirsiniz.");
    }
    else if(temp>=15 && temp<25){
        System.out.println("Pikniğe gidebilirsiniz.");
    }
    else{
        System.out.println("Yüzmeye gidebilirsiniz.");
    }
    }
}
