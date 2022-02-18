import animals.Kotik;

public class Application {


    public static void main(String[] args) {

        Kotik Barsik = new Kotik();
        Barsik.setName("Барсик");
        //для проверки голосов
        //Barsik.setVoice("Фыр-фыр!");
        Barsik.setVoice("Мяу-мяу!");
        Barsik.setWeight(200);

        Kotik Murka = new Kotik("Мурка", "Мяу-мяу!", 100);

        Murka.liveAnotherDay();

        //распечатать массив циклом for
        System.out.println("\nКак прошел день:");
        for (int hour = 0; hour <= 23; hour++)
            System.out.println(Murka.getArrayLiveDay(hour));

        //имя и вес любого котика
        System.out.println("\nимя и вес любого котика:");
        System.out.println(Murka.getName());
        System.out.println(Murka.getWeight());

        //сравнение голосов котиков
        System.out.println("\nСравнение голосов котиков:");
        if (Barsik.getVoice().equals(Murka.getVoice())) {
            System.out.println("Голоса одинаоквы");
        } else System.out.println("Голоса разные");

        //кол-во созданых котиков
        System.out.println("\nКотиков создано : " + Kotik.getCOUNT());


    }

}
