package functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        do{
            Vehicle auto = new Vehicle();
            System.out.print("Введите тип транспортного средства: ");
            auto.type = scan.nextLine();
            System.out.print("Введите среднюю скорость: ");
            auto.speed = scan.nextFloat();
            System.out.print("Введите расход топлива в литрах на 100км: ");
            auto.fuelCons = scan.nextFloat();

            System.out.print("Введите длину дистанции: ");
            int distance = scan.nextInt();
            System.out.println("Время, которое уйдет на преодоление заданной дистанции: " + TimeOfDistance(distance, auto.speed));
            System.out.println("Количество топлива, которое уйдет на преодоление заданной дистанции: " + ConsOfDistance(distance, auto.fuelCons));

            System.out.println("\nВведите:\n\t1 - чтобы ввести транспортное средство\n\t0 - чтобы выйти\n");
            i= scan.nextInt();

        }while(i!=0);

    }

    public static float TimeOfDistance(int distance, float speed){
        float time = distance/speed;
        return time;
    }

    public static float ConsOfDistance(int distance, float fuelCons){
        float cons = distance/fuelCons;
        return cons;
    }
}
