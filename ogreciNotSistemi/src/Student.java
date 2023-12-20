public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    int sozluMat;
    Course fizik;
    int sozluFzk;
    Course kimya;
    int sozluKim;
    double avarage;
    boolean isPass;
    double courseOran=0.8;
    double sozluOran=0.2;
    double matAvarage,fizikAvarage,kimyaAvarage;




    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;

        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int matsozlu,int fzksozlu,int kmysozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;

        }
        if(matsozlu>=0&&matsozlu<=100){
            this.sozluMat=matsozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (fzksozlu>=0&&fzksozlu<=100){
            this.sozluFzk=fzksozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (kmysozlu>=0&&kmysozlu<=100){
            this.sozluKim=kmysozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0||this.sozluMat==0||this.sozluFzk==0||this.sozluKim==0) {
            System.out.println("Notlar tam olarak girilmemiş: "+this.name);
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizikAvarage=this.fizik.note*courseOran+sozluFzk*sozluOran;
        this.kimyaAvarage=this.kimya.note*courseOran+sozluKim*sozluOran;
        this.matAvarage=this.mat.note*courseOran+sozluMat*sozluOran;
        this.avarage = (this.fizikAvarage+this.kimyaAvarage+this.matAvarage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        //System.out.println("=========================");
        System.out.println("Öğrenci Adı-Soyadı        : " + this.name);
        System.out.println("Matematik Notu Ortalaması : " + this.matAvarage);
        System.out.println("Fizik Notu Ortalaması     : " + this.fizikAvarage);
        System.out.println("Kimya Notu Ortalaması     : " + this.kimyaAvarage);
    }

}