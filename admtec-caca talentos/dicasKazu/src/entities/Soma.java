package entities;

public class Soma {
    public int x;
    public int y;

    public Soma() {}

    public Soma(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static int soma(int x, int y) {
        return x + y;
    }
}
