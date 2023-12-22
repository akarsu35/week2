import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr={10, 20, 20,20, 10, 10, 20, 5,5, 20};
        Arrays.sort(arr); // Dizideki elemanları küçükten büyüğe sırala

        for(int i=0; i<arr.length; i++) {
            int count=1;
            while(i<arr.length-1 && arr[i]==arr[i+1]) {
                count++;
                i++;
            }
            if(count>=1) {
                System.out.println(arr[i]+" sayısı "+ count+" kere tekrar edildi.");
            }
        }
    }
}