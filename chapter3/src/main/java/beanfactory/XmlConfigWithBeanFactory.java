package beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

    public static void main(String... args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("spring/xml-bean-factory.xml"));
        Oracle oracle = (Oracle) defaultListableBeanFactory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfFile());
    }
}
