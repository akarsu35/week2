
import java.util.Random;//random sayı sınıfın dahil ediyoruz.
import java.util.Scanner;//Scanner sınıfını dahil ediyoruz.

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String name;
        int right=2;//deneme hakkı 3 olacak
        int number;
        boolean dongu=true;//while döngüsünün devamı için

        int randomNumber= random.nextInt(100);

        //**********************************************************
        //System.out.println("random sayımız: "+randomNumber);// random sayı kontrolu için bu kodu açabilirsin

        System.out.println("Adınızı giriniz: ");
        name=input.nextLine();
        System.out.println("0 ile 100 arasında bir sayı giriniz:");
        number=input.nextInt();

        while (dongu&&right!=0) {
            if(number<0||number>100){
                System.out.println("sayın "+name+" 0 ile 100 arasında bir değer giriniz: ");
                System.out.println("sayın " + name + " " + right + " hakkınız kaldı.");
                number = input.nextInt();
                right -= 1;
                if (right == 0) {//kalan hakkı sıfırsa
                    System.out.println(name + " maalesef hakkınız bitti.");
                    dongu = false;

                }

            } else if (number == randomNumber) {//girilen sayı random numaraya eşitse
                System.out.println(name + " bildiniz, tebrikler!");
                break;
            } else if (number < randomNumber) {//girilen sayı random numaradan küçükse

                System.out.println("büyük bir sayı giriniz: ");
                System.out.println("sayın " + name + " " + right + " hakkınız kaldı.");
                number = input.nextInt();
                right -= 1;
                if (number == randomNumber) {//random sayıyı bilip bilmidiğinin kontrolu
                    System.out.println(name + " bildiniz, tebrikler!");
                    break;
                }
                else if (right == 0&&number!=randomNumber) {//kalan hakkı sıfırsa
                    System.out.println(name + " maalesef hakkınız bitti.");
                    dongu = false;

                }


            }else if (number > randomNumber) {//girilen sayı random numaradan büyükse

                System.out.println("küçük bir sayı giriniz: ");
                System.out.println("sayın " + name + " " + right + " hakkınız kaldı.");
                number = input.nextInt();
                right -= 1;
                if (number == randomNumber) {//random sayıyı bilip bilmidiğinin kontrolu
                    System.out.println(name + " bildiniz, tebrikler!");
                    break;
                }
                else if (right == 0) {//kalan hakkı sıfırsa
                    System.out.println(name + " maalesef hakkınız bitti.");
                    dongu = false;

                }

            }

        }


    }
}


