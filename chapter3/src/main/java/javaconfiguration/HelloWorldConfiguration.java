package javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xmlconfiguration.HelloWorldMessageProvider;
import xmlconfiguration.MessageProvider;
import xmlconfiguration.MessageRenderer;
import xmlconfiguration.StandardOutMessageRenderer;

@ComponentScan(basePackages = {"javaconfiguration"})
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
