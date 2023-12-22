public  class Employee {
    String name ;// Çalışanın adı ve soyadı
    double salary ;// Çalışanın maaşı
    double workHours ;// Haftalık çalışma saati

    int hireYear ;// İşe başlangıç yılı

    public Employee(String name, double salary, double workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;




    }
    /*tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/
    double tax(){//net maaş üzerinden(salary)
        double taxPercent=0.03;
        if(this.salary<=1000){
            return 0;
        }else {
            return salary*taxPercent;
        }

    }
    double bonus(){//Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
        // her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        double bonus;
        double hoursBonus=30;//40 saatten fazla saatlik çalışma ücreti
        if(this.workHours>40){
            bonus=(this.workHours-40)*hoursBonus;
        }else {
            bonus=0.0;
        }
        return bonus;
    }
    double raiseSalary(){// Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        double bonus;
        double raiseSalary;
        int year=2021;//yıl 2021
        if((year-this.hireYear)<10){
            return raiseSalary=this.salary*0.05;
        } else if ((year-this.hireYear)>9&&(year-this.hireYear<20)){//Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
            return raiseSalary=this.salary*0.1;
        } else if ((year-this.hireYear>19)) {//Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
            return raiseSalary=this.salary*0.15;
        }

        return raiseSalary=0;
    }
    String toStrings() {//Çalışana ait bilgileri ekrana bastıracaktır.

        System.out.println("adı-soyadı: "+name);
        System.out.println("maaşı: "+salary);
        System.out.println("Çalışma saati: "+workHours);
        System.out.println("başlangıç yılı:"+hireYear);
        System.out.println("vergiler: "+tax());
        System.out.println("bonus(extra saatler): "+bonus());
        System.out.println("maaş artışı: "+raiseSalary());
        System.out.println("toplam maaş: "+(salary+bonus()+raiseSalary()-tax()));
        return "";
    }
}
