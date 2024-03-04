public class MaratonTest {
    public static void main(String[] args) {


        int[] sureler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] isimler = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak" };

        Maraton myMaraton = new Maraton(sureler);

        System.out.println("Birinci: " + isimler[myMaraton.birinci()] + " " + sureler[myMaraton.birinci()] + "'");
        System.out.println("İkinci: " + isimler[myMaraton.ikinci()] + " " + sureler[myMaraton.ikinci()] + "'");
        System.out.println("Üçüncü: " + isimler[myMaraton.ucuncu()] + " " + sureler[myMaraton.ucuncu()] + "'");

        myMaraton.harf();

    }
}
