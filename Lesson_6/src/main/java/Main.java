public class Main {
    public static void main(String[] args) {

        //Создание экземпляров класса для проверки задачи 2.
        Cat cat1 = new Cat("Мурзик");
        cat1.run(100);
        cat1.swim(50);

        Dog dog1 = new Dog("Тузик");
        dog1.run(500);
        dog1.swim(10);

        //Создание экземпляров класса для проверки задачи 3.
        Cat cat2 = new Cat("Мурзик младший");
        cat2.setLengthRun(100);
        cat2.setLengthSwim(50);

        Dog dog2 = new Dog("Тузик младший");
        dog2.setLengthRun(500);
        dog2.setLengthSwim(10);

    }
}
