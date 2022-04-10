package task1;

public class Prism {
    private Figure2D base;
    private double h;

    public Prism(Figure2D base, double h) {
        this.base = base;
        this.h = h;
    }

    // метод вычисления объема
    public void volume() {
        System.out.println("Фигура "+base);
        System.out.println("Высота "+h);
        System.out.println("Объем призмы "+base.area()*h);
    }
    // площадь поверхности
    public void surfaceArea(){
        System.out.println("Длина сторон основания "+base.LengthOfAllSides());
        System.out.println("Площадь поверхности "+(base.LengthOfAllSides())*h+ base.area());
    }

}
