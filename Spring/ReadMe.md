

### JAVA Web开发 学习项目


#### spring学习网站

https://www.tutorialspoint.com/spring/index.htm


#### 环境

JAVA 1.8.0.201, IDEA2018.03，SpringMVC 4.3.18


#### Spring 教程


##### [1、SpringExample_BeanScope](./SpringExample_BeanScope)

https://www.tutorialspoint.com/spring/spring_bean_scopes.htm

定义<bean>时，您可以选择声明该bean的作用域。 例如，要在每次需要时强制Spring生成一个新的bean实例，您应该将bean的scope属性声明为原型。 类似地，如果希望Spring在每次需要时返回相同的bean实例，则应将bean的scope属性声明为singleton。


##### [2、SpringExample_BeanLifeCycle](./SpringExample_BeanLifeCycle)

https://www.tutorialspoint.com/spring/spring_bean_life_cycle.htm

Spring bean的生命周期很容易理解。 实例化bean时，可能需要执行一些初始化以使其进入可用状态。 类似地，当不再需要bean并将其从容器中移除时，可能需要进行一些清理。

##### [3、SpringExample_BeanPostProcessor](./SpringExample_BeanPostProcessor)

https://www.tutorialspoint.com/spring/spring_bean_post_processors.htm

BeanPostProcessor接口定义了您可以实现的回调方法，以提供您自己的实例化逻辑，依赖关系解析逻辑等。您还可以在Spring容器通过插入一个或多个实例化，配置和初始化bean之后实现一些自定义逻辑BeanPostProcessor实现。

##### [4、SpringDependencyInjection](./SpringDependencyInjection)

https://www.tutorialspoint.com/spring/spring_dependency_injection.htm

每个基于Java的应用程序都有一些对象可以协同工作，以呈现最终用户所看到的工作应用程序。 在编写复杂的Java应用程序时，应用程序类应尽可能独立于其他Java类，以增加重用这些类的可能性，并在单元测试时独立于其他类测试它们。 依赖注入（或称为布线）有助于将这些类粘合在一起，同时保持它们的独立性。


##### [5、SpringInjectingCollection](./SpringInjectingCollection)

https://www.tutorialspoint.com/spring/spring_injecting_collection.htm

Spring和容器如List，Set，Map和Properties的值传递。


##### [6、SpringEventHandling](./SpringEventHandling)

https://www.tutorialspoint.com/spring/event_handling_in_spring.htm

Spring的核心是ApplicationContext，它管理bean的完整生命周期。  ApplicationContext在加载bean时发布某些类型的事件。 例如，在启动上下文时发布ContextStartedEvent，并在上下文停止时发布ContextStoppedEvent。

##### [7、SpringJDBC_Example1](./SpringJDBC_Example)

https://www.tutorialspoint.com/spring/spring_jdbc_framework.htm

操作数据库例子1

```xml
<!--Initalization for data source-->
<bean id="dataSource"
          class="org.springframework.jdbc.datasource.DriverManagerDataSource">
   <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
     <property name="url" value="jdbc:mysql://localhost:3306/TEST"/>
     <property name="username" value="root" />
   <property name="password" value="123" />
</bean>

<!--Definition for studentJDBCTemplate bean-->
<bean id="studentJDBCTemplate"
        class="com.tutorialspoint.StudentJDBCTemplate">
     <property name="dataSource" ref="dataSource"/>
</bean>
```

##### [8、SpringJDBC_Example2](./SpringJDBC_Example2)

https://www.tutorialspoint.com/spring/spring_jdbc_framework.htm

操作数据库例子2

##### [9、CustomEventsInSpring] (./CustomEventsInSpring)

https://www.tutorialspoint.com/spring/custom_events_in_spring.htm

介绍spring的自定义消息。


##### [10、IOC_Example](./IOC_Example)

IoC（Inversion of Control，控制倒转）

```java
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

UserService userService = (UserService)applicationContext.getBean("userService");
userService.say();
```
##### [11、Spring-BeanDefinitionInheritance](./Spring-BeanDefinitionInheritance)

https://www.tutorialspoint.com/spring/spring_bean_definition_inheritance.htm

Bean的内部定义

```java
ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
objA.getMessage1();
```

##### [12、ReadXmlSql](./ReadXmlSql)

https://www.tutorialspoint.com/spring/spring_jdbc_framework.htm

演示xml和类成员绑定

```java
//如果xml文件在src下面的话，直接写文件名就行
ApplicationContext context = new ClassPathXmlApplicationContext("DBParaProperty.xml");
//根据bean节点的标识获取对象，id
DBParaProperty dbParaProperty = (DBParaProperty) context.getBean("DBParaProperty");
System.out.println(dbParaProperty.getSqlServerUserName());
```


##### [13、Spring-BeanDefinitionInheritance](./Spring-BeanDefinitionInheritance)

https://www.tutorialspoint.com/spring/spring_bean_definition_inheritance.htm

bean定义可以包含许多配置信息，包括构造函数参数，属性值和特定于容器的信息，例如初始化方法，静态工厂方法名称等。子bean定义从父定义继承配置数据。 子定义可以根据需要覆盖某些值或添加其他值。


##### [14、SpringAnnotationBasedConfig](./SpringAnnotationBasedConfig)

https://www.tutorialspoint.com/spring/spring_annotation_based_configuration.htm

从Spring 2.5开始，可以使用注释配置依赖注入。 因此，不是使用XML来描述bean连接，而是可以通过在相关的类，方法或字段声明上使用注释将bean配置移动到组件类本身。


```java
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld() {
        return  new HelloWorld();
    }
}
```

Spring框架依赖xml注释来实现注入

```java
ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
helloWorld.setMessage("Hello World!");
helloWorld.getMessage();
```

##### [15、SpringBeansAutoWiring](./SpringBeansAutoWiring)

https://www.tutorialspoint.com/spring/spring_beans_autowiring.htm


Spring容器可以在不使用<constructor-arg>和<property>元素的情况下自动装配协作bean之间的关系，这有助于减少为大型基于Spring的应用程序编写的XML配置量。

@Configuration和@Bean关键字的使用

```java
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
```



