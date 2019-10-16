package com.company;

public class Fibonacci {
    public static void main(String[] args) {
//    int i = Integer.valueOf(args[0]);
    int i = Integer.valueOf(args[0]);
    int x = 1;
    int y = 1;
    if (i < 3)
        switch (i) {
            case 1:
                System.out.print(x);break;
            case 2:
                System.out.print("1, " + y);break;
        }
    else
        System.out.print("1, 1");
        for (int ii = 3; ii<=i; ii++){
            int z = x + y;
            System.out.print(", " + z);
            x = y;
            y = z;
        }
    System.out.println("\n");

    }
}
