package task2;

public class Salary {
    private base base;
    private double rate;

    public Salary(base base, double rate){
        this.base=base;
        this.rate=rate;
    }
    public void payment(){
        System.out.println("Как работает сотрудник: "+base);
        System.out.println("Ставка сотрудника в час: "+rate/20/8);
        System.out.println("Среднемесячная зарплата "+base.AverageSalary());
    }
}
