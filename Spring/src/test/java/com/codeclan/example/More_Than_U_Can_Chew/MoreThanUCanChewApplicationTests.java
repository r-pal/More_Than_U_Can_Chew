package com.codeclan.example.More_Than_U_Can_Chew;

import com.codeclan.example.More_Than_U_Can_Chew.models.Bakery;
import com.codeclan.example.More_Than_U_Can_Chew.models.BakeryItem;
import com.codeclan.example.More_Than_U_Can_Chew.models.Order;
import com.codeclan.example.More_Than_U_Can_Chew.models.User;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryItemRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.BakeryRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.OrderRepository;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class MoreThanUCanChewApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	BakeryRepository bakeryRepository;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	BakeryItemRepository bakeryItemRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateAUser(){
		User terry = new User("Terry Rex", "GEO2", "T@rex.com");
		userRepository.save(terry);
		assertEquals(1, userRepository.findAll().size());
	}

	@Test
	public void canCreateABakery(){
		Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
				LocalTime.parse("18:00:00"));
		bakeryRepository.save(pita);
		assertEquals(1, bakeryRepository.findAll().size());
	}

	@Test
	public void canCreateABakeryItem(){
		Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
				LocalTime.parse("18:00:00"));
		bakeryRepository.save(pita);
		BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 78978L , pita, null);
		bakeryItemRepository.save(croissant);
		assertEquals(1, bakeryItemRepository.findAll().size());
	}




	@Test
	public void canCreateAnOrder(){
		Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com",
				LocalTime.parse("18:00:00"));
		bakeryRepository.save(pita);

		User terry = new User("Terry Rex", "GEO2", "T@rex.com");
		userRepository.save(terry);

		BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 78978L, pita, null);
		bakeryItemRepository.save(croissant);

		Order order1 = new Order(pita, terry, false);
		order1.addABakeryItemToOrder(croissant);
		orderRepository.save(order1);

		assertEquals(1, order1.getItemsOrdered().size());
	}

}
