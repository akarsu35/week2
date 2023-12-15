

public class Main {
    static int fibonacci(int n){
        int result=0;
        for(int i=1;i<=n;i++){
            if(n==1||n==2){//fibonaccinin ilk iki terimi 1 ve 1 dir.
                result=1;
            }else {
                result=fibonacci(n-1)+fibonacci(n-2);//fibonacci de istenilen basamaktaki terimi bulmak için;
                                                            // kendisinden önceki iki terimi toplarız.
           }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(11));




    }
}
