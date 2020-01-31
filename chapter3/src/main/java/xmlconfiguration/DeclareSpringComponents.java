package xmlconfiguration;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/xml-configuration.xml");
        ctx.refresh();

        MessageRenderer renderer = ctx.getBean("renderer", MessageRenderer.class);
        renderer.render();
        ctx.close();
    }
}
