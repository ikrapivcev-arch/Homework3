//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задание 1 ");

        byte shovels = 2;
        System.out.println(shovels);
        short bucket = 31500;
        System.out.println(bucket);
        int bag = 1587480;
        System.out.println(bag);
        long gloves = 525648974;
        System.out.println(gloves);
        float rope = 2.8f;
        System.out.println(rope);
        double box = 0;
        System.out.println(box);

        System.out.println("Задание 2 ");

        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.785f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int g = 27897;
        System.out.println(g);
        byte x = 67;
        System.out.println(x);

        System.out.println(" Задание 3 ");

        byte lStudent = 23;
        byte aStudent = 27;
        byte eStudent = 30;
        byte allStudent = (byte) (lStudent + aStudent + eStudent);
        System.out.println(allStudent + " Студентов ");
        int paper = 480;
        int forEveryStudent = paper / allStudent;
        System.out.println(" На каждого ученика рассчитано " + forEveryStudent + " листов бумаги ");

        System.out.println(" Задание 4 ");

        byte minutes = 2;
        short bottles = 16;
        short bottlesInMinutes = (short) (bottles / minutes);
        int timeMinutes = 20;
        int bottlesIn20Minutes = bottlesInMinutes * timeMinutes;
        System.out.println(" За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок ");
        short month = 60;
        short day = (short) (month * 24);
        short bottlersInDay = (short) ( day * bottlesInMinutes);
        System.out.println(" В сутки машина произвела " + bottlersInDay + " штук бутылок ");
        int bottlersIn3Day = bottlersInDay * 3;
        System.out.println(" За три дня машина произвела " + bottlersIn3Day + " штук бутылок");
        int bottleraInMonth = bottlersInDay * 30;
        System.out.println(" За 1 месяц машина произвела " + bottleraInMonth + " штук бутылок ");

        System.out.println(" Задание 5 ");

        short totalCansOfPaint = 120;
        short whitePaint = 2;
        short brownPaint = 4;
        int paintPerClass = whitePaint + brownPaint;
        int numberOfClasses = totalCansOfPaint / paintPerClass;
        int totalWhitePaint = numberOfClasses * whitePaint;
        int totalBrownPaint = numberOfClasses * brownPaint;
        System.out.println(" В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски ");


        System.out.println(" Задание 6 ");


        int weightOfBananas = 5;
        int oneBananasGrams = 80;
        int totalOfBananas = weightOfBananas * oneBananasGrams;
        int weightOfMilk = 200;
        int oneMilk100Gml = 105;
        int totalOfMilk = (weightOfMilk / 100) * oneMilk100Gml;
        int weightOfIceCream = 2;
        int oneIceCream = 100;
        int totalOfIceCream = weightOfIceCream * oneIceCream;
        int weightEggs = 4;
        int oneEggs = 70;
        int totalOfEggs = weightEggs * oneEggs;
        int weightOfBreakfastInGrams = totalOfBananas + totalOfMilk + totalOfIceCream + totalOfEggs;
        float weightOfBreakfastInKilograms = weightOfBreakfastInGrams * 0.001f;
        System.out.println(" Вес завтрака в граммах " + weightOfBreakfastInGrams);
        System.out.println(" Вес завтрака в килограммах " + weightOfBreakfastInKilograms);

        System.out.println(" Задание 7 ");

        int resetWeight = 7;
        float minGrams = 250;
        float maxGrams = 500;
        int resetWeightGrams = resetWeight * 1000;
        float dayMax = (resetWeightGrams / minGrams);
        System.out.println(" При потере 250 грамм в день, потребуется " + dayMax + " дней ");
        float dayMin = (resetWeightGrams / maxGrams);
        System.out.println(" При потере 500 грамм в день, потребуется " +  dayMin + " дней ");
        float daysAverage = (dayMax + dayMin) / 2;
        System.out.println( " В срееднем "+  daysAverage + " дней");


        System.out.println(" Задание 8 ");

        float mashaSalary = 67760.0f;
        float denisSalary = 83690.0f;
        float kristinaSalary = 76230.0f;

        byte increasePercentage = 10;

        float mashaIncrease = mashaSalary * (increasePercentage / 100.0f);
        float mashaNewSalary = mashaSalary + mashaIncrease;
        float mashaAnnualDifference = mashaIncrease * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaAnnualDifference + " рублей.");

        float denisIncrease = denisSalary * (increasePercentage / 100.0f);
        float denisNewSalary = denisSalary + denisIncrease;
        float denisAnnualDifference = denisIncrease * 12;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей.");

        float kristinaIncrease = kristinaSalary * (increasePercentage / 100.0f);
        float kristinaNewSalary = kristinaSalary + kristinaIncrease;
        float kristinaAnnualDifference = kristinaIncrease * 12;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");













        }
    }
