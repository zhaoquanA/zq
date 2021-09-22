```java
`name`varchar(10),
sex char student
insert into student(`name`,age)values("小爱",18);
insert into student(`name`,age)values("小冰",19);

select * from student;

insert into student(`name`, sex province,age) values("小琪",'女','广东',20);
insert into student values("siri",'女', 'califlina',20);

desc student ;

alter table student change `name` `name` varchar(10) not null unique ; -- 修改现有表格的属性

alter table student rename to students; -- 修改表格的名字 重命名
desc students;
alter table students modify `name` varchar(20); -- 修改表格的字段属性
alter table students change sex xingbie varchar(5); -- 改变字段的名称
alter table students add grade varchar(4); -- 修改表格  添加一个字段
alter table students modify age int(11) after grade; -- 修改年龄字段顺序  在成绩的后面
```

