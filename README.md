# mybatisgenerator
##  mybatis 自动sql生成器
1. 在pom.xml中配置 生成器使用的配置文件地质
如：
`<configurationFile>src/main/resources/unused/generatorConfigPostgre151.xml</configurationFile>`
2. 在**generatorConfigPostgre151.xml**中配置相关的数据库、生成表、生成mapper等相关信息
例：
```xml
<generatorConfiguration>
    <!-- 数据库驱动:选择你的本地硬盘上面的数据库驱动包-->
    <classPathEntry  location="D:\ENV_DNV\maven_jar\org\postgresql\postgresql\42.2.8\postgresql-42.2.8.jar"></classPathEntry>
    <context id="DB2Tables"  targetRuntime="MyBatis3">
        <commentGenerator>
            <property name="suppressDate" value="true"></property>
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true"></property>
        </commentGenerator>
        <!--数据库链接URL，用户名、密码 -->
        <jdbcConnection driverClass="org.postgresql.Driver" connectionURL="jdbc:postgresql://ip:port/vs_rtu_cloud?useUnicode=true&=characterEncodingutf8" userId="username" password="password">
        </jdbcConnection>
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"></property>
        </javaTypeResolver>
        <!-- 生成模型的包名和位置-->
        <javaModelGenerator targetPackage="github.com.danne.lee.entity" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"></property>
            <property name="trimStrings" value="true"></property>
        </javaModelGenerator>
        <!-- 生成映射文件的包名和位置-->
        <sqlMapGenerator targetPackage="github.com.danne.lee.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"></property>
        </sqlMapGenerator>
        <!-- 生成DAO的包名和位置-->
        <javaClientGenerator type="XMLMAPPER" targetPackage="github.com.danne.lee.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"></property>
        </javaClientGenerator>
        <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->
        <table tableName="data_static_flow" domainObjectName="DataStaticFlow" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>
        <table tableName="pump_full_coefficient" domainObjectName="PumpFullCoefficient" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"></table>
    </context>
</generatorConfiguration>
```
3.执行命令
`mvn mybatis-generator:generate `
