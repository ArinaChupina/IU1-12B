package task1;

public class Rectangular extends Figure2D {

    public int x,y;
    public Rectangular(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return (this.x*this.y);
    }
    double LengthOfAllSides() {
        return (2*x+2*y);
    }
}
