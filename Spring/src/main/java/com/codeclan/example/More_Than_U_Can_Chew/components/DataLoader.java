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
//        Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
//                LocalTime.parse("18:00:00"));
//        bakeryRepository.save(pita);
//
//        User terry = new User("Terry Rex", "GEO2", "T@rex.com");
//        userRepository.save(terry);
//
//        User jambo = new User("Jambo the Elephant", "GEO3", "G@rex.com");
//        userRepository.save(jambo);
//
//        BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 7987897979L, pita, null);
//        bakeryItemRepository.save(croissant);
//
//        BakeryItem roll = new BakeryItem("Roll", "flour, water", "gluten", 798797979L, pita, null);
//        bakeryItemRepository.save(roll);
//
//        Order order1 = new Order(pita, terry, false);
//        orderRepository.save(order1);
//        order1.addABakeryItemToOrder(croissant);
//        orderRepository.save(order1);
//
//
//        Order order2 = new Order(pita, jambo, false);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(roll);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(croissant);
//        orderRepository.save(order2);

        Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
                LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);

        User terry = new User("Terry Rex", "GEO2", "T@rex.com");
        userRepository.save(terry);

        BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 78978L, pita);
        bakeryItemRepository.save(croissant);

        BakeryItem croissant2 = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 78978L, pita);
        bakeryItemRepository.save(croissant2);

        Order order1 = new Order(pita, terry, false);
        orderRepository.save(order1);

        croissant.setOrder(order1);
        bakeryItemRepository.save(croissant);

        croissant2.setOrder(order1);
        bakeryItemRepository.save(croissant2);

//        order1.addABakeryItemToOrder(croissant);
//        order1.addABakeryItemToOrder(croissant2);
//
//
//
//        orderRepository.save(order1);





    }
}
