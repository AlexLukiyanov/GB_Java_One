public class Dog extends Animal {

    private int lengthRun;
    private int lengthSwim;

    public final int MAXRUNDOG = 500;
    public final int MAXSWIMDOG = 10;

    public Dog (String name) {
        this.name = name;
    }

    @Override
    public void setLengthRun (int lengthRun) {
        if (lengthRun <= MAXRUNDOG && lengthRun >= 1) {
            this.lengthRun = lengthRun;
            run(lengthRun);
        } else {
            System.out.println(this.name + " не умеет так бегать");
        }
    }
    @Override
    public void setLengthSwim (int lengthSwim) {
        if (lengthSwim <= MAXSWIMDOG && lengthSwim >= 1) {
            this.lengthSwim = lengthSwim;
            swim(lengthSwim);
        } else {
            System.out.println(this.name + " не умеет так плавать");
        }
    }
}
