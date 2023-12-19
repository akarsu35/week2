import java.util.Scanner;

public class Main {
    // Asal sayı kontrolü için recursive metod
    static boolean isPrime(int num, int bolen) {//true yada false durumuna göre değerlendirme yapacağız.
        if(num<2){//2 den küçük sayılar asal sayı değildir dolayısıyla false döndürecek.
            return false;
        }
        if (bolen==1){//bolen'i 1'e kadar getiriyoruz.
            return true;
        }
        if (num % bolen == 0) {
            return false;
        }
        return isPrime(num, bolen - 1);//burada bolen 1 er azalıyor.

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayi=input.nextInt();
        isPrime(sayi,sayi-1);//sayının 1 eksiğinden 1'e kadar bölen arayan metod.
        if(isPrime(sayi,sayi-1)==false){
            System.out.println(sayi+ " sayısı asal değildir.");
        }else {
            System.out.println(sayi+" sayısı asaldır.");
        }


    }
}