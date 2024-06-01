package less13;

public class Circle extends Shape{

    public Circle() {
        super("circle");
    }

    public Circle(String radius) {
        System.out.println(radius);
    }
    public void calculateArea() {
        System.out.println("cacl circle area");
    }
    public void calculatePerimeter() {
        System.out.println("cacl circle permiterer");
    };
}
