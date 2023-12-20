public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");//Corse sınıfından mat dersi oluşturma
        Course fizik = new Course("Fizik", "FZK101", "FZK");//Course sınıfında fizik dersi oluşturma
        Course kimya = new Course("Kimya", "KMY101", "KMY");//Course sınıfından kimya dersi oluşturma

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");//Teacher sınıfından t1 öğretmeni oluşturma
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");//Teacher sınıfından t2 öğretmeni oluşturma
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");//Teacher sınıfından t2 öğretmeni oluşturma

        mat.addTeacher(t1);//matematik dersine t1 öğretmeni atama
        fizik.addTeacher(t2);//fizik dersine fizik öğretmeni atama
        kimya.addTeacher(t3);//kimya dersine kimya öğretmeni atama

        System.out.println("");
        //Student sınıfından s1,s2 ve s3 öğrencileri oluşturup bunların sınav bilgilerine göre kaldı geçti çıktısı veriliyor.
        Student s1 = new Student("İnek Şaban",4,"121321",mat,fizik,kimya);
        s1.addBulkExamNote(100,0,100,100,100,100);
        s1.isPass();
        //s1.printNote();
        System.out.println("====================");


        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(80,100,100,100,100,50);
        s2.isPass();
        //s2.printNote();
        System.out.println("====================");

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40,40,40,40);
        s3.isPass();
        //s2.printNote();
        System.out.println("====================");

    }
}