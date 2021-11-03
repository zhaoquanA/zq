package edu.xcdq;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // 接受用户输入  +-*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要进行的运算（+-*/）：");
        String sign = scanner.next();
        System.out.println("请输入第一个运算的数字：");
        int i = scanner.nextInt();
        System.out.println("请输入第二个运算的数字：");
        int j = scanner.nextInt();
        int res = 0 ;
        switch (sign) {
            case "+" :
                res = i + j ;
                break;
            case "-":
                res = i - j ;
                break;
            case "*" :
                res = i * j ;
                break;
            case "/" :
                res = i/j;
                break;
        }

        System.out.println(i  + sign + j + " = " + res );


    }

}
