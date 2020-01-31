package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xmlconfiguration.MessageProvider;
import xmlconfiguration.MessageRenderer;
import xmlconfiguration.StandardOutMessageRenderer;

@Component("renderer")
public class StandartOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }
    //setter injection
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
