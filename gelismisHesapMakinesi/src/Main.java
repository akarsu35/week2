
import java.util.Scanner;//Scanner sınıfını dahil ediyoruz.
public class Main {
/*1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı*/

    //toplama işlemi
    static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int number;
            System.out.println(i+". sayı: ");
            number = input.nextInt();
            result += number;

        }
        System.out.println("toplam: " + result);


    }
    //çıkarma işlemi
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }
    //çarpma  işlemi
    static void times(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result *= number;
                continue;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    //bölme işlemi
    static void divided() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number;
        double result=1.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
           number = scan.nextInt();
            if (i == 1) {
                System.out.println("bölen girmelisiniz: ");
                result=number;
                continue;
            }else if(number==0){
                System.out.println("sayı 0'a bölünemez.");
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    //üs alma işlemi
    static int pow(int a,int b){
        Scanner input=new Scanner(System.in);
        System.out.println("taban sayısı: ");
        a= input.nextInt();
        System.out.println("Üs sayısı: ");
        b= input.nextInt();
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(a+"^"+b+" = "+result );
        return result;
    }
    //faktöriyel alma işlemi
    static int factorial(int a){
        Scanner input=new Scanner(System.in);
        System.out.println("faktöriyelini almak istediğiniz sayı: ");
        a= input.nextInt();
        int result=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println(a+"! = "+result);
        return result;
    }
    //bir sayının(bölünen) başka bir sayıya(bölüm) bölümünden kalan(mod) işlemi
    static int mod(int a,int b){
        Scanner input=new Scanner(System.in);
        System.out.println("bölünen sayı: ");
        a= input.nextInt();
        System.out.println("bölen sayı: ");
        b= input.nextInt();
        int result=a%b;
        System.out.println(a+" sayısının "+b+" ile bölümünden kalan "+result);
        return result;
    }
    //dikdörtgenin alan ve çevresi
    static int alanCevre(int a,int b){
        Scanner input=new Scanner(System.in);
        System.out.println("dikdörtgenin birinci kenar uzunluğu: ");
        a= input.nextInt();
        System.out.println("dikdörtgenin ikinci kenar uzunluğu: ");
        b= input.nextInt();
        int result1=a*b;
        int result=2*(a+b);
        System.out.println("dikdörtgenin alanı: "+result1+"\ndikdörgenin çevresi: "+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        //işlemler
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:


                    plus();
                    break;
                case 2:

                    minus();
                    break;
                case 3:

                    times();
                    break;
                case 4:

                    divided();
                    break;
                case 5:

                    pow(1,1);
                    break;
                case 6:

                    factorial(1);
                    break;
                case 7:

                    mod(1,1);
                    break;
                case 8:

                    alanCevre(1,1);
                    break;

                default:
                    System.out.println("Güle güle...");
                    break;
            }
        }while (select!=0);
    }
}