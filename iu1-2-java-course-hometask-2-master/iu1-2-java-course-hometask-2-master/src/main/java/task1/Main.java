package task1;

public class Main {
    public static void main(String[] args) {
        Figure2D Trapezoid = new Trapezoid(6,9,7,12);
        Trapezoid.area();
        Trapezoid.LengthOfAllSides();
        Figure2D Triangle = new Triangle(8,9,11);
        Triangle.area();
        Triangle.LengthOfAllSides();
        Prism Tr = new Prism(Triangle,5);
        Tr.volume();
        Tr.surfaceArea();
        Prism Trap = new Prism(Trapezoid,14);
        Trap.volume();
        Trap.surfaceArea();
        Figure2D Circle = new Circle(7);
        Circle.area();
        Circle.LengthOfAllSides();
        Prism Ci = new Prism(Circle,31);
        Ci.volume();
        Ci.surfaceArea();
        Figure2D Rectangular = new Rectangular(8,11);
        Rectangular.area();
        Rectangular.LengthOfAllSides();
        Prism Rect = new Prism(Rectangular,14);
        Rect.volume();
        Rect.surfaceArea();
    }
}
