public class Main {
    public static void main(String[] args) {
        int[][] arr = {{2, 3,8}, {5, 6,4}};// Matrisimizi tanımlıyoruz.
        int[][] arrT = new int[arr[0].length][arr.length];// Matrisin transpozu için yeni bir matris tanımlıyoruz.
        for (int i = 0; i < arr.length; i++) {// Matrisin satırlarını kontrol etmek için bir döngü başlatıyoruz.
            for (int j = 0; j < arr[0].length; j++) {// Matrisin sütunlarını kontrol etmek için bir iç döngü başlatıyoruz.
                arrT[j][i] = arr[i][j];
            }
        }
        System.out.println("Matris : ");//matrisi yazdırıyoruz.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("matrisin tranpozu : ");//matrisin transpozunu yazdırıyoruz.
        for (int i = 0; i < arrT.length; i++) {
            for (int j = 0; j < arrT[0].length; j++) {
                System.out.print(arrT[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
