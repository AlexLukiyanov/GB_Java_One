public class Animal {

    public String name;
    public static int animalCounting = 0;

    public Animal() {
        animalCounting++;
        System.out.println("Создано " + animalCounting + " животных");
    }

    public void setLengthRun (int lengthRun) {
    }

    public void setLengthSwim (int lengthSwim) {
    }

    public void run(int lengthRun) {
        System.out.println(this.name + " пробежал " + lengthRun + " метров.");
    }

    public void swim(int lengthSwim) {
        System.out.println(this.name + " проплыл " + lengthSwim + " метров.");
    }
}
