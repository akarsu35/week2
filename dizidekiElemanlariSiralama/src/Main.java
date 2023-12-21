import java.util.Arrays;
import java.util.Scanner;//Scanner sınıfını dahil ediyoruz.
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);//Scanner sınıfından scn nesnesi üretiyoruz.
        /*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını
        kullanıcıdan alınız.

        Senaryo

        Dizinin boyutu n : 5
        Dizinin elemanlarını giriniz :
        1. Elemanı : 99

        2. Elemanı : -2
        3. Elemanı : -2121
        4. Elemanı : 1
        5. Elemanı : 0
        Sıralama : -2121 -2 0 1 99*/
        System.out.println("dizinin kaç elemandan oluşacağını belileyin: ");
        int n=scn.nextInt();//dizinin eleman sayısı

        if(n<0){
            System.out.println("yanlış bir değer girdiniz.");
        }else {
            int[] arr=new int[n];//n değeri 0 yada 0'dan büyükse dizi oluştur.
            for(int i=0;i<n;i++){//dizinin elemanlarını oluştur.
                System.out.println((i+1)+". sayıyı giriniz: ");
                arr[i]=scn.nextInt();
                System.out.println((i+1)+". eleman: "+arr[i]);
            }
            Arrays.sort(arr);//dizinin elemanlarını küçükten büyüğe sırala
            System.out.println(Arrays.toString(arr));//dizinin elemanlarını yaz.
        }



    }
}