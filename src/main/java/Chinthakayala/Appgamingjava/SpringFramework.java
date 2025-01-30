package Chinthakayala.Appgamingjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFramework {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Spring.class);
        System.out.println(context.getBean("name"));
    }
}