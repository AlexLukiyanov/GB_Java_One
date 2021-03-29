public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n, boolean sat) {
        if (food >= n) {
            food -= n;
            sat = true;
            System.out.println("Сытость кота: " + sat);
            System.out.println("Еды осталось: " + food);
        } else if (food < n) {
            System.out.println("В тарелке нет столько еды!");
            System.out.println("Сытость: " + sat);
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int increase) {
        food += increase;
        System.out.println("Еды стало: " + food);
    }
}