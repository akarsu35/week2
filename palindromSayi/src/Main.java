

public class Main {
    static boolean isPalindrom(int number){//metod tanımlıyoruz.
        int temp=number;//number değişkenini temp e atıyoruz.number enson kıyaslama için bize lazım.
        int bolum=0;//sayının her seferinde 10 ile bölümünden elde edilen bölüme bakacağız
        int sonBas;//son basamak
        int tersNumber=0;//sayının tersini oluşturmak için 10 ile bölümünden kalanı
                        // ekleyerek basamakları oluşturacağız.
        while (temp!=0){

            sonBas=temp%10;//basamakları bulmak için elde edilen bölümlerin 10 ile bölümünden kalanı bulacağız.
            tersNumber=(tersNumber*10)+sonBas;//tersNumber başta 0(sıfır),kalanı ekleyeceğiz.
            temp/=10;//sayıyı 10 ile bölüp bölümü elde ediyoruz.
                    //yukarıdaki döngü bölüm 0(sıfır) olana kadar devam edecek.
                    //not:(tersNumber*10)+sonBas---kodu tersNumber ın sırasıyla birler-onlar-yüzler-... basamaklarını oluşturmak için
        }
        if (tersNumber==number)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(12321));
    }
}