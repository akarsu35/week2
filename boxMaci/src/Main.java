public class Main {
    public static void main(String[] args) {
        //Fighter sınıfından f1 nesnesi oluşturma
        Fighter f1 = new Fighter("Marc" , 15 , 100, 90, 40);
        //Fighter sınıfndan f2 nesnesi oluşturma
        Fighter f2= new Fighter("Alex",15,100,95,45);

        Match match=new Match(f1,f2,80,100);//sporcuların denk olup olmadığını kontrol ediyoruz.


        match.run();
    }
}