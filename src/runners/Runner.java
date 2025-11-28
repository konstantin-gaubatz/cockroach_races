package runners;

public abstract class Runner implements Runnable {

    protected int num;
    protected final String name;
    protected final int distance;

    protected Runner(int num, String name, int distance) {
        this.num = num;
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
}