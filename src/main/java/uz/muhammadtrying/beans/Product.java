package uz.muhammadtrying.beans;

import org.springframework.stereotype.Component;

@Component
public class Product {
    public void save() {
        System.out.println("saving product...");
    }
}
