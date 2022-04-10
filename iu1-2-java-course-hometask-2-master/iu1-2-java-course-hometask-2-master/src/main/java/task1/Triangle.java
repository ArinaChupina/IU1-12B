package task1;

public class Triangle extends Figure2D {

    public float x,y,z;
    public Triangle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
float p=(x+y+z)/2;
    @Override
    double area() {
        return (Math.sqrt(p*(p-x)*(p-y)*(p-z)));
    }

    @Override
    double LengthOfAllSides() {
        return (x+y+z);
    }
}
