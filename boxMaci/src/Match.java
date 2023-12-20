public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    void  run(){//raund başlangıç sorgulaması
        if(isCheck()){

            while(this.f1.health>0&&this.f2.health>0){
                System.out.println("=========YENİ RAUND=========");

                if(f1.isFighter()){//f1 sporcusu  önce başlar
                    //System.out.println("marc seçildi");
                    this.f2.health=this.f1.hit(f2);
                }
                if(isWin()) {//kazananı sorgulama
                    break;
                }
                else{//f2 sporcusu önce başlar.
                   // System.out.println("alex seçildi.");
                    this.f1.health=this.f2.hit(f1);
                }
                if(isWin()) {
                    break;
                }


                System.out.println(this.f1.name+" sağlık durumu: "+this.f1.health);
                System.out.println(this.f2.name+" sağlık durumu: "+this.f2.health);
            }



        }else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }

    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    boolean isWin(){//kazananın sorgulanması.
        if(this.f1.health==0){
            System.out.println(this.f2.name+" maçı kazandı!");
            return true;
        } else if (this.f2.health==0) {
            System.out.println(this.f1.name+" maçı kazandı!");
            return true;
        }else {
            return false;
        }
    }
}
