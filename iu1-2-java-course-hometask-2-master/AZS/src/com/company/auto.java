package com.company;
import java.util.Scanner;
public class auto {
    public String wish;
    public double percent;
    public int volume;
    public void refuel() {
        Scanner scanner = new Scanner(System.in);
        wish = scanner.nextLine();
        if (wish == "Да") {
            System.out.println("Введите процент заполненности бака");
            percent =scanner.nextDouble();
            System.out.println("Введите объем бака");
            volume = scanner.nextInt();
        } else if (wish == "Нет") {
            System.out.println("Уезжайте");
        }
    }
}
