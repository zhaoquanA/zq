package edu.xcdq.demo04;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张美玉");
        student.setAge(18);
        student.setSex('女');
        student.setSchool("黑龙江XX学校");
        System.out.println(student.getName() + student.toString());



    }
}
