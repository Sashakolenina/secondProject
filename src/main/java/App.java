import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean1.getName());

        HelloWorld hello1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld hello2 = applicationContext.getBean(HelloWorld.class);

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        System.out.println(hello1 == hello2);
        System.out.println(cat1 == cat2);
    }
}