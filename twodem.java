package com.anudip.learning;

public class twodem {
    public static void main(String[] args) {
        int arry[][]=new int [4][3];
        arry[0][0]=10;
        arry[0][1]=20;
        arry[1][1]=40;
        arry[2][0]=50;
       for(int i =0;i<arry.length;i++){
            for(int j=0;j<arry[i].length;j++){
                System.out.print(arry[i][j]+" ");
            }
            System.out.println();
        }
         /*System.out.print(arry[0][0]+" ");
        System.out.println(arry[0][1]+" ");
        System.out.print(arry[0][2]+" ");
        System.out.println(arry[1][1]+" ");
        System.out.print(arry[2][0]+" ");*/
    }
    
}
