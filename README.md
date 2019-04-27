# yys_all

#### 介绍
yys2.2项目上线(IDEA项目下载源码:yys-all 文件夹)

#### 软件架构
软件架构说明
    1.0 ssm springMVC+spring+myBatis 
    
    2.2 springBoot+mybatis


#### 安装教程

1. yys包下为eclipse项目文件直接导入即可
2. 注意将yys/YYS-TEST/src/yys_all.sql 运行至mysql(***创建数据库yys_all)
3. 数据库四要素:
            jdbc.driver=com.mysql.jdbc.Driver
            jdbc.url=jdbc:mysql://127.0.0.1:3306/yys_all
            jdbc.user=root
            jdbc.password=123456
4. 数据库建立完毕之后.将YYS-TEST.war 包放入Tomcat7中运行

5. 最近上架了最新版本2.2 springBoot版本
 直接下载jar即可运行(注意添加数据库 默认端口80)(没有数据库有默认账户lwkangpy 123456 可以进入前台)
 访问地址:
    http://{ip地址:127.0.0.1/localhost}:{端口默认80}/yysall/;
    即可
6. 日志会记录在运行目录跟目录下 eg:你在C:\AAA\BBB 下运行
在c盘下有文件夹YYS-log文件夹中记录日志

#### 2.2系统截图
登录界面
![Image text](https://gitee.com/lwkangpy/yys_all/blob/master/img-2.2/yys-1.png)
管理界面
![Image text](https://gitee.com/lwkangpy/yys_all/blob/master/img-2.2/yys-2.png)
![Image text](https://gitee.com/lwkangpy/yys_all/blob/master/img-2.2/yys-3.png)
![Image text](https://gitee.com/lwkangpy/yys_all/blob/master/img-2.2/yys-4.png)

#### 参与贡献

 1.制作人:lwkngpy
 2.微博 : http://weibo.com/lwekangpy 
