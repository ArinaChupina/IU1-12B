package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ставку сотрудника, работающего по часовой оплате: ");
        double rate =scan.nextInt();
        base HoPa = new HourlyPayment(rate);
        HoPa.AverageSalary();
        Salary hp = new Salary(HoPa,rate);
        hp.payment();

        System.out.println("Введите фиксированную месячную оплату: ");
        double Rate=scan.nextDouble();
        base FoPa = new FixedPayment(Rate);
        FoPa.AverageSalary();
        Salary fp = new Salary(FoPa,Rate);
        fp.payment();
    }
}
