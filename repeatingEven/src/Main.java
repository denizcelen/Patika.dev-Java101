import java.util.Arrays;
public class Main {

    static boolean isFind(int[] arr, int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
	int[] list={1,2,3,6,8,6,3,3,5,7,8,4,4,6,7,8,9,6,3};
    int startIndex=0;
    int[]temp=new int[list.length];
    for(int i=0; i<list.length;i++){
        for(int j=0; j<list.length; j++){
            if((i!=j)&&(list[i]==list[j])&&(list[i]%2==0)){
                if (!isFind(temp,list[i])){
                    temp[startIndex++]=list[i];
                }
                break;
            }
        }
    }
    for(int i=0; i<temp.length;i++){
        if(temp[i]!=0) {
            System.out.print(temp[i] + " ");
        }
    }


        }
    }
