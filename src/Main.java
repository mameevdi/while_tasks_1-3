import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1"); // сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей
        int capital = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + capital;
            month++;
        }
        System.out.println("Мы откладывали 15 000 рублей ежемесячно и сумму 2 459 000 рублей удалось собрать за " + month + " месяцев");
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2"); //Выведите числа от 1 до 10 с помощью цикла while и на следующей строке числа от 10 до 1 с помощью цикла for
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i=0;
        while (i<10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3"); //Рассчитайте, какая численность населения будет через 10 лет
        double PopulationSize = 12_000_000;
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Численность населения равна " + df.format(PopulationSize));
        for (int i = 1; i <= 10; i++) {
            var BornInYear = PopulationSize/1000*17;
            var DiedInYear = PopulationSize/1000*8;
            PopulationSize = PopulationSize+(BornInYear-DiedInYear);
            System.out.println("На " + i + "-й год население города составило " + df.format(PopulationSize) + " человек. Родились " + df.format(BornInYear) + " человека, умерли " + df.format(DiedInYear)+ " человека.");
        }
        if (PopulationSize>12_000_000){
            var total = PopulationSize-12_000_000;
            System.out.println("Население за 10 лет выросло на " + df.format(total) + " человек");
        }
        else {
            var total = 12_000_000 - PopulationSize;
            System.out.println("Население за 10 лет сократилось на " + df.format(total) + " человек");
        }
    }
}