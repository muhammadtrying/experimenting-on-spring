package uz.muhammadtrying.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.muhammadtrying.beans.Product;

@Configuration
public class MyConfig {
    @Bean
    public Product product() {
        return new Product();
    }
}
