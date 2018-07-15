package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
    Random random = new Random();

    int num =random.nextInt(); ///se puede reemplazar "random.nextInt() por un número de su elección
        System.out.println(num);

        do {
            if (num%2==0) {
                num=num/2;
            } else {
                num=(num*3)+1;

            }
            System.out.println(num);
        } while (num!=1 && num>1);

    }
}

