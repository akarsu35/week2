import java.util.Arrays;

public class Main {
    public static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={3,7,3,9,2,10,21,1,33,10,9,1};
        int[] duplicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i< list.length;i++){
            for(int j=0;j< list.length;j++){
                if((i!=j) && (list[i]%2==0)&&(list[i]==list[j])){
                    if(!isFind(duplicate,list[i])){
                        duplicate[startIndex++]=list[i];
                    }
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(duplicate));

        for (int value:duplicate){
            if((value!=0)&&(value%2==0)){
                System.out.println(value);
            }else if((value==0)){
                System.out.println("dizide tekrar eden çift sayı yok");
                break;
            }
        }
    }
}