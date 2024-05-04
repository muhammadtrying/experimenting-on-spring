package uz.muhammadtrying;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.muhammadtrying.beans.Product;

public class Main {
    public static void main(String[] args) {
        var container = new ClassPathXmlApplicationContext("classpath:ioc-settings.xml");
        Product bean = container.getBean(Product.class);
        bean.save();
    }
}