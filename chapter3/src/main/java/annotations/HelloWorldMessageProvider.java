package annotations;

import org.springframework.stereotype.Component;
import xmlconfiguration.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World annotation";
    }
}
