package com.company;

public class design {
    easy e=new easy();

    public int d(int b, int a,int[] arr,int[] o,int[] t) {
        // arr[a] = b;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {

                if (j % 2 == 0 && i % 2 == 0) {
                    System.out.print(".");
                } else if (j % 2 != 0 && i % 2 != 0) {

                    //1
                    if (i == 1 && j == 1 && b == 1) {
                        e.x(a);
                    } else if (i == 1 && j == 1) {
                        e.e(o, t, 1);
                    }//2
                    if (i == 1 && j == 3 && b == 2) {
                        e.x(a);
                    } else if (i == 1 && j == 3) {
                        e.e(o, t, 2);
                    }
                    //3
                    if (i == 1 && j == 5 && b == 3) {
                        e.x(a);
                    } else if (i == 1 && j == 5) {
                        e.e(o, t, 3);

                    }//4
                    if (i == 3 && j == 1 && b == 4) {
                        e.x(a);
                    } else if (i == 3 && j == 1) {
                        e.e(o, t, 4);
                    }//5
                    if (i == 3 && j == 3 && b == 5) {
                        e.x(a);
                    } else if (i == 3 && j == 3) {
                        e.e(o, t, 5);

                    }//6
                    if (i == 3 && j == 5 && b == 6) {
                        e.x(a);
                    } else if (i == 3 && j == 5) {
                        e.e(o, t, 6);
                    }
                    //7
                    if (i == 5 && j == 1 && b == 7) {
                        e.x(a);
                    } else if (i == 5 && j == 1) {
                        e.e(o, t, 7);
                    }//8
                    if (i == 5 && j == 3 && b == 8) {
                        e.x(a);
                    } else if (i == 5 && j == 3) {
                        e.e(o, t, 8);
                    }//9
                    if (i == 5 && j == 5 && b == 9) {
                        e.x(a);
                    } else if (i == 5 && j == 5) {
                        e.e(o, t, 9);
                    }
                } else if (i % 2 != 0 && j % 2 == 0) {
                    System.out.print("|");
                } else {
                    System.out.print("___");
                }}
            System.out.println(" ");
        }
        return arr[a];
    }}