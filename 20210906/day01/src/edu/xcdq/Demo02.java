package edu.xcdq;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        // 一维数组
        // 第一种创建方式 ： 先指定长度 再分别一一赋值
        int [] aArray = new int[3];
        aArray[0] = 1;
        aArray[1] = 2;
        aArray[2] = 3;
        System.out.println(Arrays.toString(aArray));
        // 第二种创建方式  : 直接赋值
        int [] bArray = { 1, 2, 3 } ;
        System.out.println(Arrays.toString(bArray));
        // 第三种 不指定长度，直接赋值
        int [] cArray = new int [] {1,2,3};
        System.out.println(Arrays.toString(cArray));

        // 二维数组  第一种创建方式
        int [][] dArray = new int[2][3];
        dArray[0][0] = 1;
        dArray[0][1] = 2;
        dArray[0][2] = 3;
        dArray[1][0] = 4;
        dArray[1][1] = 5;
        dArray[1][2] = 6;
        System.out.println(Arrays.toString(dArray));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dArray[i][j] + "\t" );
            }
            System.out.println();
        }
        System.out.println("==============================");
        // 二维数组 第二种创建方式
        int [] [] eArray = {  {1,2,3}  ,{4,5,6} };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dArray[i][j] + "\t" );
            }
            System.out.println();
        }
        System.out.println("==================");
        // 二维数组 第三种方式
        int [][]  fArray = new int[][] { {1,2,3}, {4,5,6} };
        for (int i = 0; i < fArray.length; i++) {
            for (int j = 0; j < fArray[i].length; j++) {
                System.out.print(dArray[i][j] + "\t" );
            }
            System.out.println();
        }

        int count = 1;
        int [][][] temp = new int[3][2][3] ;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                for (int k = 0; k < temp[i][j].length; k++) {
                    temp[i][j][k] = count ++;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                for (int k = 0; k < temp[i][j].length; k++) {
                    System.out.println(temp[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }












    }
}
