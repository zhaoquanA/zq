package edu.xcdq;

public class Person {   // 类
    public String name;
    public int age;
    public char sex;


    public void xingwei () {
        System.out.println("做事");
    }

    public void xingwei(String message ) {
        System.out.println(message);
    }

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }




}
