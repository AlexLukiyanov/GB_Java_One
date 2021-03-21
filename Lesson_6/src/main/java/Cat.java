public class Cat extends Animal {

    private int lengthRun;
    private int lengthSwim;

    public final int MAXRUNCAT = 200;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void setLengthRun (int lengthRun) {
        if (lengthRun <= MAXRUNCAT && lengthRun >= 1) {
            this.lengthRun = lengthRun;
            run(lengthRun);
        } else {
            System.out.println(this.name + " не умеет так бегать");
        }
    }

    @Override
    public void setLengthSwim (int lengthSwim) {
            System.out.println("Кошки не плавают!");
    }
}
