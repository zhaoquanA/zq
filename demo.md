```java
create database school; -- 创建数据库

show databases; -- 显示数据库

use school;  -- 使用数据库
 -- 创建学生信息表 
create table studentInfo1 (
 id int primary key , -- 主键
 name varchar(10),
 age int,
 sex char,
 province char,
 primary key (id,`name`) -- 联合主键
);

show tables; -- 显示表格
 
desc studentInfo; -- 描述表格具体信息

create table studentInfo2 (
 id int primary key , -- 主键
 name varchar(10),
 age int,
 sex char,
 province char,
 primary key (id,`name`) -- 联合主题
);
 --创建表格
create table book (
 id int auto_increment primary key,  -- 自动增长id
 name varchar(20),
 author char(4)
);
alter table book rename books; -- 修改表结构 改名为books
 -- 向表格中插入数据
insert into book(`name`,author)values ('钢铁是怎样炼成的','保尔');
insert into book(`name`,author)values ('钢铁是怎样炼成的','保尔');
insert into book(`name`,author)values ('钢铁是怎样炼成的','保尔');
insert into book(`name`,author)values ('钢铁是怎样炼成的','保尔');

select * from book;  -- 查询表格中的全部数据

create table address1(
 province varchar(10),
 shi varchar(10),
 xian varchar(10),
 cun varchar(10),
 constraint waijian foreign key (province) references studentInfo(province) -- 外键
);

```

