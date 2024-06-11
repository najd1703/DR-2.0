public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int cats = 27897;
        System.out.println("кошек " + cats + " шт!");
        byte dogs = 67;
        System.out.println("собак " + dogs + " шт!");
        short tiger = -159;
        System.out.println("тигрок " + tiger + " шт!");
        long frogs = 569;
        System.out.println("лягушек " + frogs + " шт!");
        float milk = 27.12f;
        System.out.println("молока " + milk + " литра!");
        double metersOfWood = 2.786;
        System.out.println("древесины " + metersOfWood + " метра!");

        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        long paper = 480;
        int students = ludmila + anna + ekaterina;
        System.out.println("Всего учеников " + students);
        int Sheets = (int) (paper / (int) students);
        System.out.println("На каждого ученика рассчитано " + paper / students + " листов бумаги" );

        byte bottles = 16;
        byte minutes = 2;
        int bottle = bottles / minutes;
        System.out.println("В минуту машина производит " + bottle + " бутылок");
        byte twentyMinutes = 20;
        System.out.println("за 20мин машина производит " + twentyMinutes * bottles / minutes + " бутылок");
        short oneDays = 1440;
        System.out.println("за 1 день машина производит " + oneDays / (bottles / minutes) + " бутылок");
        short threeDays = 4320;
        System.out.println("за 3 дня машина производит " + threeDays / (bottles / minutes) + " бутылок");
        long oneMonth = 43200;
        System.out.println("за 1 месяц машина производит " + oneMonth / (bottles / minutes) + " бутылок");

        byte cans = 120;
        byte Wait = 2;
        byte brown = 4;
        int classes = cans / (Wait + brown);
        System.out.println("В школе " + cans / (Wait + brown) + " классов" );
        int bottleWait = classes * Wait;
        int bottleBrown = classes * brown;
        System.out.println("В школе где " + cans / (Wait + brown) + " классов, нужно банок с белой краской " + bottleWait + " и " + bottleBrown + " банок с коричневой краской");


        int bananas = (short) (80 * 5);
        int Milk = (short) (105 * 2);
        int iceCream = (short) (2 * 100);
        int egg = (short) (4 * 70);
        int cocktail = bananas + Milk + iceCream + egg;
        System.out.println("вес продуктов в коктейле составил " + cocktail + " гр.");
        int grPerKg = 1000;
        float kg = (float) cocktail / grPerKg;
        System.out.println("вес продуктов в коктейле составил " + kg + " кг.");


        byte WeightS1 = (byte) 7000;
        byte Mass1 = (byte) 250;
        byte Mass2 = (byte) 500;
        int Days1 = WeightS1 / Mass1;
        System.out.println("Если спортсмен будет терять 250гр веса в день, то ему понадобится " + Days1 + " дней для похудения");
        int Days2 = WeightS1 / Mass2;
        System.out.println("Если спортсмен будет терять 500гр веса в день, то ему понадобится " + Days2 + " дней для похудения");
        float Days3 = (float) (Days1 + Days2) / 2;
        System.out.println("В среднем спортсмену нужно " + Days3 + " дней для похудения" );


        int masha = (int) 67760;
        int masha10 = (int) (masha + masha * 0.1);
        System.out.println( "Маша после повышения получает " + masha10 + " руб" );
        int mashaYear = (int) masha10 * 12;
        System.out.println( "Годовой доход Маши теперь составляет " + mashaYear + " руб" );
        int mashaQueen = (int) mashaYear - ((int) masha * 12);
        System.out.println( "Маша теперь получает " + mashaYear + " рублей. Годовой доход вырос на " + mashaQueen + " руб");



        int denis = (int) 83690;
        int denis10 = (int) (denis + denis * 0.1);
        System.out.println( "Денис после повышения получает " + denis10 + " руб" );
        int denisYear = (int) denis10 * 12;
        System.out.println( "Годовой доход Дениса теперь составляет " + denisYear + " руб" );
        int denisGod = (int) denisYear - ((int) denis * 12);
        System.out.println( "Денис теперь получает " + denisYear + " рублей. Годовой доход вырос на " + denisGod + " руб");

        int kris = (int) 76230;
        int kris10 = (int) (kris + kris * 0.1);
        System.out.println( "Кристина после повышения получает " + kris10 + " руб" );
        int krisYear = (int) kris10 * 12;
        System.out.println( "Годовой доход Кристины теперь составляет " + krisYear + " руб" );
        int krisQueen = (int) krisYear - ((int) kris * 12);
        System.out.println( "Кристина теперь получает " + krisYear + " рублей. Годовой доход вырос на " + krisQueen + " руб" );
    }
}