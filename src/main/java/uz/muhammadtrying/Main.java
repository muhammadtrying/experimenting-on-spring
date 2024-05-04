package uz.muhammadtrying;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.muhammadtrying.beans.Product;
import uz.muhammadtrying.config.MyConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfig.class);
        Product bean = context.getBean(Product.class);
        bean.save();
        context.close();
    }
}