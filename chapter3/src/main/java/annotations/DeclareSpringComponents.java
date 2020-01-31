package annotations;

import org.springframework.context.support.GenericXmlApplicationContext;
import xmlconfiguration.MessageRenderer;

public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/annotation-configuration.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
        ctx.close();
    }
}
