# mybatisgenerator
mybatis 自动sql生成器
1、在pom.xml中配置 生成器使用的配置文件地质
如：
<configurationFile>src/main/resources/unused/generatorConfigPostgre151.xml</configurationFile>
2、在generatorConfigPostgre151.xml中配置相关的数据库、生成表、生成mapper等相关信息
例：
<generatorConfiguration>
    <!-- 数据库驱动:选择你的本地硬盘上面的数据库驱动包-->
    <classPathEntry  location="D:\ENV_DNV\maven_jar\org\postgresql\postgresql\42.2.8\postgresql-42.2.8.jar"/>
    <context id="DB2Tables"  targetRuntime="MyBatis3">
        <commentGenerator>
            <property name="suppressDate" value="true"/>
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>
        <!--数据库链接URL，用户名、密码 -->
        <jdbcConnection driverClass="org.postgresql.Driver" connectionURL="jdbc:postgresql://ip:port/vs_rtu_cloud?useUnicode=true&amp;=characterEncodingutf8" userId="username" password="password">
        </jdbcConnection>
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>
        <!-- 生成模型的包名和位置-->
        <javaModelGenerator targetPackage="github.com.danne.lee.entity" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
        <!-- 生成映射文件的包名和位置-->
        <sqlMapGenerator targetPackage="github.com.danne.lee.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator>
        <!-- 生成DAO的包名和位置-->
        <javaClientGenerator type="XMLMAPPER" targetPackage="github.com.danne.lee.mapper" targetProject="src/main/java">
            <property name="enableSubPackages" value="true"/>
        </javaClientGenerator>
        <!-- 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名-->
        <table tableName="data_static_flow" domainObjectName="DataStaticFlow" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"/>
        <table tableName="pump_full_coefficient" domainObjectName="PumpFullCoefficient" enableCountByExample="false" enableUpdateByExample="false" enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false"/>
    </context>
</generatorConfiguration>
