import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String inp) {
        StringBuilder sb = new StringBuilder(inp);
        String reversedInput = sb.reverse().toString();
        return inp.equalsIgnoreCase(reversedInput);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Palindrom Kelime Kontrol Programı");
        System.out.print("Lütfen kontrol edliecek kelimeyi girin: ");
        String inp = input.nextLine();
        if (isPalindrome(inp)) {
            System.out.println(inp + " bir palindorme kelimedir.");
        } else {
            System.out.println(inp + " bir palindrom kelime değildir.");
        }
    }
}

