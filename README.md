
测试：
访问路径：http://localhost:8080/poi/view

准备：
在pom.xml导入
        <!--poi-->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.15</version>
        </dependency>
        <!--ooxml -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>3.15</version>
        </dependency>
        
测试上/下载excel存放路径：poi-common/ExcelUpDl

注意：前端请求后端代码 [同步]
-------------------------------------------------------------------
pom.xml 已添加支持：

mybatis,mysql

只需要修改对应的数据连接、写具体的业务逻辑。
-------------------------------------------------------------------

感谢作者：
https://blog.csdn.net/m0_37499059/article/details/82939453
