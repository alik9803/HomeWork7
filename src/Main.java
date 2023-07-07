import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int pot = 15000;
        int totalSave = 0;
        int i = 0;
        while (totalSave <= 2_459_000) {
            i++;
            totalSave = totalSave + totalSave / 100;
            totalSave = totalSave + pot;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSave + " рублей");
        }
        System.out.println(totalSave + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int t = 10; t >= 1; t--) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12000000;
        int bornHeight = 17;
        int deathIndicator = 8;
        for (int year = 1; year <= 10; year++) {
            int growth = (bornHeight - deathIndicator) * people / 1000;
            people = people + growth;
            System.out.println("Год " + year + " численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int pot = 15000;
        int totalSave = 0;
        int i = 0;
        while (totalSave <= 12_000_000) {
            i++;
            totalSave = totalSave + totalSave / 7;
            totalSave = totalSave + pot;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSave + " рублей");
        }
        System.out.println(totalSave + " рублей");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int pot = 15000;
        int totalSave = 0;
        int i = 0;
        while (totalSave <= 12_000_000) {
            i++;
            totalSave = totalSave + totalSave / 7;
            totalSave = totalSave + pot;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + totalSave + " рублей");
            }
        }
        System.out.println(totalSave + " рублей");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int pot = 15000;
        int month = 18;
        int percent = 7;
        for (int i = 1; i <= month; i++) {
            pot = pot + pot / 7;
            System.out.println("Сумма накоплений после " + i + "-го полугодия: " + pot + " рублей");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int month = 31;
        for (int i = friday; i <= month; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 79) == 0) {
                System.out.println(year);
            }
        }
    }
}