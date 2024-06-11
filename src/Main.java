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
        byte Anna = 27;
        byte Ekaterina = 30;
        long paper = 480;
        int Students = ludmila + Anna + Ekaterina;
        System.out.println("Всего учеников " + Students);
        int Sheets = (int) (paper / (int) Students);
        System.out.println("На каждого ученика рассчитано " + paper / Students + " листов бумаги" );

        byte bottles = 16;
        byte minutes = 2;
        int bottle = bottles / minutes;
        System.out.println("В минуту машина производит " + bottle + " бутылок");
        byte twentyMinutes = 20;
        System.out.println("за 20мин машина производит " + twentyMinutes * bottle + " бутылок");
        short oneDays = 1440;
        System.out.println("за 1 день машина производит " + oneDays / bottle + " бутылок");
        short threeDays = 4320;
        System.out.println("за 3 дня машина производит " + threeDays / bottle + " бутылок");
        long oneMonth = 43200;
        System.out.println("за 1 месяц машина производит " + oneMonth / bottle + " бутылок");

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


        int Masha = (int) 67760;
        int Masha10 = (int) (Masha * 10);
        int Masha100 = (int) Masha10 / 100;
        int MashaNew = (int) Masha + (int) Masha100;
        System.out.println( "Маша после повышения получает " + MashaNew + " руб" );
        int MashaYear = (int) MashaNew * 12;
        System.out.println( "Годовой доход Маши теперь составляет " + MashaYear + " руб" );
        int MashaQueen = (int) MashaYear - ((int) Masha * 12);
        System.out.println( "Маша теперь получает " + MashaYear + " рублей. Годовой доход вырос на " + MashaQueen + " руб");



        int Denis = (int) 83690;
        int Denis10 = (int) (Denis * 10);
        int Denis100 = (int) Denis10 / 100;
        int DenisNew = (int) Denis + (int) Denis100;
        System.out.println( "Денис после повышения получает " + DenisNew + " руб" );
        int DenisYear = (int) DenisNew * 12;
        System.out.println( "Годовой доход Дениса теперь составляет " + DenisYear + " руб" );
        int DenisGod = (int) DenisYear - ((int) Denis * 12);
        System.out.println( "Денис теперь получает " + DenisYear + " рублей. Годовой доход вырос на " + DenisNew + " руб");

        int Kris = (int) 76230;
        int Kris10 = (int) (Kris * 10);
        int Kris100 = (int) Kris10 / 100;
        int KrisNew = (int) Kris + (int) Kris100;
        System.out.println( "Кристина после повышения получает " + KrisNew + " руб" );
        int KrisYear = (int) KrisNew * 12;
        System.out.println( "Годовой доход Кристины теперь составляет " + KrisYear + " руб" );
        int KrisQueen = (int) KrisYear - ((int) Denis * 12);
        System.out.println( "Кристина теперь получает " + KrisYear + " рублей." );
    }
}