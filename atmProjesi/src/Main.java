import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select=0;
        int userc=0;
        int passc=0;
        while (right > 0 && userc==0 || passc==0 ) {
            System.out.print("Kullanıcı adınız: ");
            String userName = input.nextLine();
            System.out.print("Parolanız: ");
            String password = input.nextLine();

            switch (userName) {
                case ("patika"):
                    userc=1;
                    break;
                default:
                    System.out.println("Tekrar deneyin, kalan hakkınız:  " + right);
                    right--;
                    continue;
            }
            switch (password) {
                case ("dev"):
                    passc=1;
                    break;
                default:
                    System.out.println("Tekrar deneyin, kalan hakkınız:  " + right);
                    right--;
                    continue;
            }
            switch (right){
                case 1:
                    continue;
                case 2:
                    continue;
                case 3:
                    continue;
                case 0:
                    System.out.println("Çok fazla hatalı giriş yaptınız. Lütfen daha sonra tekrar deneyin.");
                    break;
            }
            break;

        }
        while(select<4 && right>0) {
            System.out.println("1-Para yatırma\n" +
                    "2-Para Çekme\n" +
                    "3-Bakiye Sorgula\n" +
                    "4-Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Yatıralcak miktar: ");
                    int price = input.nextInt();
                    balance = price + balance;
                    continue;

                case 2:
                    System.out.print("Çekilecek miktar: ");
                    int price2 = input.nextInt();
                    balance = balance - price2;
                    continue;

                case 3:
                    System.out.println("Bakiyeniz: " + balance);
                    continue;

                case 4:
                    System.out.println("Tekrar görüşmek üzere");
                    break;
            }

        }

    }
}
