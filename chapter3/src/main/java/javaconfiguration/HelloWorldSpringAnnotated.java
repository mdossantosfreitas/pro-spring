package javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xmlconfiguration.MessageRenderer;

public class HelloWorldSpringAnnotated {

    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
