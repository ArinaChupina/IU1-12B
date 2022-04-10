package task1;

public class Trapezoid extends Figure2D {

    public int x,y,z,w;
    public Trapezoid(int x, int y,int z,int w){
            this.x=x;
            this.y=y;
            this.z=z;
            this.w=w;

    }

    @Override
    double area() {
        return ((x+y)/2*Math.sqrt(z*z-((x-y)*(x-y)+z*z-w*w)/(2*(x-y))));
    }

    @Override
    double LengthOfAllSides() {
        return (x+y+z+w);
    }

}
