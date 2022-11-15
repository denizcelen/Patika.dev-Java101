import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String[][] letB= new String[7][4];

        for(int i=0; i<letB.length;i++){
            for(int j=0; j<letB[i].length;j++){
                if((i==1 || i==2 || i==4 || i==5)&&(j==1 ||j==2)){
                    letB[i][j]=" ";
                }
                else{
                    letB[i][j]="*";
                }
            }
        }
        for(int i =0; i< letB.length; i++){
            for(int j=0; j<letB[i].length;j++){
                System.out.print(letB[i][j]);
                if(j==3){
                    System.out.println();
                }
            }
        }
    }
    }
