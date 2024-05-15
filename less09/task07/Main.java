package less09.task07;

public class Main {
    public static void main(String[] args) {
        int rectangleLength = 5;
        int rectangleWidth = 8;
        int squareSide = 5;
        int circleRadius = 10;

        Area area = new Area();

        System.out.println("rectangle area: " + area.RectangleArea(rectangleLength, rectangleWidth));
        System.out.println("square area: " + area.SquareArea(squareSide));
        System.out.println("circle radius: " +  area.CircleArea(circleRadius));
    }
}
