import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Burç Hesaplama Programına Hoşgeldiniz");
        System.out.println("Kaçıncı Ayda Doğdunuz?");
        int month= input.nextInt();
        System.out.println("Ayın Kaçında Doğdunuz?");
        int day= input.nextInt();
        String sign = null;
        if((day>31 || month>12 || day==0)||(month==2 && day>29)){
            System.out.println("Girdiğiniz bilgiler hatalıdır. Lütfen tekrar deneyiniz.");
        }
        else{
            if(month==1){
                if(day<=21){
                    sign= "Oğlak";
                }
                else{
                    sign= "Kova";
                }
        }
            if(month==2) {
                if (day >= 20) {
                    sign = "Balık";
                } else {
                    sign = "Kova";
                }
            }
            if(month==3){
                if(day<21){
                    sign= "Balık";
                }
                else{
                    sign= "Koç";
                }
            }
            if(month==4){
                if(day<21){
                    sign= "Koç";
                }
                else{
                    sign= "Boğa";
                }
            }
            if(month==5){
                if(day<22){
                   sign= "Boğa";
                }
                else{
                    sign= "İkizler";
                }
            }
            if(month==6){
                if(day<23){
                    sign= "İkizler";
                }
                else{
                    sign= "Yengeç";
                }
            }
            if(month==7){
                if(day<23){
                    sign= "Yengeç";
                }
                else{
                    sign="Aslan";
                }
            }
            if(month==8){
                if(day<23){
                    sign="Aslan";
                }
                else{
                    sign= "Başak";
                }
            }
            if(month==9){
                if(day<23){
                    sign= "Başak";
                }
                else{
                    sign="Terazi";
                }
            }
            if(month==10){
                if(day<23){
                    sign="Terazi";
                }
                else{
                    sign="Akrep";
                }
            }
            if(month==11){
                if(day<22){
                    sign="Akrep";
                }
                else{
                    sign="Yay";
                }
            }
            if(month==12){
                if(day<22){
                    sign="Yay";
                }
                else{
                    sign="Oğlak";
                }
            }
            System.out.println("Burcunuz: " + sign);
            }

        }
    }

