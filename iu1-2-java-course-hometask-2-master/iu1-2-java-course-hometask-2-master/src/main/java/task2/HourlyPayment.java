package task2;

public class HourlyPayment extends base{
     public double rate;
    public HourlyPayment(double rate){
        this.rate=rate;
    }
    @Override
    double AverageSalary() {
        return (20.8*8*rate);
    }
}
