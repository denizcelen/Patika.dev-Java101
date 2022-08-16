public class Main {

    public static void main(String[] args) {
	System.out.println("1'den 100'e kadar olan asal sayılar:");
    System.out.print("2 3 5 7 ");
    int sayac=0;
    for(int i=2; i<=100; i++){
        int kal2=i%2;
        int kal3=i%3;
        int kal5=i%5;
        int kal7=i%7;
        if(kal2==0 || kal3==0 || kal5==0 || kal7==0){
            continue;
        }
        else{
            System.out.print(i + " ");
        }
    }
    }
}
