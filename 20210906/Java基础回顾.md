# Java基础回顾

## 变量

### 变量和常量的区别

```
int a = 1;

final b =3.14;
```



## 数据类型

### 基本数据类型（值类型）

```
整数  byte short int long 

小数 float double

特别： boolean   char
```



### 引用数据类型

String  数组  自定义数据类型（Person）

### 类型的强制转换

```java
高精确度的数据类型向低精确度的数据类型转换的时候，可能会造成数据的失真，需要强制转换
低精确度的数据类型向高精确度的数据类型转换，会自动转换
double PI = 3.14;
int a = (int) PI ;


```



### 运算符

**赋值运算符**   a  =  1     == （判断是否相等）   === （恒等于）

**数学运算符 **   + - * / %

**逻辑运算符**   与或非   &&  ||   ！

## 选择结构

### if … else

### if … else if … else

```
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
```



### switch

```
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
```



## 循环结构

### for循环

### while循环

### do while循环

## 函数（方法、动作、行为）

### 函数的组成 

```
public void main(String [] args ) {

}

访问修饰符 返回值的类型  函数名 (形式参数的类型 参数的名字) {
	方法体
	return 返回值
}
```



### 函数的递归调用

自己调用自己

a = 4;

void fun () {

​	if (a==1) {    退出条件

​	return

​	}

​	a --;

​	fun();   自己调用自己

}





## 数组

### 一维数组

```
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
```



### 二维数组

```
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
    }
}

```



## 对象和类

### 对象是什么？

### 类的构造方法

```
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
```



## 面向对象

```
public class Person {   // 类  自定义数据类型
    private String name;
    private char sex;
    private int age;
    private String location;

    public void action() {
        System.out.println("行为");
    }
    public void action(String messsage ) {
        System.out.println(messsage);
    }
    
}



public class Demo01 {
    public static void main(String[] args) {
        Person zhangmeiyu = new Person("张美玉", '女', 20, "黑龙江");    // 面向对象编程
        zhangmeiyu.action();
        zhangmeiyu.action("牛13哄哄地查寝");
        System.out.println(zhangmeiyu.toString());
        System.out.print(zhangmeiyu.getName());
        zhangmeiyu.action("带着一帮小弟查寝");

    }

}
```





### 封装

```java
public class Person {
    private String name;
    private char sex;
    private int age;

    // getter setter   封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
```



### 继承

```
package edu.xcdq.demo04;

public class Student extends Person {   // 继承
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}

```



### 多态

```
public class Person {
    private String name;
    private String sex;
    private int age;

    // 吃饭
    public void eat() {

    }
}

public class Child extends Person {

    @Override
    public void eat() {
        System.out.println("小孩喜欢吃糖");
    }
}

public class Teenager extends Person {
    public void eat() {
        System.out.println("青少年喜欢吃火锅烧烤加啤酒");
    }
}


public class Older extends  Person {
    public void eat() {
        System.out.println("喜欢吃清淡的东西");
    }
}
```



## 集合

### List 列表

**ArrayList**   

```
Array 数组 List 列表   数组列表  本质上是个数组
优点：查询快，因为数组有下标，可以直接根据地址一次性访问到对应的元素
缺点：增删慢（写和更新的元素位于中间时），数组的空间大小是固定不变的，增删元素时需要移动其他元素
```

**LinkedList**

```
本质上是个链表
优点：查询慢，因为根据第一个元素依次往后查询
缺点：增删快，不需要移动元素，直接添加或者删除
```

**Vector**

```
过时的接口，是一个线程安全的数组，由于安全，所以操作速度很慢，因此被废弃
```

### Map

**LinkedHashMap**

```
由列表组成  Linked（链）  (Key, value)
优点：增删快
缺点：查询相对较慢
```

**HashMap**

```
默认长度是：16 aka(also know as  也是)  yyds
由数组+链表组成，当长度过长以后会树化，变成数组+红黑树的方式，效率会相对提高，效率整体优秀
```

**HashTable**

```
线程安全的数据结构，速度较慢，使用的不多
```

**ConcurrentHashMap**

```
一致性操作，相较于HashMap是线程安全的，速度相对较慢
```

### Set    1，2 ， 3

```
不能存放重复的元素
```

**HashSet**    底层由hash函数实现

**LinkedHashSet**  底层由链表实现

**TreeSet**   底层由二分查找树实现

## 抽象类与接口

### 抽象类

```
/*
    抽象类
 */
public abstract class Person {
    // 抽象方法没有方法体，只声明
    public abstract void eat();
    
}

public class Child extends Person {

    public void eat() {
        System.out.println("小孩子喜欢吃牛奶");
    }
}

public class Teenager extends  Person {
    @Override
    public void eat() {
        System.out.println("中年人喜欢吃火锅");
    }
}
```



### 接口

```
/*
    接口
 */
public interface Person {
    public void eat();
}

public class Child implements Person {
    @Override
    public void eat() {
        System.out.println("小孩子喜欢吃牛奶");
    }
}

public class Teenager implements Person {
    @Override
    public void eat() {
        System.out.println("中年人喜欢吃火锅+啤酒");
    }
}
```



## 异常处理

### throws抛出异常

```
算术异常
类转换异常
空指针异常
数组越界异常
文件没找到异常


```



### try…catch…finally捕获异常

```
try {
            int res = 10 / 1 ;  // ArithmeticException
            System.out.println(res);

        }catch ( Exception e ) {
            System.out.println("异常为：" + e);
        }finally {
            System.out.println("我尽力了，不管结果如何都会执行这里");
        }
        
}
```



