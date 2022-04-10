package task2;

public class FixedPayment extends base{
    public double Rate;

    public FixedPayment(double Rate) {
        this.Rate = Rate;
    }
    @Override
    double AverageSalary(){
        return (Rate);
    }
}
