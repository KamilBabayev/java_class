package less13;

public class Rectangle extends Shape{

    public Rectangle() {
        super("circle");
    }

    public Rectangle(String radius) {
//        super();
        System.out.println(radius);
    }
    public void calculateArea() {
        System.out.println("cacl rectangle area");
    }
    public void calculatePerimeter() {
        System.out.println("cacl rectangle permiterer");
    };
}
