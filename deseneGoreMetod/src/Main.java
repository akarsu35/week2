import java.util.Scanner;
public class Main {
    static int desen(int baslangic,int i){

        if(i>0){
            System.out.println("azaltma: "+baslangic);
            return baslangic-=5*i;

        }
        if(i<0){
            System.out.println("arttırma: "+baslangic);
            return baslangic+=5*i;

        }
        return baslangic+desen(baslangic,baslangic/5-1);


    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        int sayi= input.nextInt();

        desen(sayi,5);
        System.out.println(desen(sayi,5));
    }


}