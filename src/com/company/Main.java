package com.company;
import java.util.Scanner;

public class Main {

    public static int onee=0,twoo=0;
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        base b=new base();
        b.b();
        int[] selected =new int[9];
        int[] one=new int[5];
        int[] two=new int[5];
       System.out.println("enter user 1's name :");
       String onename=sc.nextLine();
       System.out.println("enter iser 2's name :");
       String twoname=sc.nextLine();
        for(int la=0;la<9;la++){

            System.out.print("enter a value from");
            for(int a=1;a<=9;a++){
                System.out.print(" "+a+" ");
            }
            System.out.println(":");
            if(la%2==0){
                System.out.println("please enter a value "+onename+":");
            }
            else{
                System.out.println("please enter a value "+twoname+":");
            }

            int input=sc.nextInt();
            while(input>9){
                System.out.println("number is invalid");
                input=sc.nextInt();
            }
            for(int v=0;v<9;v++){
                while(input==selected[v]){
                    System.out.println("number is already selected");
                    input=sc.nextInt();
                }}
                    selected[la] = input;
            if(la%2==0){
                one[onee]=input;
            onee++;}
            else{
                two[twoo]=input;
                twoo++;
            }

            design d=new design();
            d.d(input,la,selected,one,two);
            easy e=new easy();
            e.resultt(one,onename);
            e.resultt(two,twoname);
            if(e.resultt(one,onename)==4|| e.resultt(two,twoname)==4){
                System.out.println("the game is over");
                break;
            }

       }}}
