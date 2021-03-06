代理模式：
    为其他对象提供一种代理，以控制对这个对象的访问
    代理对象在客户端和目标对象之间起到中介的作用
类型：结构型
适用场景：
    1.保护目标对象
    2.增强目标对象
优点：
    1.代理模式能将代理对象与真实被调用的目标对象分离
    2.一定程度上降低了系统的耦合度，扩展性好
    3.保护目标对象
    4.增强目标对象
缺点：
    1.代理模式会造成系统设计中类的数目增加
    2.在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
    3.增加了系统的复杂度
扩展：
    1.静态代理（在代码中显示指定的代理）
        通过在代码中显示的定义了一个业务实现类的一个代理，在代理类中对同名的方法进行包装，用户通过调用代理类的被包装过的业务方法，
        来调用目标对象的业务方法，同时对目标对象的业务方法进行增强
    2.动态代理（只能对实现的接口的类进行动态代理，无法针对具体的实现类；
        无法代理类，但是可以代理接口，在代理当中用到的代理类，是程序在调用到代理类对象时，才由jvm真正创建，
        jvm根据传递进来的业务实现类对象以及方法名，动态的创建了一个代理类的class文件，
        并且class文件被字节码引擎执行，然后通过该代理类的对象进行方法调用）
        通过接口中的方法名，在动态生成的代理类中调用业务实现类的同名方法
    3.CGLib动态代理（对类进行代理，如果代理一个类，CGLib会生成一个，被代理类的子类，覆盖其中的方法；通过继承，然后重写；需要考虑final关键字）
        通过继承来实现的，生成的动态代理的业务类的子类，通过重写业务方法进行代理
    4.Spring代理选择
        a.当Bean有实现接口时，Spring就会用JDK的动态代理
        b.当Bean没有实现接口时，Spring使用CGLib
        可以强制使用CGLib
            - 在Spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>
        参考资料:https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html
代理速度对比：
    1.CGLib 底层是采用asm字节码生成的，比java反射的效率高，需要关注final关键字
    2.JDK动态代理 比CGLib速度在万次执行会快20%左右

相关设计模式：
    1.代理模式（控制访问，更加注重通过设置代理人的方式来增强对象）和装饰者模式（为对象加上某些行为）
    2.代理模式（不改变所代理类的接口）和适配器模式（主要改变所考虑对象的接口）

JDK案例：java.lang.reflect.Proxy、JdkDynamicAopProxy