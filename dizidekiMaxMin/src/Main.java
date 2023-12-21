import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int num = 2;
        int min;
        int max;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(num<arr[0]){
            System.out.println(num+" sayısından daha küçük bir sayı yok.");
            System.out.println( num+" sayısından büyük en yakın sayı: "+arr[0]);
        } else if (num>arr[arr.length-1]) {
            System.out.println(num+" sayısından daha büyük bir sayı yok.");
            System.out.println(num+" sayısından küçük en yakın sayı: "+arr[arr.length-1]);

        }else{
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
