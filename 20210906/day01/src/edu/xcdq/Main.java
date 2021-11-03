package edu.xcdq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 选择结构
        String name ="美玉";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        name = scanner.next();
        if ( name.equals("美玉") ) {
            System.out.println("查寝");
        } else if ( name.equals("凡凡") ){
            System.out.println("大碗宽面");
        } else {
            System.out.println("踏实做人");
        }

    }
}
