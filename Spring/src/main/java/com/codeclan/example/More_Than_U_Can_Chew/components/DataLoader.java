package com.codeclan.example.More_Than_U_Can_Chew.components;


import com.codeclan.example.More_Than_U_Can_Chew.models.Bakery;
import com.codeclan.example.More_Than_U_Can_Chew.models.BakeryItem;
import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import com.codeclan.example.More_Than_U_Can_Chew.models.User;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryItemRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.OrderRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BakeryRepository bakeryRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    BakeryItemRepository bakeryItemRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
                LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);

        User terry = new User("Terry Rex", "GEO2", "T@rex.com");
        userRepository.save(terry);

        BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", "something");
        bakeryItemRepository.save(croissant);

        Order order1 = new Order(pita, terry, false);
        orderRepository.save(order1);

    }
}
