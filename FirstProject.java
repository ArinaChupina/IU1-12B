package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

                System.out.print("Придумайте число от 1 до 2_147_483_647");
                int first=1;
                int last=2_147_483_647;
                int x= last/2+1;
                int number=0;
                boolean isFind=false;
                int count=0;
                Scanner in = new Scanner(System.in);
                while(!isFind){
                    System.out.println("Ваше число "+x);
                    System.out.print("Введите знак: ");
                    String com = in.next();

                    if (Objects.equals(com, "<")){
                        last=x;
                        number=last-first;
                        x=number/2+first;
                        if (x==1){
                            System.out.println("Ваше число "+x);
                            isFind=true;
                        }
                    }
                    else if(Objects.equals(com, ">")){
                        first=x;
                        number=last-first;
                        x=last-number/2;
                        if (x == 2147483647){
                            System.out.println("Ваше число "+x);
                            isFind=true;
                        }
                    }
                    else if(Objects.equals(com, "=")){
                        System.out.println("Ваше число "+x);
                        isFind=true;
                    }
                    else{
                        System.out.println("Ошибка");
                    }
                    count++;
                }
                in.close();
                System.out.println(count+"попыток");

    }
}
