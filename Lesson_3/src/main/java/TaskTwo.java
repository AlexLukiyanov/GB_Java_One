import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        TaskTwo();
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
