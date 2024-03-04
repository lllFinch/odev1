public class Maraton {
    private int[] sureler;

    public Maraton(int[] sureler) {
        this.sureler = sureler;
    }

    public int[] getSureler() {
        return sureler;
    }

    public void setSureler(int[] sureler) {
        this.sureler = sureler;
    }

    public int birinci() {
        int minSure=sureler[0];
        int sira=0;
        for (int i = 0; i < sureler.length; i++) {
            if (sureler[i] < minSure) {
                minSure=sureler[i];
                sira = i;
            }
        }
        return sira;
    }

    public int ikinci(){
        int minSure=sureler[birinci()];
        int minSure2=sureler[0];
        int sira=0;
        for (int i = 0; i < sureler.length; i++) {
            if(sureler[i]<minSure2 && sureler[i]>minSure){
                minSure2=sureler[i];
                sira=i;
            }
        }
        return sira;
    }

    public int ucuncu(){
        int minSure=sureler[birinci()];
        int minSure2=sureler[ikinci()];
        int minSure3=sureler[0];
        int sira=0;
        for (int i = 0; i < sureler.length; i++) {
            if(sureler[i]<minSure3 && sureler[i]>minSure2 && sureler[i]>minSure){
                minSure3=sureler[i];
                sira=i;
            }
        }
        return sira;
    }

    public void harf(){
        int A=0;
        int B=0;
        int C=0;
        int j=2;
        for (int i = 0; i < sureler.length; i++) {
            if(sureler[i]>=j*100 && sureler[i]<=j*100+99)
                    A++;
            if(sureler[i]>=j*100+100 && sureler[i]<=j*100+199)
                    B++;
            if(sureler[i]>=j*100+200)
                C++;
            }
        System.out.println("A --> " + A);
        System.out.println("B --> " + B);
        System.out.println("C --> " + C);
        }




}
