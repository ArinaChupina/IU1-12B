package task1;

public class Circle extends Figure2D {

    public int Radius;
    public Circle(int Radius){
        this.Radius=Radius;
    }


    @Override
    public double area() {
        return (Math.PI*this.Radius*this.Radius);
    }
    public double LengthOfAllSides(){
        return (2*Math.PI*Radius);
    }
}
