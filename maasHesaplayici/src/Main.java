

public class Main {
    public static void main(String[] args) {

        Employee emp1=new Employee("cumhur",2500,42,1983);
        Employee emp2=new Employee("ahmet",2000,50,2000);
        emp1.toString(emp1);//kişinin bütün bilgilerini yazdır.
        System.out.println();
        emp2.toString(emp2);

    }

}