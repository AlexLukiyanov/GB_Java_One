import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        CheckHiddenNumber();
    }

    public static void CheckHiddenNumber() {
        final int NUMBER_OF_ATTEMPTS = 3;
        boolean checkContinue = true;

        while (checkContinue) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(10);

            for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
                System.out.println("Угадайте число от 0 до 9. " + "Введите число: ");
                Scanner scannerUserNumber = new Scanner(System.in);
                int userNumber = scannerUserNumber.nextInt();

                if (randomNumber == userNumber) {
                    System.out.println("Вы угадали с " + (i + 1) + " Попытки!");
                    System.out.println("Повторить игру еще раз? Введите 1 если ДА, введите 0 если НЕТ");
                    if (checkContGame(checkContinue) == false) {
                        checkContinue = false;
                        break;
                    } else {
                        i = -1;
                    }
                    randomNumber = rand.nextInt(10);
                } else if (randomNumber < userNumber) {
                    System.out.println("Вы не угадали! Загаданное число меньше! Осталось попыток " + (NUMBER_OF_ATTEMPTS - i - 1));
                } else if (randomNumber > userNumber) {
                    System.out.println("Вы не угадали! Загаданное число больше! Осталось попыток " + (NUMBER_OF_ATTEMPTS - i - 1));
                }
            }
            System.out.println("Повторить игру еще раз? Введите 1 если ДА, введите 0 если НЕТ");
            if (checkContGame(checkContinue) == true) {
                checkContinue = true;
                System.out.println("Продолжаем!");
            } else {
                checkContinue = false;
                System.out.println("Всего доброго!");
                break;
            }
        }
    }

    public static boolean checkContGame(boolean checkContinue) {
        Scanner scanContinue = new Scanner(System.in);
        int continueGame = scanContinue.nextInt();
        if (continueGame == 0) {
            scanContinue.close();
            return false;
        } else if (continueGame == 1) {
            return true;
        } else {
            System.out.println("Вы ввели неверные данные!");
            return false;
        }
    }
}

