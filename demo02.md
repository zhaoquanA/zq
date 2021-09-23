```java
use xuexiao;

create table studentInfo(
 name varchar(10);
 sex char,
 age int,
 address varchar(20)

);

show tables;
 -- 插入操作
 -- 值需要安照字段的顺序插入，如果插入的值和创建表顺序相同，则字段可以省略
insert into studentInfo(name , sex , age , address) values ("张三" , '男' ,19, '河南省许昌市');
insert into studentInfo(sex , address , age , name ) values ("女" , '河南省郑州市',29,'小红');
insert into studentInfo values ("小黑" , '男' ,39, '河南省沧州市');
select * from studentInfo;

 -- 修改已创建的表字段默认值
alter table studentInfo change sex sex char default '男';

insert into studentInfo(name , sex , age , address) values ("翠花" , '女' ,18, '河南省许昌市');
insert into studentInfo(sex , address , age , name ) values ("女" , '河南省郑州市',49,'秀莲');
insert into studentInfo values ("黑斯" , '男',29, '河北省邯郸市'); -- 有默认值  如果省略字段，则值需要写全
select * from studentInfo;

create table studentInfo2(
 id int auto_increment primary key,
 name varchar(10);
 sex char,
 age int,
 address varchar(20)

);

show tables;
insert into studentInfo2(id ,`name` , sex , age , address) values (1,"翠花" , '女' ,18, '河南省许昌市');
insert into studentInfo2(`name `, sex , age , address) values ("翠花" , '女' ,18, '河南省许昌市');
insert into studentInfo2(id ,`name` , sex , age , address) values (3,"翠花2" , '女' ,18, '河南省许昌市');
insert into studentInfo2(id ,`name` , sex , age , address) values (2,"翠花2" , '女' ,18, '河南省许昌市');
insert into studentInfo2( `name` , sex , age , address) values ("黑斯" , '男',29, '河北省邯郸市');
 ("李逵" , '男',29, '河北省邯郸市'),
 ("宋江" , '男',29, '河北省邯郸市'),
 ("吴用" , '男',29, '河北省邯郸市');
 ("公孙胜" , '男',29, '河北省邯郸市');
desc studentInfo2;
selct * from studentInfo2;
selct * from studentInfo;
insert into studentInfo2 values (10;"黑斯" , '男',29, '河北省邯郸市');
 ("李逵" , '男',29, '河北省邯郸市'),
 ("宋江" , '男',29, '河北省邯郸市'),
 ("吴用" , '男',29, '河北省邯郸市');
 ("公孙胜" , '男',29, '河北省邯郸市');

insert into studentInfo2 values (11;"黑斯" , '男',29, '河北省邯郸市');
 (12,"李逵" , '男',29, '河北省邯郸市'),
 (13,"宋江" , '男',29, '河北省邯郸市'),
 (14,"吴用" , '男',29, '河北省邯郸市');
 (15,"公孙胜" , '男',29, '河北省邯郸市');
selct * from studentInfo2;

 -- 修改  UPDATE...SET...where 条件
 -- 修改指定的数据
update studentInfo set name="潘金莲" where name="绣莲";
 -- 没有写条件，则修改全部的数据
update studentInfo set name="潘金莲";

 -- 删除 delete  from  table where ...  有日志留下，可以恢复
delete * from studentInfo2 where name="翠花2";  -- 删除符合条件的数据

delete from studentInfo;  -- 删除所有数据

 -- 销毁数据  不留下日志，速度快，无法恢复
truncate table studentInfo2;



```

