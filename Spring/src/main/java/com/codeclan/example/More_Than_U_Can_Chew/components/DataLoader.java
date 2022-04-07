package com.codeclan.example.More_Than_U_Can_Chew.components;


import com.codeclan.example.More_Than_U_Can_Chew.models.*;
import com.codeclan.example.More_Than_U_Can_Chew.repositories.*;
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

    @Autowired
    ImageRepository imageRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Bakery pita = new Bakery("Pain in the Ass","GEO1", "hello@painintheass.com", LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);
        Bakery bakeThat = new Bakery("Bake That","GEO2", "gary@bakethat.com", LocalTime.parse("17:30:00"));
        bakeryRepository.save(bakeThat);
        Bakery cakeMyDay = new Bakery("Cake My Day!","GEO3", "harry@cakemyday.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(cakeMyDay);
        Bakery poc = new Bakery("Piece Of Cake","GEO4", "homer@pieceofcake.com", LocalTime.parse("16:00:00"));
        bakeryRepository.save(poc);
        Bakery bb = new Bakery("Breaking Bread","GEO5", "babs@bornandbread.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(bb);
        Bakery wkyd = new Bakery("We Knead Your Dough","GEO6", "richie@kneadyourdough.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(wkyd);
        Bakery poyr = new Bakery("The Path Of Yeast Resistance","GEO7", "bill@yeastresistance.com", LocalTime.parse("18:10:00"));
        bakeryRepository.save(poyr);
        Bakery hitb = new Bakery("History In The Baking","GEO8", "james@historicbakers.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(hitb);
        Bakery aac = new Bakery("Accept All Cookies","GEO9", "choc@chipcookies.com", LocalTime.parse("17:00:00"));
        bakeryRepository.save(aac);



        User terry = new User("Terry Rex", "GEO1", "T@rex.com");
        userRepository.save(terry);
        User jambo = new User("Jambo the Elephant", "GEO2", "G@rex.com");
        userRepository.save(jambo);
        User arnie = new User("Arnie Pye", "GEO3", "arnie@pyeinthesky.com");
        userRepository.save(arnie);
        User patty = new User("Patty Cake", "GEO4", "paddycake@gmail.com");
        userRepository.save(patty);
        User tori = new User("Tori Sponge", "GEO5", "tsponge@aol.com");
        userRepository.save(tori);
        User cara = new User("Cara Melle", "GEO6", "caramelle@hotmail.co.uk");
        userRepository.save(cara);
        User geoff = new User("Geoff Bredd", "GEO7", "geoffb@rocketmail.com");
        userRepository.save(geoff);
        User sarah = new User("Sarah Do", "GEO8", "sarahdo@yahoo.com");
        userRepository.save(sarah);
        User blondie = new User("Blondie", "GEO9", "tophits@yahoo.com");
        userRepository.save(blondie);
        User mads = new User("Madeleine Busby", "GE1O", "madeleine@gmail.com");
        userRepository.save(mads);
        User cc = new User("Cookie Crumboule", "GE11", "sweetlikechocolate@aol.com");
        userRepository.save(cc);
        User anna = new User("Anna S Foster", "GE12", "foster@me.com");
        userRepository.save(anna);
        User jule = new User("Jule Logg", "GE13", "julelogg@hotmail.com");
        userRepository.save(jule);



        BakeryItem croissant = new BakeryItem("Croissant", "flour, water, butter", "gluten, lactose", 123L, pita);
        bakeryItemRepository.save(croissant);
        BakeryItem roll = new BakeryItem("Roll", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(roll);
        BakeryItem loaf = new BakeryItem("White Loaf", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(loaf);
        BakeryItem chocCake  = new BakeryItem("A slice of Chocolate Cake", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(chocCake);
        BakeryItem pain = new BakeryItem("Pain aux chocolate", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(pain);
        BakeryItem sour = new BakeryItem("Sourdough loaf", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(sour);
        BakeryItem whole = new BakeryItem("Wholemeal loaf", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(whole);
        BakeryItem cinn = new BakeryItem("Cinnamon Brioche", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(cinn);
        BakeryItem cinn2 = new BakeryItem("Cinnamon Swirl", "flour, water", "gluten", 123L, pita);
        bakeryItemRepository.save(cinn2);


        BakeryItem bagel = new BakeryItem("Plain Bagel", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bagel);
        BakeryItem bagel2 = new BakeryItem("Cinnamon Bagel", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bagel2);
        BakeryItem bagel3 = new BakeryItem("Everything Bagel", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bagel3);
        BakeryItem bagel4 = new BakeryItem("Poppyseed Bagel", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bagel4);
        BakeryItem bs = new BakeryItem("Billionaire's Shortbread", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bs);
        BakeryItem dcb = new BakeryItem("Dark Chocolate Brownie", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(dcb);
        BakeryItem empire = new BakeryItem("Empire Biscuit", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(empire);
        BakeryItem bakew = new BakeryItem("Bakewell Slice", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(bakew);
        BakeryItem fruits = new BakeryItem("Fruit Scone", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(fruits);
        BakeryItem plains = new BakeryItem("Plain Scone", "flour, water", "gluten", 123L, bakeThat);
        bakeryItemRepository.save(plains);


        BakeryItem lemcran = new BakeryItem("Lemon & Cranberry Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(lemcran);
        BakeryItem mangpass = new BakeryItem("Mango & Passionfruit Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(mangpass);
        BakeryItem carrotc = new BakeryItem("Carrot Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(carrotc);
        BakeryItem orangec = new BakeryItem("Orange Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(orangec);
        BakeryItem mangpass2 = new BakeryItem("Mango & Passionfruit Volcano Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(mangpass2);
        BakeryItem darkchoc = new BakeryItem("Dark Chocolate Volcano Cake", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(darkchoc);
        BakeryItem minilem = new BakeryItem("Mini Lemon Meringue Pie", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(minilem);
        BakeryItem pecpie = new BakeryItem("Pecan Pie", "flour, water", "gluten", 123L, cakeMyDay);
        bakeryItemRepository.save(pecpie);



        BakeryItem chococ = new BakeryItem("Chocolate Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(chococ);
        BakeryItem chocar = new BakeryItem("Chocolate Caramel Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(chocar);
        BakeryItem redvel = new BakeryItem("Red Velvet Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(redvel);
        BakeryItem vicspo = new BakeryItem("Victoria Sponge Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(vicspo);
        BakeryItem lemspo = new BakeryItem("Lemon Sponge Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(lemspo);
        BakeryItem whicra = new BakeryItem("White Chocolate & Cranberry Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(whicra);
        BakeryItem passcak = new BakeryItem("Passionfruit Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(passcak);
        BakeryItem bancak = new BakeryItem("Banana Cake With Cream Cheese", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(bancak);
        BakeryItem newcak = new BakeryItem("New York Cheesecake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(newcak);
        BakeryItem choccoca = new BakeryItem("Chocolate Coconut Cake", "flour, water", "gluten", 123L, poc);
        bakeryItemRepository.save(choccoca);
        BakeryItem floora = new BakeryItem("Flourless Orange Cake", "water", "none", 123L, poc);
        bakeryItemRepository.save(floora);



        BakeryItem bague = new BakeryItem("Baguette", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(bague);
        BakeryItem brioch = new BakeryItem("Brioche", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(brioch);
        BakeryItem chall = new BakeryItem("Challah", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(chall);
        BakeryItem ciaba = new BakeryItem("Ciabatta", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(ciaba);
        BakeryItem cornb = new BakeryItem("Cornbread", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(cornb);
        BakeryItem focac = new BakeryItem("Focaccia", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(focac);
        BakeryItem multi = new BakeryItem("Multigrain", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(multi);
        BakeryItem pitab = new BakeryItem("Pita Bread", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(pitab);
        BakeryItem potab = new BakeryItem("Potato Bread", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(potab);
        BakeryItem ryebr = new BakeryItem("Rye Bread", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(ryebr);
        BakeryItem sodab = new BakeryItem("Soda Bread", "flour, water", "gluten", 123L, bb);
        bakeryItemRepository.save(sodab);



        BakeryItem whibr = new BakeryItem("White Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(whibr);
        BakeryItem brobr = new BakeryItem("Brown Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(brobr);
        BakeryItem vedbr = new BakeryItem("Veda Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(vedbr);
        BakeryItem soubr = new BakeryItem("Sourdough Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(soubr);
        BakeryItem corbr = new BakeryItem("Corn Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(corbr);
        BakeryItem yeabr = new BakeryItem("Yeast Bread", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(yeabr);
        BakeryItem sofro = new BakeryItem("Soft Roll", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(sofro);
        BakeryItem morro = new BakeryItem("Morning Roll", "flour, water", "gluten", 123L, wkyd);
        bakeryItemRepository.save(morro);



        BakeryItem savta = new BakeryItem("Savoury Tart", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(savta);
        BakeryItem frata = new BakeryItem("Frangipane Tart", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(frata);
        BakeryItem cwcak = new BakeryItem("Carrot & Walnut Cake", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(cwcak);
        BakeryItem lemta = new BakeryItem("Lemon Meringue Tart", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(lemta);
        BakeryItem gfcbc = new BakeryItem("Gluten Free Chocolate Brownie Cake", "water", "none", 123L, poyr);
        bakeryItemRepository.save(gfcbc);
        BakeryItem chbrc = new BakeryItem("Chocolate Brownie Cake", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(chbrc);
        BakeryItem chcrt = new BakeryItem("Chocolate Caramel Tart", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(chcrt);
        BakeryItem whcht = new BakeryItem("White Chocolate Tart", "flour, water", "gluten", 123L, poyr);
        bakeryItemRepository.save(whcht);



        BakeryItem msbdb = new BakeryItem("Millionaire's Shortbread", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(msbdb);
        BakeryItem mabak = new BakeryItem("Mars Bar Krispy", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(mabak);
        BakeryItem cheba = new BakeryItem("Cherry Bakewell", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(cheba);
        BakeryItem roros = new BakeryItem("Rocky Road Slice", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(roros);
        BakeryItem biscc = new BakeryItem("Biscoff Cake", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(biscc);
        BakeryItem sausr = new BakeryItem("Sausage Roll", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(sausr);
        BakeryItem scotp = new BakeryItem("Scotch Pie", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(scotp);
        BakeryItem beefp = new BakeryItem("Beef & Vegetable Pasty", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(beefp);
        BakeryItem steas = new BakeryItem("Steak Slice", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(steas);
        BakeryItem fscon = new BakeryItem("Fruit Scone", "flour, water", "gluten", 123L, hitb);
        bakeryItemRepository.save(fscon);




        BakeryItem crbrd = new BakeryItem("Creme Brulee Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(crbrd);
        BakeryItem chmid = new BakeryItem("Chocolate Millionaire Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(chmid);
        BakeryItem sahor = new BakeryItem("Salted Honey Ring", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(sahor);
        BakeryItem pihir = new BakeryItem("Pistachio & Hibiscus Ring", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(pihir);
        BakeryItem pbjri = new BakeryItem("Peanut Butter and Jam Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(pbjri);
        BakeryItem almoo = new BakeryItem("Almond Glaze Buttermilk 'Old Fashioned'", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(almoo);
        BakeryItem lempd = new BakeryItem("Lemon & Poppyseed Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(lempd);
        BakeryItem dbwcd = new BakeryItem("Double Blueberry & White Chocolate Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(dbwcd);
        BakeryItem ffjfd = new BakeryItem("Forest Fruits Jam filled Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(ffjfd);
        BakeryItem mvbgd = new BakeryItem("Madagascar Vanilla Bean Glaze Doughnut", "flour, water", "gluten", 123L, aac);
        bakeryItemRepository.save(mvbgd);


        Image image1 = new Image("string");
        imageRepository.save(image1);


//
//        Order order1 = new Order(pita, terry, false);
//        orderRepository.save(order1);
//        order1.addABakeryItemToOrder(croissant);
//        croissant.setOrder(order1);
//        bakeryItemRepository.save(croissant);
//        orderRepository.save(order1);
//
//
//        Order order2 = new Order(pita, jambo, false);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(roll);
//        orderRepository.save(order2);
//        order2.addABakeryItemToOrder(croissant);
//        orderRepository.save(order2);




    }
}
