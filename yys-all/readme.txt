二次开发yys碎片系统
    采用springBoot框架+mybatis框架+redis缓存(暂时未使用)+thymeleaf模板引擎
############
此系统为
阴阳师碎片管理系统

    使用时在mysql中创建yys_all数据库
    将yys_all.sql导入即可

    默认管理员
     root 123456

    默认账户
     1881466479 123456

    =======================================

    制作 :lwkangpy

    码云:https://gitee.com/lwkangpy
    微博:https://weibo.com/lwekangpy/home
    邮箱:lwkangpy@163.com

    ========================================










##############
1 创建框架
    导入起步依赖使用springBoot1.5.10

2 dao
     <!--解决xml文件不编译问题-->
            <resources>

                <resource>
                    <directory>src/main/java</directory>
                    <includes>
                        <include>**/*.xml</include>
                    </includes>
                </resource>
                <resource>
                    <directory>src/main/resources</directory>
                    <includes>
                        <include>**/*.*</include>
                    </includes>
                </resource>
                <resource>
                    <directory>src/main/wabapp</directory>
                    <targetPath>MATA-INF/resources</targetPath>
                    <includes>
                        <include>**/*.*</include>
                    </includes>
                </resource>

            </resources>