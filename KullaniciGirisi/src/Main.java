import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    String userid;
    String pass_i;
    userid= "patika";
    pass_i= "java123";
    System.out.println("Paitka.dev arayüzüne hoşgeldiniz");
    System.out.print("Lütfen Kullanıcı adınızı giriniz: ");
    String userg= input.nextLine();
    System.out.print("Lütfen şifrenizi giriniz: ");
    String pass_g= input.nextLine();
    if((userid.equals(userg)) && pass_i.equals(pass_g)){
       System.out.println("Sisteme giriş yaptınız");
    }
    else{
        System.out.println("Kullanıcı adı ve şifre yanlış");
        System.out.println("Yeni bir şifre belirlemek için 'E', sistemden çıkmak için 'H' tuşlayın : ");
        String sec= input.nextLine();
        if(sec.equalsIgnoreCase("E")){
            System.out.println("Yeni  şifrenizi giriniz: ");
            String pass_new= input.nextLine();
            if(pass_new.equals(pass_i)){
                System.out.println("Yeni şifreniz eski şifreniz ile aynı olamaz");
            }
            else{
                pass_i=pass_g;
                System.out.println("şifreniz başarıyla değiştirildi");
            }
        }
        if(sec.equalsIgnoreCase("H")){
            System.out.println("Sistemden çıkış yapıldı.");
        }
    }
    }
    }

