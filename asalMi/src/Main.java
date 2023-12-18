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
        isPrime(sayi,sayi-1);/* bolen değerini girilen sayıdan (sayi) bir önceki sayı ile başlatıp 1'e kadar gidiyoruz.
                                  çünkü,girilen sayının(sayi) bütün bölenlerini kendisi ve kendisinden küçük sayılardan bazıları ouşturur.
                                   ancak biz kendisine ve 1'e bölünüp bölünmediğini kontrol etmeyeceğiz.çünkü sayılar kendisine ve 1'e bölünür,
                                   1'e kadar olan sayılardan böleni varsa [" if (num%bolen==0){return false;}" bloğuna girer] dolayısıyla sayı asal olmaz.
                                   eğer 1'e kadar hiç bir bloğa girmezse doğal olarak "if(bolen==1){return true;}" bloğuna girecek.
                                   yani sayının (sayi) 1'e kadar hiçbir böleni yoktur sayı asaldır.*/
        if(isPrime(sayi,sayi-1)==false){
            System.out.println(sayi+ " sayısı asal değildir.");
        }else {
            System.out.println(sayi+" sayısı asaldır.");
        }


    }
}