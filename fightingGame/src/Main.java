

public class Main {


    public static void main(String[] args) {

	Fighter f1= new Fighter("Connor McGregor", 25, 100, 77, 30);
    Fighter f2= new Fighter("Floyd Mayweather", 35, 135, 80, 10);


    Ring ring= new Ring(f1, f2, 75, 85);
    ring.run();
    }

}
