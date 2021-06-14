```java
create database Two20210603 default charset=utf8;
use Two20210603;

create table student(
 `name` varchar(10),
 sex char,
 age int,
 address varchar(100)
);

insert into student values ("王小小","男",20,"许昌"),
("王大","男",18,"许昌"),("王二","男",20,"许昌"),("王八","男",20,"许昌"),
("吴用","男",18,"沧州"),("吴有","男"18,"曹县"),("吴汉","男",38,"安阳")
;
select * from student;

 -- 模糊查询  like
 # % 匹配多个字符  _匹配一个字符
select *from student where `name` like "王%";
select *from student where `name` like "王_";
insert into student values ("梅超风",'女',38,'江南'),("梅用",'男',35,'南京'),
("马超",'男',25,"西凉")
;
select *from student where `name` like "%用";
select *from student where `name` like "%"; # 匹配所有的数据
select *from student where `name` like "_超_%";
```

