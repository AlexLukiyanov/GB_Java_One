public class LessonOneHomeWork {
    // Упражнение 1.
    public static void main(String[] args) {

        // Упражнение 2.
        byte byteNumber = 100;
        short shortNumber = 30_000;
        int intNumber = 1_000_000_000;
        long longNumber = 3_000_000_000L;
        float floatNumber = 10.10F;
        double doubleNumber = 100.100;
        char charNumber = 'H';
        boolean booleanNumber = true;

        /* Знаю, что вы говорили что название переменной не должно быть таким же как ключевые слова в Java, но я добавил слово "Number". Надеюсь так приемлимо. */

        // Для проверки упражнения 3.
        System.out.println(calculation(5, 6, 7, 8));

        // Для проверки упражнения 4.
        System.out.println(checkAmount(10, 10));

        // Для проверки упражнения 5.
        checkNumber(0);

        // Для проверки упражнения 6.
        System.out.println(checkNumberBoolean(5));

        // Для проверки упражнения 7.
        greeting("Александр");

        // Для проверки упражнения 8.
        leapYear(400);
    }

    // Упражнение 3.
    public static float calculation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Упражнение 4.
    public static boolean checkAmount(int numberOne, int numberTwo) {
        if ((numberOne + numberTwo) >= 10 & (numberOne + numberTwo) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Упражнение 5.
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Передано положительное число.");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    // Упражнение 6.
    public static boolean checkNumberBoolean(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // Упражнение 7.
    public static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Упражнение 8.
    public static void leapYear(int year) {

        if (year % 400 == 0) {
            System.out.println("Год високосный.");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный.");
        } else if (year % 4 == 0) {
            System.out.println("Год високосный.");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
