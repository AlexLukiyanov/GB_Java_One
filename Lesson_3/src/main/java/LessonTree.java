import java.util.Random;
import java.util.Scanner;

public class LessonTree {
    public static void main(String[] args) {

        CheckHiddenNumber();
        TaskTwo();
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


    public static void TaskTwo() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int ExitGameVariable = 0;
        while (ExitGameVariable == 0) {
            System.out.println("Угадайте слово");

            Random randomNumber = new Random();
            int randomNumberString = randomNumber.nextInt(24);

            Scanner UserStringScanner = new Scanner(System.in);

            int RemoveGameVariable = 1;
            while (RemoveGameVariable == 1) {
                String UserString = UserStringScanner.nextLine();
                for (int i = 0; i < words.length; i++) {
                    if (i == randomNumberString) {
                        if (UserString.equals(words[i])) {
                            System.out.println("Вы угадали слово");
                            continue;
                        } else {
                            for (int j = 0; j <= words[i].length(); j++) {
                                int sameHodden = words[i].charAt(j);
                                int sameGuessed = UserString.charAt(j);
                                if (sameHodden == sameGuessed) {
                                    System.out.print((char) sameHodden);
                                } else {
                                    System.out.println("###############");
                                    break;
                                }
                            }
                        }
                    }
                }
                Scanner RemoveGameScanner = new Scanner(System.in);
                System.out.println("Продолжить игру? 1 - Да, 0 - Нет");
                int RemoveGame = RemoveGameScanner.nextInt();
                if (RemoveGame == 1) {
                    RemoveGameVariable = 1;
                } else {
                    RemoveGameVariable = 0;
                    Scanner ExitGameScanner = new Scanner(System.in);
                    System.out.println("Выйти из игры? 1 - Да, 0 - Нет");
                    int ExitGame = ExitGameScanner.nextInt();
                    if (ExitGame == 1) {
                        ExitGameVariable = 1;
                        System.out.println("Игра окончена. Спасибо!");
                    } else {
                        ExitGameVariable = 0;
                    }
                }
            }
        }
    }
}
