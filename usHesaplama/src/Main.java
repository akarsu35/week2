

import java.util.Scanner;
public class Main {
    static int pow(int a,int n){

        if(n==0){
            return 1;
        }else{
            return a*pow(a,n-1);//n=0 olana kadar fonksiyon
                                    // tekrarlı olarak çağrılır.

        }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //kullanıcıdan taban değerini alıyoruz.
        System.out.println("taban sayısını gir: ");
        int a=input.nextInt();
        //kullanıcıdan üs değerini alıyoruz.
        System.out.println("üssü giriniz: ");
        int n=input.nextInt();

        System.out.println("sonuç: "+pow(a,n));

    }
}