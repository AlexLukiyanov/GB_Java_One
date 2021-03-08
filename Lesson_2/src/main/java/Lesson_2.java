import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {

        //Вызов методов
        taskOne();

        taskTwo();

        taskTree();

        taskFor();

        taskFive();

        int[] arrayExerciseSix = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(taskSix(arrayExerciseSix));

        int[] arrayExerciseSeven = new int[10];
        for (int i = 0; i < arrayExerciseSeven.length; i++) {
            arrayExerciseSeven[i] = (int) (Math.random() * 10);
        }
        int n = -10 + ((int) (Math.random() * 20));
        taskSeven(n, arrayExerciseSeven);
    }

    //Упражнение 1.
    public static void taskOne() {
        int[] arrayExerciseOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Исходный массив упражнения 1: " + Arrays.toString(arrayExerciseOne));

        for (int i = 0; i < arrayExerciseOne.length; i++) {
            if (arrayExerciseOne[i] == 1) {
                arrayExerciseOne[i] = 0;
            } else {
                arrayExerciseOne[i] = 1;
            }
        }
        //Вывод для упражнения 1.
        System.out.println("Полученный массив упражнения 1: " + Arrays.toString(arrayExerciseOne));
    }

    //Упражнение 2.
    public static void taskTwo() {
        int[] arrayExerciseTwo = new int[8];
        int counter = 0;

        for (int i = 0; i < arrayExerciseTwo.length; i++) {
            arrayExerciseTwo[i] = counter;
            counter = counter + 3;
        }
        //Вывод для упражнения 2.
        System.out.println("Полученный массив упражнения 2: " + Arrays.toString(arrayExerciseTwo));
    }

    //Упражнение 3.
    public static void taskTree() {
        int[] arrayExerciseTree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив упражнения 3: " + Arrays.toString(arrayExerciseTree));
        for (int i = 0; i < arrayExerciseTree.length; i++) {
            if (arrayExerciseTree[i] < 6) {
                arrayExerciseTree[i] = arrayExerciseTree[i] * 2;
            }
        }
        System.out.println("Полученный массив упражнения 3: " + Arrays.toString(arrayExerciseTree));
    }

    //Упражнение 4.
    public static void taskFor() {
        int[][] arrayExerciseFor = new int[5][5];
        int count = 0;
        int k = 1;
        for (int i = 0; i < arrayExerciseFor.length; i++) {
            for (int j = 0; j < arrayExerciseFor.length; j++) {
                if (k == 1 || k == 5 || k == 7 || k == 9 || k == 13 || k == 17 || k == 19 || k == 21 || k == 25) {
                    arrayExerciseFor[i][j] = 1;
                } else {
                    arrayExerciseFor[i][j] = 0;
                }
                k++;
            }
        }
        //Вывод для упражнения 4.
        System.out.println("Полученный массив упражнения 4:");
        for (int arr[] : arrayExerciseFor) {
            System.out.println(Arrays.toString(arr));
        }
    }

    //Упражнение 5.
    public static void taskFive() {
        int maxCount = 0;
        int minCount;
        int[] arrayExerciseFive = new int[10];
        for (int i = 0; i < arrayExerciseFive.length; i++) {
            arrayExerciseFive[i] = (int) (Math.random() * 10);
        }

        System.out.println("Получен масив: " + Arrays.toString(arrayExerciseFive));

        for (int i = 0; i < arrayExerciseFive.length; i++) {
            if (maxCount <= arrayExerciseFive[i]) {
                maxCount = arrayExerciseFive[i];
            }
        }
        minCount = maxCount;
        for (int i = 0; i < arrayExerciseFive.length; i++) {
            if (minCount >= arrayExerciseFive[i]) {
                minCount = arrayExerciseFive[i];
            }
        }
        //Вывод для упражнения 5.
        System.out.println("Минимальное значение массива: " + minCount);
        System.out.println("Максимальное значение массива: " + maxCount);
    }

    //Упражнение 6.
    public static boolean taskSix(int arrayExerciseSix[]) {
        int arraySumOne = 0;
        int arraySumTwo = 0;

        System.out.println("Получен массив для упражнения 6: " + Arrays.toString(arrayExerciseSix));

        for (int i = 0; i < arrayExerciseSix.length; i++) {
            arraySumOne = arraySumOne + arrayExerciseSix[i];

            for (int j = 0; j < arrayExerciseSix.length; j++) {
                arraySumTwo = arraySumTwo + arrayExerciseSix[j];
            }

            if ((arraySumOne - (arraySumTwo / 2)) == 0 && arraySumOne != arraySumTwo) {
                return true;
            }

            arraySumTwo = 0;

        }
        return false;
    }

    //Упражнение 7.
    public static void taskSeven(int n, int arrayExerciseSeven[]) {
        System.out.println("Получен массив: " + Arrays.toString(arrayExerciseSeven) + " Нужно сдвинуть элементы на: " + n);
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int counter = arrayExerciseSeven[arrayExerciseSeven.length - 1];
                for (int j = arrayExerciseSeven.length - 1; j > 0; j--) {
                    arrayExerciseSeven[j] = arrayExerciseSeven[j - 1];
                }
                arrayExerciseSeven[0] = counter;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int counter = arrayExerciseSeven[0];
                for (int j = 0; j < arrayExerciseSeven.length - 1; j++) {
                    arrayExerciseSeven[j] = arrayExerciseSeven[j + 1];
                }
                arrayExerciseSeven[arrayExerciseSeven.length - 1] = counter;
            }
        }
        System.out.println("Получен массив для упражнения 7: " + Arrays.toString(arrayExerciseSeven));
    }
}