// Задача №1
// 
// Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор и вывести результаты следующих операций с этими переменными: 
// сложение, умножение, вычитание, деление.

public class HW2 {
    public static void main(String[] args) throws Exception {
        long x = 2_147_483_648L;
        double y = 300.5;

        double sum = x + y;
        double mul = x * y;
        double sub = x - y;
        double div = x / y;

        System.out.print("Сумма чисел " + x + " и " + y + " = " + sum + "\n" + "Произведение чисел " + x + " и " + y + " = " + mul + 
                         "\n" + "Разность чисел " + x + " и " + y + " = " + sub + "\n" + "Результат деления чисел " + x + " и " + y + " = " + div);
    }
}

// Экстра задача
// 
// Также вывести остаток от деления и сделать проверку на четность этих переменных.

class HW2_extra1 {
    public static void main(String[] args) throws Exception {
        int x = 1000;
        byte y = 127;

        int rem = x % y;

        System.out.println("Остаток от деления " + x + " и " + y + " = " + rem);

        if (x % 2 == 0) {
            System.out.println("Число " + x + " четное");
        } else {
            System.out.println("Число " + x + " нечетное");
        }
        if (y % 2 == 0) {
            System.out.println("Число " + y + " четное");
        } else {
            System.out.println("Число " + y + " нечетное");
        }
    }
}

// Экстра задача
// 
// Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).

class HW2_extra2 {
    public static void main(String[] args) {
        String smile = "\u263A";
        System.out.println(smile);
    }
}