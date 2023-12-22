
import java.util.Scanner;//Scanner sınıfını dahil ediyoruz.
public class Main {
    public static boolean isPal(String word) {
        for (int i = 0; i < word.length() / 2; i++) {//kelimenin yarısından önceki harfler ile sonraki harfleri tersten karşılaştırma
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                System.out.println("'"+word+"'" + " kelimesi palindrom bir kelimedir.");
                return true;
            } else {
                System.out.println("'"+word+"'"+" kelimesi palindrom değildir.");
                return true;
            }

        }

        return true;
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sorgulamak istediğiniz kelimeyi giriniz: ");
        String word= input.nextLine();

        isPal(word);

    }
}