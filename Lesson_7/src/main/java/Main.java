public class Main {

    public static void main(String[] args) {

        //Cat cat = new Cat("Barsik", 5);

        Cat [] catArray = new Cat[3];

        catArray[0] = new Cat("Barsik", 5);
        catArray[1] = new Cat("Matroskin", 10);
        catArray[2] = new Cat("Rish", 15);

        Plate plate = new Plate(100);

        plate.info();

        for (int i = 0; i < catArray.length; i++) {
            System.out.println("Очередь кота №" + (i + 1) + ":");
            catArray[i].eat(plate);
        }

        plate.info();

        plate.increaseFood(30);
    }
}