    int sozluMat;//matematik sözlü notu
    int sozluFzk;//fizik sözlü notu
    int sozluKim;//kimya sözlü notu
    double courseOran=0.8;//sınavın dersin ortalamasına etkisi
    double sozluOran=0.2;//sözlünün dersin ortalamasına etkisi
    double matAvarage,fizikAvarage,kimyaAvarage;//ders ortalamaları

    Course mat = new Course("Matematik", "MAT101", "MAT");//Corse sınıfından mat dersi oluşturma
    Course fizik = new Course("Fizik", "FZK101", "FZK");//Course sınıfında fizik dersi oluşturma
    Course kimya = new Course("Kimya", "KMY101", "KMY");//Course sınıfından kimya dersi oluşturma

    Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");//Teacher sınıfından t1 öğretmeni oluşturma
    Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");//Teacher sınıfından t2 öğretmeni oluşturma
    Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");//Teacher sınıfından t2 öğretmeni oluşturma

    mat.addTeacher(t1);//matematik dersine t1 öğretmeni atama
    fizik.addTeacher(t2);//fizik dersine fizik öğretmeni atama
    kimya.addTeacher(t3);//kimya dersine kimya öğretmeni atama

        
     //Student sınıfından s1,s2 ve s3 öğrencileri oluşturup bunların sınav bilgilerine göre kaldı geçti çıktısı veriliyor.
    Student s1 = new Student("İnek Şaban",4,"121321",mat,fizik,kimya);
    s1.addBulkExamNote(100,0,100,100,100,100);
    s1.isPass();
