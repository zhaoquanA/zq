package edu.xcdq.demo04;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class demo04 {
    public static void main(String[] args) {

        try {
            int res = 10 / 1 ;  // ArithmeticException
            System.out.println(res);

        }catch ( Exception e ) {
            System.out.println("异常为：" + e);
        }finally {
            System.out.println("我尽力了，不管结果如何都会执行这里");
        }




    }

}
