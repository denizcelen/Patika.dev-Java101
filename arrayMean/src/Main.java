import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double[] list={1,2,3,4,5};
        int sum=0;
        double har=0;
        for(int i=0;i<list.length; i++){
            sum+=list[i];
        }
        System.out.println("Dizinin ortalaması: " + (sum/list.length));
        for(int j=0;j<list.length; j++){
            list[j]=1/list[j];
            har+=list[j];
        }
        System.out.println("Dizinin Harmonik Ortalaması: " + (list.length/har));
    }
}
