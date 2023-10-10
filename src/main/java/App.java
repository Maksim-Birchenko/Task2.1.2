import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getCat());
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getCat());
        boolean result = bean1 == bean;
        System.out.println(result);
        boolean result1 = cat1 == cat;
        System.out.println(result1);
    }
}