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
        Bakery pita = new Bakery("Pain in the Ass","G23AT", "hello@painintheass.com", LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);
        Bakery bakeThat = new Bakery("Bake That","G312PS", "gary@bakethat.com", LocalTime.parse("17:30:00"));
        bakeryRepository.save(bakeThat);
        Bakery cakeMyDay = new Bakery("Cake My Day!","G23AT", "harry@cakemyday.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(cakeMyDay);
        Bakery poc = new Bakery("Piece Of Cake","G428RE", "homer@pieceofcake.com", LocalTime.parse("16:00:00"));
        bakeryRepository.save(poc);
        Bakery bb = new Bakery("Breaking Bread","G814ER", "babs@bornandbread.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(bb);
        Bakery wkyd = new Bakery("We Knead Your Dough","GEO6", "richie@kneadyourdough.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(wkyd);
        Bakery poyr = new Bakery("The Path Of Yeast Resistance","GEO7", "bill@yeastresistance.com", LocalTime.parse("18:10:00"));
        bakeryRepository.save(poyr);
        Bakery hitb = new Bakery("History In The Baking","GEO8", "james@historicbakers.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(hitb);
        Bakery aac = new Bakery("Accept All Cookies","GEO9", "choc@chipcookies.com", LocalTime.parse("17:00:00"));
        bakeryRepository.save(aac);



        User terry = new User("Terry Rex", "G428RE", "T@rex.com");
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



        BakeryItem croissant = new BakeryItem("Croissant", "gluten, lactose", 1L, 1L, 0);
        bakeryItemRepository.save(croissant);
        BakeryItem roll = new BakeryItem("Roll", "gluten", 2L, 3L, 3);
        bakeryItemRepository.save(roll);
        BakeryItem loaf = new BakeryItem("White Loaf", "gluten", 3L, 2L, 0);
        bakeryItemRepository.save(loaf);
        BakeryItem chocCake  = new BakeryItem("A slice of Chocolate Cake", "gluten", 4L, 1L, 0);
        bakeryItemRepository.save(chocCake);
        BakeryItem pain = new BakeryItem("Pain aux chocolat", "gluten", 5L, 1L, 0);
        bakeryItemRepository.save(pain);
        BakeryItem sour = new BakeryItem("Sourdough loaf", "gluten", 6L, 2L, 0);
        bakeryItemRepository.save(sour);
        BakeryItem whole = new BakeryItem("Wholemeal loaf", "gluten", 7L, 3L, 0);
        bakeryItemRepository.save(whole);
        BakeryItem cinn = new BakeryItem("Cinnamon Brioche", "gluten", 8L, 1L, 0);
        bakeryItemRepository.save(cinn);
        BakeryItem cinn2 = new BakeryItem("Cinnamon Swirl", "gluten", 9L, 2L, 0);
        bakeryItemRepository.save(cinn2);

        //1
        Image imageCroissant = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Croissant-Petr_Kratochvil.jpg/320px-Croissant-Petr_Kratochvil.jpg", "Croissant");
        imageRepository.save(imageCroissant);
        //2
        Image imageRoll = new Image("https://www.melskitchencafe.com/wp-content/uploads/french-bread-roll1.jpg", "Roll");
        imageRepository.save(imageRoll);
        //3
        Image imageWhiteLoaf = new Image("https://assets.sainsburys-groceries.co.uk/gol/6504660/1/640x640.jpg", "White Loaf");
        imageRepository.save(imageWhiteLoaf);
        //4
        Image imageChocolateCake = new Image("https://www.cookingclassy.com/wp-content/uploads/2019/10/chocolate-cake-3.jpg", "Chocolate Cake");
        imageRepository.save(imageChocolateCake);
        //5
        Image imagePainAuxChoc = new Image("https://www.bridor.com/medias/sys_master/images/images/hcb/h25/8898062188574/Pain-au-Chocolat-Savoureux-SourceHD-1200Wx1200H.png", "Pain Aux Chocolat");
        imageRepository.save(imagePainAuxChoc);
        //6
        Image imageSourdoughLoaf = new Image("https://assets.sainsburys-groceries.co.uk/gol/7972999/1/640x640.jpg", "Sourdough Loaf");
        imageRepository.save(imageSourdoughLoaf);
        //7
        Image imageWholemealLoaf = new Image("https://domesticgothess.com/wp-content/uploads/2021/05/vegan-wholemeal-sandwich-bread.jpg", "Wholemeal Loaf");
        imageRepository.save(imageWholemealLoaf);
        //8
        Image imageCinnamonBrioche = new Image("https://bakingwithbutter.com/wp-content/uploads/2021/03/brioche-cinnamon-rolls.jpg", "Cinnamon Brioche");
        imageRepository.save(imageCinnamonBrioche);
        //9
        Image imageCinnamonSwirl = new Image("https://assets.sainsburys-groceries.co.uk/gol/6543752/1/640x640.jpg", "Cinnamon Swirl");
        imageRepository.save(imageCinnamonSwirl);

        BakeryItem bagel = new BakeryItem("Plain Bagel", "gluten", 10L, 4L, 0);
        bakeryItemRepository.save(bagel);
        BakeryItem bagel2 = new BakeryItem("Cinnamon Bagel", "gluten", 11L, 5L, 0);
        bakeryItemRepository.save(bagel2);
        BakeryItem bagel3 = new BakeryItem("Everything Bagel", "gluten", 12L, 6L, 0);
        bakeryItemRepository.save(bagel3);
        BakeryItem bagel4 = new BakeryItem("Poppyseed Bagel", "gluten", 13L, 7L, 0);
        bakeryItemRepository.save(bagel4);
        BakeryItem bs = new BakeryItem("Shortbread", "gluten", 14L, 8L, 0);
        bakeryItemRepository.save(bs);
        BakeryItem dcb = new BakeryItem("Choc Brownie", "gluten", 15L, 9L, 0);
        bakeryItemRepository.save(dcb);
        BakeryItem empire = new BakeryItem("Empire Biscuit", "gluten", 16L, 10L, 0);
        bakeryItemRepository.save(empire);
        BakeryItem bakew = new BakeryItem("Bakewell Slice", "gluten", 17L, 11L, 0);
        bakeryItemRepository.save(bakew);
        BakeryItem fruits = new BakeryItem("Fruit Scone", "gluten", 18L, 12L, 0);
        bakeryItemRepository.save(fruits);
        BakeryItem plains = new BakeryItem("Plain Scone", "gluten", 19L, 13L, 0);
        bakeryItemRepository.save(plains);

        //10
        Image imageBagel = new Image("https://upload.wikimedia.org/wikipedia/commons/1/1d/Bagel-Plain-Alt.jpg", "Plain Bagel");
        imageRepository.save(imageBagel);
        //11
        Image imageCinnBagel = new Image("https://iambaker.net/wp-content/uploads/2020/05/cinn-sugar-bagel-4-1200x900.jpg", "Cinnamon Bagel");
        imageRepository.save(imageCinnBagel);
        //12
        Image imageEverythingBagel = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/20090424_Bagels_001.JPG/500px-20090424_Bagels_001.JPG", "Everything Bagel");
        imageRepository.save(imageEverythingBagel);
        //13
        Image imagePoppyseedBagel = new Image("https://ohbagel.ca/wp-content/uploads/2020/01/OhBagel-Poppy.jpg", "Poppyseed Bagel");
        imageRepository.save(imagePoppyseedBagel);
        //14
        Image imageShortbread = new Image("https://www.christinascucina.com/wp-content/uploads/2014/01/fullsizeoutput_e3eb-720x720.jpeg", "Shortbread");
        imageRepository.save(imageShortbread);
        //15
        Image imageChocBrownie = new Image("https://handletheheat.com/wp-content/uploads/2019/09/Dark-Chocolate-Brownies-SQUARE-500x500.jpg", "Choc Brownie");
        imageRepository.save(imageChocBrownie);
        //16
        Image imageEmpireBiscuit = new Image("https://www.christinascucina.com/wp-content/uploads/2019/04/fullsizeoutput_a86d-735x490.jpeg", "Empire Biscuit");
        imageRepository.save(imageEmpireBiscuit);
        //17
        Image imageBakewellSlice = new Image("https://i0.wp.com/whatcharlottebaked.com/wp-content/uploads/2018/03/P1070239.jpg?w=720", "Bakewell Slice");
        imageRepository.save(imageBakewellSlice);
        //18
        Image imageFruitScone = new Image("https://thehappyfoodie.co.uk/wp-content/uploads/2021/08/scones-splp1y4v1f_s900x0_c1573x918_l0x1227.jpg", "Fruit Scone");
        imageRepository.save(imageFruitScone);
        //19
        Image imagePlainScone = new Image("https://www.fifteenspatulas.com/wp-content/uploads/2015/08/English-Style-Scones-Fifteen-Spatulas-1-640x960.jpg", "Plain Scone");
        imageRepository.save(imagePlainScone);


//
//
//        BakeryItem lemcran = new BakeryItem("Lemon & Cranberry Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(lemcran);
//        BakeryItem mangpass = new BakeryItem("Mango & Passionfruit Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(mangpass);
//        BakeryItem carrotc = new BakeryItem("Carrot Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(carrotc);
//        BakeryItem orangec = new BakeryItem("Orange Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(orangec);
//        BakeryItem mangpass2 = new BakeryItem("Mango & Passionfruit Volcano Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(mangpass2);
//        BakeryItem darkchoc = new BakeryItem("Dark Chocolate Volcano Cake", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(darkchoc);
//        BakeryItem minilem = new BakeryItem("Mini Lemon Meringue Pie", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(minilem);
//        BakeryItem pecpie = new BakeryItem("Pecan Pie", "gluten", 123L, cakeMyDay, 0);
//        bakeryItemRepository.save(pecpie);
//
//
//
//        BakeryItem chococ = new BakeryItem("Chocolate Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(chococ);
//        BakeryItem chocar = new BakeryItem("Chocolate Caramel Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(chocar);
//        BakeryItem redvel = new BakeryItem("Red Velvet Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(redvel);
//        BakeryItem vicspo = new BakeryItem("Victoria Sponge Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(vicspo);
//        BakeryItem lemspo = new BakeryItem("Lemon Sponge Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(lemspo);
//        BakeryItem whicra = new BakeryItem("White Chocolate & Cranberry Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(whicra);
//        BakeryItem passcak = new BakeryItem("Passionfruit Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(passcak);
//        BakeryItem bancak = new BakeryItem("Banana Cake With Cream Cheese", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(bancak);
//        BakeryItem newcak = new BakeryItem("New York Cheesecake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(newcak);
//        BakeryItem choccoca = new BakeryItem("Chocolate Coconut Cake", "gluten", 123L, poc, 0);
//        bakeryItemRepository.save(choccoca);
//        BakeryItem floora = new BakeryItem("Flourless Orange Cake", "none", 123L, poc, 0);
//        bakeryItemRepository.save(floora);
//
//
//
//        BakeryItem bague = new BakeryItem("Baguette", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(bague);
//        BakeryItem brioch = new BakeryItem("Brioche", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(brioch);
//        BakeryItem chall = new BakeryItem("Challah", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(chall);
//        BakeryItem ciaba = new BakeryItem("Ciabatta", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(ciaba);
//        BakeryItem cornb = new BakeryItem("Cornbread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(cornb);
//        BakeryItem focac = new BakeryItem("Focaccia", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(focac);
//        BakeryItem multi = new BakeryItem("Multigrain", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(multi);
//        BakeryItem pitab = new BakeryItem("Pita Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(pitab);
//        BakeryItem potab = new BakeryItem("Potato Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(potab);
//        BakeryItem ryebr = new BakeryItem("Rye Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(ryebr);
//        BakeryItem sodab = new BakeryItem("Soda Bread", "gluten", 123L, bb, 0);
//        bakeryItemRepository.save(sodab);
//
//
//
//        BakeryItem whibr = new BakeryItem("White Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(whibr);
//        BakeryItem brobr = new BakeryItem("Brown Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(brobr);
//        BakeryItem vedbr = new BakeryItem("Veda Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(vedbr);
//        BakeryItem soubr = new BakeryItem("Sourdough Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(soubr);
//        BakeryItem corbr = new BakeryItem("Corn Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(corbr);
//        BakeryItem yeabr = new BakeryItem("Yeast Bread", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(yeabr);
//        BakeryItem sofro = new BakeryItem("Soft Roll", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(sofro);
//        BakeryItem morro = new BakeryItem("Morning Roll", "gluten", 123L, wkyd, 0);
//        bakeryItemRepository.save(morro);
//
//
//
//        BakeryItem savta = new BakeryItem("Savoury Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(savta);
//        BakeryItem frata = new BakeryItem("Frangipane Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(frata);
//        BakeryItem cwcak = new BakeryItem("Carrot & Walnut Cake", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(cwcak);
//        BakeryItem lemta = new BakeryItem("Lemon Meringue Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(lemta);
//        BakeryItem gfcbc = new BakeryItem("Gluten Free Chocolate Brownie Cake", "none", 123L, poyr, 0);
//        bakeryItemRepository.save(gfcbc);
//        BakeryItem chbrc = new BakeryItem("Chocolate Brownie Cake", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(chbrc);
//        BakeryItem chcrt = new BakeryItem("Chocolate Caramel Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(chcrt);
//        BakeryItem whcht = new BakeryItem("White Chocolate Tart", "gluten", 123L, poyr, 0);
//        bakeryItemRepository.save(whcht);
//
//
//
//        BakeryItem msbdb = new BakeryItem("Millionaire's Shortbread", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(msbdb);
//        BakeryItem mabak = new BakeryItem("Mars Bar Krispy", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(mabak);
//        BakeryItem cheba = new BakeryItem("Cherry Bakewell", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(cheba);
//        BakeryItem roros = new BakeryItem("Rocky Road Slice", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(roros);
//        BakeryItem biscc = new BakeryItem("Biscoff Cake", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(biscc);
//        BakeryItem sausr = new BakeryItem("Sausage Roll", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(sausr);
//        BakeryItem scotp = new BakeryItem("Scotch Pie", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(scotp);
//        BakeryItem beefp = new BakeryItem("Beef & Vegetable Pasty", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(beefp);
//        BakeryItem steas = new BakeryItem("Steak Slice", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(steas);
//        BakeryItem fscon = new BakeryItem("Fruit Scone", "gluten", 123L, hitb, 0);
//        bakeryItemRepository.save(fscon);
//
//
//
//
//        BakeryItem crbrd = new BakeryItem("Creme Brulee Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(crbrd);
//        BakeryItem chmid = new BakeryItem("Chocolate Millionaire Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(chmid);
//        BakeryItem sahor = new BakeryItem("Salted Honey Ring", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(sahor);
//        BakeryItem pihir = new BakeryItem("Pistachio & Hibiscus Ring", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(pihir);
//        BakeryItem pbjri = new BakeryItem("Peanut Butter and Jam Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(pbjri);
//        BakeryItem almoo = new BakeryItem("Almond Glaze Buttermilk 'Old Fashioned'", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(almoo);
//        BakeryItem lempd = new BakeryItem("Lemon & Poppyseed Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(lempd);
//        BakeryItem dbwcd = new BakeryItem("Double Blueberry & White Chocolate Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(dbwcd);
//        BakeryItem ffjfd = new BakeryItem("Forest Fruits Jam filled Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(ffjfd);
//        BakeryItem mvbgd = new BakeryItem("Madagascar Vanilla Bean Glaze Doughnut", "gluten", 123L, aac, 0);
//        bakeryItemRepository.save(mvbgd);









//        pita.clearAvailableItems();
//        bakeryRepository.save(pita);



//
        Order order1 = new Order(1L, 1L, false);
        orderRepository.save(order1);
        croissant.setOrderId(order1.getId());
        bakeryItemRepository.save(croissant);
        orderRepository.save(order1);
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
