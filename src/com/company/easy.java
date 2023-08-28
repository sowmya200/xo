package com.company;

public class easy {
    public void x(int a){
        if(a%2==0){ System.out.print(" X ");}
        else{
            System.out.print(" O ");}
    }
    public void e(int[] o,int[] t,int f){
        int s = 0;
        int y=0;
        for (int h = 0; h < 5; h++) {
            if (o[h] == f) {
                System.out.print(" X ");
                s++;
            } else if(t[h]==f) {
                System.out.print(" O ");
                y++;
            }
        }
        if (s == 0&&y==0) {
            System.out.print(" "+f+" ");
        }

    }
    public int resultt(int[] o,String name){
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,i=0;
        for (int h = 0; h < 5; h++) {

            if (o[h] == 1||o[h]==2||o[h]==3) {
                a++;
            }
            if(o[h]==4||o[h]==5||o[h]==6){
                b++;
            }
            if(o[h]==7||o[h]==8||o[h]==9){
                c++;
            }
            if(o[h]==1||o[h]==4||o[h]==7){
                d++;
            }
            if(o[h]==2||o[h]==5||o[h]==8){
                e++;
            }
            if(o[h]==3||o[h]==6||o[h]==9){
                f++;
            }
            if(o[h]==1||o[h]==5||o[h]==9){
                g++;
            }
            if(o[h]==3||o[h]==5||o[h]==7){
                i++;
            }
        }
        if(a==3||b==3||c==3||d==3||e==3||f==3||g==3||i==3){
            System.out.println(name+" is the winner");
            return 4;
        }
        return 1;
    }
}
