# HelloWorld
pom.xml中的版本要统一，不然会出现问题
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>com.chen</groupId>
<artifactId>ssm</artifactId>
<packaging>war</packaging>
<version>1.0-SNAPSHOT</version>
<name>ssm Maven Webapp</name>
<url>http://maven.apache.org</url>
<properties>
<junit.version>4.12</junit.version>
<spring.version>4.1.3.RELEASE</spring.version>
<mybatis.version>3.2.8</mybatis.version>
<mybatis.spring.version>1.2.2</mybatis.spring.version>
<mybatis.paginator.version>1.2.15</mybatis.paginator.version>
<mysql.version>5.1.32</mysql.version>
<slf4j.version>1.6.4</slf4j.version>
<jackson.version>2.4.2</jackson.version>
<druid.version>1.0.9</druid.version>
<httpclient.version>4.3.5</httpclient.version>
<jstl.version>1.2</jstl.version>
<servlet-api.version>3.1.0</servlet-api.version>
<jsp-api.version>2.0</jsp-api.version>
<joda-time.version>2.5</joda-time.version>
<commons-lang3.version>3.3.2</commons-lang3.version>
<commons-io.version>1.3.2</commons-io.version>
<commons-net.version>3.3</commons-net.version>
<pagehelper.version>3.4.2-fix</pagehelper.version>
<jsqlparser.version>0.9.1</jsqlparser.version>
<commons-fileupload.version>1.3.1</commons-fileupload.version>
<jedis.version>2.7.2</jedis.version>
<solrj.version>4.10.3</solrj.version>
<freemarker.version>2.3.23</freemarker.version>
<quartz.version>2.2.2</quartz.version>
</properties>
<dependencies>
<!-- 时间操作组件 -->
<dependency>
<groupId>joda-time</groupId>
<artifactId>joda-time</artifactId>
<version>${joda-time.version}</version>
</dependency>
<!-- Apache工具组件 -->
<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-lang3</artifactId>
<version>${commons-lang3.version}</version>
</dependency>
<dependency>
<groupId>org.apache.commons</groupId>
<artifactId>commons-io</artifactId>
<version>${commons-io.version}</version>
</dependency>
<dependency>
<groupId>commons-net</groupId>
<artifactId>commons-net</artifactId>
<version>${commons-net.version}</version>
</dependency>
<!-- Jackson Json处理工具包 -->
<dependency>
<groupId>com.fasterxml.jackson.core</groupId>
<artifactId>jackson-databind</artifactId>
<version>${jackson.version}</version>
</dependency>
<!-- httpclient -->
<dependency>
<groupId>org.apache.httpcomponents</groupId>
<artifactId>httpclient</artifactId>
<version>${httpclient.version}</version>
</dependency>
<!-- 单元测试 -->
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>${junit.version}</version>
<scope>test</scope>
</dependency>
<!-- 日志处理 -->
<dependency>
<groupId>org.slf4j</groupId>
<artifactId>slf4j-log4j12</artifactId>
<version>${slf4j.version}</version>
</dependency>
<!-- Mybatis -->
<dependency>
<groupId>org.mybatis</groupId>
<artifactId>mybatis</artifactId>
<version>${mybatis.version}</version>
</dependency>
<dependency>
<groupId>org.mybatis</groupId>
<artifactId>mybatis-spring</artifactId>
<version>${mybatis.spring.version}</version>
</dependency>
<dependency>
<groupId>com.github.miemiedev</groupId>
<artifactId>mybatis-paginator</artifactId>
<version>${mybatis.paginator.version}</version>
</dependency>
<dependency>
<groupId>com.github.pagehelper</groupId>
<artifactId>pagehelper</artifactId>
<version>${pagehelper.version}</version>
</dependency>
<!-- MySql -->
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>${mysql.version}</version>
</dependency>
<!-- 连接池 -->
<dependency>
<groupId>com.alibaba</groupId>
<artifactId>druid</artifactId>
<version>${druid.version}</version>
</dependency>
<!-- Spring -->
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-context</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-beans</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-webmvc</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-jdbc</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-test</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-aspects</artifactId>
<version>${spring.version}</version>
</dependency>
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-context-support</artifactId>
<version>${spring.version}</version>
</dependency>
<!-- JSP相关 -->
<dependency>
<groupId>jstl</groupId>
<artifactId>jstl</artifactId>
<version>${jstl.version}</version>
</dependency>
<dependency>
<groupId>javax.servlet</groupId>
<artifactId>javax.servlet-api</artifactId>
<version>${servlet-api.version}</version>
</dependency>
<dependency>
<groupId>javax.servlet</groupId>
<artifactId>jsp-api</artifactId>
<version>${jsp-api.version}</version>
<scope>provided</scope>
</dependency>
<!-- 文件上传组件 -->
<dependency>
<groupId>commons-fileupload</groupId>
<artifactId>commons-fileupload</artifactId>
<version>${commons-fileupload.version}</version>
</dependency>
<!-- Redis客户端 -->
<dependency>
<groupId>redis.clients</groupId>
<artifactId>jedis</artifactId>
<version>${jedis.version}</version>
</dependency>
<!-- solr客户端 -->
<dependency>
<groupId>org.apache.solr</groupId>
<artifactId>solr-solrj</artifactId>
<version>${solrj.version}</version>
</dependency>
<dependency>
<groupId>org.freemarker</groupId>
<artifactId>freemarker</artifactId>
<version>${freemarker.version}</version>
</dependency>
<dependency>
<groupId>org.quartz-scheduler</groupId>
<artifactId>quartz</artifactId>
<version>${quartz.version}</version>
</dependency>
</dependencies>


<build>
<finalName>${project.artifactId}</finalName>
<plugins>
<!-- 资源文件拷贝插件 -->
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-resources-plugin</artifactId>
<version>2.7</version>
<configuration>
<encoding>UTF-8</encoding>
</configuration>
</plugin>
<!-- java编译插件 -->
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.2</version>
<configuration>
<source>1.7</source>
<target>1.7</target>
<encoding>UTF-8</encoding>
</configuration>
</plugin>
</plugins>
<pluginManagement>
<plugins>
<!-- 配置Tomcat插件 -->
<plugin>
<groupId>org.apache.tomcat.maven</groupId>
<artifactId>tomcat7-maven-plugin</artifactId>
<configuration>
<port>8080</port>
<path>/</path>
</configuration>
<version>2.2</version>
</plugin>
</plugins>
</pluginManagement>


</build>
</project>


mybatis的配置文件可用mybatis-generator生成
数据格式化
书写格式化类
package com.cvte.chen.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 数据格式化
 */

// 实现Converter<S,T>接口
public class DateFormatter implements Formatter<Date>{

   // 日期类型模板：如yyyy-MM-dd
   private String datePattern;
   // 日期格式化对象
   private SimpleDateFormat dateFormat;

   // 构造器，通过依赖注入的日期类型创建日期格式化对象
   public DateFormatter(String datePattern) {
      this.datePattern = datePattern;
      this.dateFormat = new SimpleDateFormat(datePattern);
   }

   // 显示Formatter<T>的T类型对象
   @Override
   public String print(Date date, Locale locale) {
      return dateFormat.format(date);
   }

   // 解析文本字符串返回一个Formatter<T>的T类型对象。
   @Override
   public Date parse(String source, Locale locale) throws ParseException {
      try {
         return dateFormat.parse(source);
      } catch (Exception e) {
         throw new IllegalArgumentException();
      }

   }



}
配置
mvc annotation : <mvc:annotation-driven conversion-service="conversionService">
bean 定义
<!-- 格式化 -->
<bean id="conversionService"
     class="org.springframework.format.support.FormattingConversionServiceFactoryBean">
    <property name="formatters">
        <list>
            <bean class="com.cvte.chen.formatter.DateFormatter" c:_0="yyyy-MM-dd"/>
        </list>
    </property>
</bean>

json数据
. 配置json数据
  1. 客户端发生json数据，后台可以直接通过数据绑定把数据装入实体类中
  2. 后台可以通过@ResponseBody来进行json数据返回
    使用@ResponseBody进行json数据返回
    1. 导入需要的jar包
            <!--jackson-->
        <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.8.8</version>
        </dependency>
      2. 配置jackson控制器
        <mvc:annotation-driven  conversion-service="conversionService">
            <mvc:message-converters>
                <bean id="mappingJacksonHttpMessageConverter"
                           class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                    <property name="supportedMediaTypes">
                        <list>
                            <!--返回字符串格式json-->
                            <value>application/json;charset=UTF-8</value>
                        </list>
                    </property>
            </bean>
            </mvc:message-converters>
        </mvc:annotation-driven>
         3. controller中使用responseBody
    【注意： 1、 如果没有导入jar包或者配置控制器，会发生406错误，因为返回的数据类型不匹配
            2. 如果使用ajax异步进行json数据交互，必须加上responseBody注解，不然ajax会返回404错误
              @responsebody表示该方法的返回结果直接写入HTTP response body中
              一般在异步获取数据时使用，在使用@RequestMapping后，返回值通常解析为跳转路径，
              加上@responsebody后返回结果不会被解析为跳转路径，而是直接写入HTTP response body中。
              比如异步获取json数据，加上@responsebody后，会直接返回json数据。
            3. 使用jackson后，如果controller方法直接返回字符串，responseText会出现双引号，例如 responseText:""success""
      】


添加junit
到Juti中进行MockmMvc的配置，MockMvc可以发送请求，进行强求数据的测试
在进行MockMvc获取时，要获取 WebApplicationContext 需要使用其注解@WebApplicationContext  这里要记得导入servlet
<dependency>
 <groupId>javax.servlet</groupId>
 <artifactId>javax.servlet-api</artifactId>
 <version>3.1.0</version></dependency>  

不然会发生下列的错误 :
java.lang.ExceptionInInitializerError
at com.jbo.testapp.AppServletTest.setUp(AppServletTest.java:36)
at junit.framework.TestCase.runBare(TestCase.java:128)
at junit.framework.TestResult$1.protect(TestResult.java:106)
at junit.framework.TestResult.runProtected(TestResult.java:124)
at junit.framework.TestResult.run(TestResult.java:109)
at junit.framework.TestCase.run(TestCase.java:120)
at junit.framework.TestSuite.runTest(TestSuite.java:230)
at junit.framework.TestSuite.run(TestSuite.java:225)
at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.lang.reflect.Method.invoke(Method.java:497)
at org.apache.maven.surefire.junit.JUnitTestSet.execute(JUnitTestSet.java:96)
at org.apache.maven.surefire.junit.JUnit3Provider.executeTestSet(JUnit3Provider.java:117)
at org.apache.maven.surefire.junit.JUnit3Provider.invoke(JUnit3Provider.java:94)
at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.lang.reflect.Method.invoke(Method.java:497)
at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)
at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)
at org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)
at 

org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)
    at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)Caused by: java.util.MissingResourceException: Can't find bundle for base name javax.servlet.LocalStrings, locale es_ES
    at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1564)
    at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1387)
    at java.util.ResourceBundle.getBundle(ResourceBundle.java:773)
    at javax.servlet.GenericServlet.<clinit>(GenericServlet.java:95)
   ... 24 more
Caused by: java.util.MissingResourceException: Can't find bundle for base name javax.servlet.LocalStrings, locale es_ES
    at java.util.ResourceBundle.throwMissingResourceException(ResourceBundle.java:1564)
    at java.util.ResourceBundle.getBundleImpl(ResourceBundle.java:1387)
    at java.util.ResourceBundle.getBundle(ResourceBundle.java:773)
    at javax.servlet.GenericServlet.<clinit>(GenericServlet.java:95)
   ... 24 more
代码如下：
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring-*.xml")
@WebAppConfiguration
public class AppTests {

    private MockMvc mockMvc;
    @Resource
    UsertestMapper usertestMapper;

    @Resource
    UsertestService usertestService;

    @Resource
   private WebApplicationContext webApplicationContext;

    @Before
   public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
   public void simple() throws Exception {
        System.out.println("test");
    }

}
mock测试的时候
The Servlet API mocks in Spring Framework 4.0 support Servlet 3.0 and higher
如果使用版本较低的servlet，会发生下列的错误
java.lang.NoClassDefFoundError: javax/servlet/SessionCookieConfig
    at org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder.initWebAppContext(StandaloneMockMvcBuilder.java:329)
    at org.springframework.test.web.servlet.setup.AbstractMockMvcBuilder.build(AbstractMockMvcBuilder.java:127)
    at com.tony.springTest.HomeControllerTest.testHomeP(HomeControllerTest.java:34)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
    at java.lang.reflect.Method.invoke(Method.java:597)
    at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:44)
    at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)
    at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:41)
    at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:76)
    at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:50)
    at org.junit.runners.ParentRunner$3.run(ParentRunner.java:193)
    at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:52)
    at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:191)
    at org.junit.runners.ParentRunner.access$000(ParentRunner.java:42)
    at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:184)
    at org.junit.runners.ParentRunner.run(ParentRunner.java:236)
    at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)
    at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
    at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)
    at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)
    at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)
    at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)
Caused by: java.lang.ClassNotFoundException: javax.servlet.SessionCookieConfig
    at java.net.URLClassLoader$1.run(URLClassLoader.java:202)
    at java.security.AccessController.doPrivileged(Native Method)
    at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:301)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
    ... 25 more

