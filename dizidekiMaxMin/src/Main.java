import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};//dizi
        int num = 12;//girilecek sayı
        int min;//girilen sayıdan küçük en yakın sayı
        int max;//girilen sayıdan büyük en yakın sayı
        Arrays.sort(arr);//diziyi küçükten büyüğe doğru sıralama
        System.out.println(Arrays.toString(arr));
        //sayı, dizideki en küçük sayıdan küçük ise
        if(num<arr[0]){
            System.out.println(num+" sayısından daha küçük bir sayı yok.");
            System.out.println( num+" sayısından büyük en yakın sayı: "+arr[0]);
        } else if (num>arr[arr.length-1]) {//sayı,dizideki en büyük sayıdan büyük ise
            System.out.println(num+" sayısından daha büyük bir sayı yok.");
            System.out.println(num+" sayısından küçük en yakın sayı: "+arr[arr.length-1]);

        } else if (arr[0]==num) {
            System.out.println(num+" sayısından daha küçük bir sayı yok.");
            System.out.println( num+" sayısından büyük en yakın sayı: "+arr[1]);
        } else if (arr[arr.length-1]==num) {
            System.out.println(num+" sayısından daha büyük bir sayı yok.");
            System.out.println(num+" sayısından küçük en yakın sayı: "+arr[arr.length-2]);
        } else{//girilen sayı, en büyük ile en küçük arasında ise
            for(int i=0;i< arr.length;i++){
                if(arr[i]>num) {
                    max = arr[i];
                    min = arr[i - 1];
                    System.out.println("girilen sayıdan büyük en yakın sayı: " + max);
                    System.out.println("girilen sayıdan küçük en yakın sayı: " + min);
                    break;

                }
                else if(arr[i]==num){
                    max=arr[i+1];
                    min=arr[i-1];
                    System.out.println("girilen sayıdan büyük en yakın sayı: "+max);
                    System.out.println("girilen sayıdan küçük en yakın sayı: "+min);
                    break;
                }

            }

        }

    }
}
