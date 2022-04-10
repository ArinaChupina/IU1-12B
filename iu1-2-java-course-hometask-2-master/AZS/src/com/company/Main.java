package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int c = 0;
        int d = 5;
        int colons=4;
        int count = c + (int) (Math.random() * ((d - c) + 1));
        int i = 0;
        System.out.println("Количество машин "+count);
        if (count==0){
            System.out.println("Машин нет");
        }
        while (i < count) {
            int a = 0;
            int b = 1;
            int x = a + (int) (Math.random() * ((b - a) + 1));
            if (x == 1) {
                auto auto = new auto();
                auto.refuel();
                i++;
            }

        }

    }
}
