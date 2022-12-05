import java.util.Arrays;

public class Main {

    static boolean isRep(int[] arr, int value, int i ){
        for(int j=0; j<i;j++){
            if(value==arr[j]){
                return false;
            }
        }
        return true;
    }

    static int repCount(int[] arr, int value){
        int counter=0;
        for(int i:arr){
            if(i==value){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
	int arr[]={10,10,20,20,10,20,40,50,50,50,20,40,30,60,70};
        System.out.println("Dizi: "+ Arrays.toString(arr));
        System.out.println("Tekrar eden sayılar:");
        for(int i=0; i< arr.length;i++){
            if(isRep(arr, arr[i],i)&&(repCount(arr, arr[i])>1)){
                System.out.println(arr[i] + " elemanı " + repCount(arr,arr[i]) + " kez tekrar etti");
            }
        }

    }
}

