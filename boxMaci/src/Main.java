public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Marc" , 15 , 100, 90, 50);
        Fighter f2= new Fighter("Alex",15,100,95,25);

        Match match=new Match(f1,f2,80,100);


        match.run();
    }
}