public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");// Задача 1
        int monthMoney = 15000;
        int totalMoney = 0;
        int month = 0;
        while (totalMoney < 2_459_000) {
            month++;
            totalMoney = totalMoney + monthMoney;
            System.out.println("«Месяц " + month + " сумма накоплений равна " + totalMoney + " рублей»");
        }
        System.out.println();



        System.out.println("Задача 2");// Задача 2
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (;number > 0; number--) {
        System.out.print(number + " ");
        }
        System.out.println();



        System.out.println("Задача 3");// Задача 3
        int population = 12_000_000;
        int birthRate1000 = 17;
        int mortalityRate = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + (population / 1000 * birthRate1000) - (population / 1000 * mortalityRate);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();



        System.out.println("Задача 4");// Задача 4
        int monthMoney1 = 15000;
        int totalMoney1 = 0;
        for (int i = 1; totalMoney1 < 12_000_000; i++) {
            totalMoney1 = totalMoney1 + monthMoney1;
            totalMoney1 = (int) (totalMoney1 + totalMoney1 * 0.07);
            System.out.println("«Месяц " + i + " сумма накоплений равна " + totalMoney1 + " рублей»");
        }
        System.out.println();



        System.out.println("Задача 5");// Задача 5
        int monthMoney2 = 15000;
        int totalMoney2 = 0;
        for (int i = 1; totalMoney2 < 12_000_000; i++) {
            totalMoney2 = totalMoney2 + monthMoney2;
            totalMoney2 = (int) (totalMoney2 + totalMoney2 * 0.07);
            if (i % 6 == 0) {
                System.out.println("«Месяц " + i + " сумма накоплений равна " + totalMoney2 + " рублей»");
            }
        }
        System.out.println();



        System.out.println("Задача 6");// Задача 6
        int monthMoney3 = 15000;
        int totalMoney3 = 0;
        for (int i = 1; i <= 108; i++) { //9 лет = 108 месяцев
            totalMoney3 = totalMoney3 + monthMoney3;
            totalMoney3 = (int) (totalMoney3 + totalMoney3 * 0.07);
            if (i % 6 == 0) {
                System.out.println("«Месяц " + i + " сумма накоплений равна " + totalMoney3 + " рублей»");
            }
        }
        System.out.println();



        System.out.println("Задача 7");// Задача 7
        int firstFriday = 2;
        for (int i = 1; i <= 31; i++) {
            if ((7 - i + firstFriday) % 7 == 0) {
                System.out.println("«Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();



        System.out.println("Задача 8");// Задача 8
        int ourYear = 2025;
        int beforeYear200 = ourYear - 200;
        int afterYear100 = ourYear + 100;
        for (int i = 0; i <= afterYear100; i = i + 79) {
            if (i >= beforeYear200) {
                System.out.println(i);
            }
        }














    }
}