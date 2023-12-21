import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static double harmonik(int[] arr){//diziler için harmonik metodu tanımlıyoruz.
        double sum=0.0;//başlnagıç toplamı
        for(int i=0;i<arr.length;i++){
            sum+=1.0/arr[i];//dizinin herbir elemanını harmonik yapıp topluyoruz.

        }
        return arr.length / sum;//dizinin eleman sayısını dizi ile oluşturulan
                                // harmonik seri toplamına bölüyoruz.

    }

    public static void main(String[] args) {//herhangi bir dizi oluşturup metodu çağırıyoruz.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)+" dizisinin harmonik ortalaması: "+harmonik(numbers));


    }
}
