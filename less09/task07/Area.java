package less09.task07;

public class Area extends Shape{

    @Override
    public int RectangleArea(int a, int b) {
        return a * b;
    }

    @Override
    public int SquareArea(int a) {
        return a * a;
    }

    @Override
    public int CircleArea(int a) {
        return a;
    }
}
