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
        Bakery hitb = new Bakery("History In The Baking","G25QD", "james@historicbakers.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(hitb);
        Bakery cakeMyDay = new Bakery("Cake My Day!","G22EH", "harry@cakemyday.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(cakeMyDay);
        Bakery aac = new Bakery("Accept All Cookies","G24NJ", "choc@chipcookies.com", LocalTime.parse("17:00:00"));
        bakeryRepository.save(aac);
        Bakery pita = new Bakery("Pain in the Ass","G23AT", "hello@painintheass.com", LocalTime.parse("18:00:00"));
        bakeryRepository.save(pita);
        Bakery bb = new Bakery("Breaking Bread","G12JZ", "babs@bornandbread.com", LocalTime.parse("17:45:00"));
        bakeryRepository.save(bb);
        Bakery bakeThat = new Bakery("Bake That","G28HZ", "gary@bakethat.com", LocalTime.parse("17:30:00"));
        bakeryRepository.save(bakeThat);
        Bakery wkyd = new Bakery("We Knead Your Dough","G13HA", "richie@kneadyourdough.com", LocalTime.parse("18:30:00"));
        bakeryRepository.save(wkyd);
        Bakery poyr = new Bakery("The Path Of Yeast Resistance","G14AW", "bill@yeastresistance.com", LocalTime.parse("18:10:00"));
        bakeryRepository.save(poyr);
        Bakery poc = new Bakery("Piece Of Cake","G11JG", "homer@pieceofcake.com", LocalTime.parse("16:00:00"));
        bakeryRepository.save(poc);



        User terry = new User("Terry Rex", "G24QY", "T@rex.com");
        userRepository.save(terry);
        User jambo = new User("Jambo the Elephant", "G24QY", "G@rex.com");
        userRepository.save(jambo);
        User arnie = new User("Arnie Pye", "G24QY", "arnie@pyeinthesky.com");
        userRepository.save(arnie);
        User patty = new User("Patty Cake", "G24QY", "paddycake@gmail.com");
        userRepository.save(patty);
        User tori = new User("Tori Sponge", "G24QY", "tsponge@aol.com");
        userRepository.save(tori);
        User cara = new User("Cara Melle", "G24QY", "caramelle@hotmail.co.uk");
        userRepository.save(cara);
        User geoff = new User("Geoff Bredd", "G24QY", "geoffb@rocketmail.com");
        userRepository.save(geoff);
        User sarah = new User("Sarah Do", "G24QY", "sarahdo@yahoo.com");
        userRepository.save(sarah);
        User blondie = new User("Blondie", "G24QY", "tophits@yahoo.com");
        userRepository.save(blondie);
        User mads = new User("Madeleine Busby", "G24QY", "madeleine@gmail.com");
        userRepository.save(mads);
        User cc = new User("Cookie Crumboule", "G24QY", "sweetlikechocolate@aol.com");
        userRepository.save(cc);
        User anna = new User("Anna S Foster", "G24QY", "foster@me.com");
        userRepository.save(anna);
        User jule = new User("Jule Logg", "G24QY", "julelogg@hotmail.com");
        userRepository.save(jule);



        BakeryItem croissant = new BakeryItem("Croissant", "gluten, lactose", 1L, 4L, 0);
        bakeryItemRepository.save(croissant);
        BakeryItem roll = new BakeryItem("Roll", "gluten", 2L, 4L, 3);
        bakeryItemRepository.save(roll);
        BakeryItem loaf = new BakeryItem("White Loaf", "gluten", 3L, 4L, 0);
        bakeryItemRepository.save(loaf);
        BakeryItem chocCake  = new BakeryItem("A slice of Chocolate Cake", "gluten", 4L, 4L, 0);
        bakeryItemRepository.save(chocCake);
        BakeryItem pain = new BakeryItem("Pain aux chocolat", "gluten", 5L, 4L, 0);
        bakeryItemRepository.save(pain);
        BakeryItem sour = new BakeryItem("Sourdough loaf", "gluten", 6L, 4L, 0);
        bakeryItemRepository.save(sour);
        BakeryItem whole = new BakeryItem("Wholemeal loaf", "gluten", 7L, 4L, 0);
        bakeryItemRepository.save(whole);
        BakeryItem cinn = new BakeryItem("Cinnamon Brioche", "gluten", 8L, 4L, 0);
        bakeryItemRepository.save(cinn);
        BakeryItem cinn2 = new BakeryItem("Cinnamon Swirl", "gluten", 9L, 4L, 0);
        bakeryItemRepository.save(cinn2);


        BakeryItem bagel = new BakeryItem("Plain Bagel", "gluten", 10L, 6L, 0);
        bakeryItemRepository.save(bagel);
        BakeryItem bagel2 = new BakeryItem("Cinnamon Bagel", "gluten", 11L, 6L, 0);
        bakeryItemRepository.save(bagel2);
        BakeryItem bagel3 = new BakeryItem("Everything Bagel", "gluten", 12L, 6L, 0);
        bakeryItemRepository.save(bagel3);
        BakeryItem bagel4 = new BakeryItem("Poppyseed Bagel", "gluten", 13L, 6L, 0);
        bakeryItemRepository.save(bagel4);
        BakeryItem bs = new BakeryItem("Billionaire's Shortbread", "gluten", 14L, 6L, 0);
        bakeryItemRepository.save(bs);
        BakeryItem dcb = new BakeryItem("Dark Chocolate Brownie", "gluten", 15L, 6L, 0);
        bakeryItemRepository.save(dcb);
        BakeryItem empire = new BakeryItem("Empire Biscuit", "gluten", 16L, 6L, 0);
        bakeryItemRepository.save(empire);
        BakeryItem bakew = new BakeryItem("Bakewell Slice", "gluten", 17L, 6L, 0);
        bakeryItemRepository.save(bakew);
        BakeryItem fruits = new BakeryItem("Fruit Scone", "gluten", 18L, 6L, 0);
        bakeryItemRepository.save(fruits);
        BakeryItem plains = new BakeryItem("Plain Scone", "gluten", 19L, 6L, 0);
        bakeryItemRepository.save(plains);
//
//
        BakeryItem lemcran = new BakeryItem("Lemon & Cranberry Cake", "gluten", 20L, 2L, 0);
        bakeryItemRepository.save(lemcran);
        BakeryItem mangpass = new BakeryItem("Mango & Passionfruit Cake", "gluten", 21L, 2L, 0);
        bakeryItemRepository.save(mangpass);
        BakeryItem carrotc = new BakeryItem("Carrot Cake", "gluten", 22L, 2L, 0);
        bakeryItemRepository.save(carrotc);
        BakeryItem orangec = new BakeryItem("Orange Cake", "gluten", 23L, 2L, 0);
        bakeryItemRepository.save(orangec);
        BakeryItem mangpass2 = new BakeryItem("Mango & Passionfruit Volcano Cake", "gluten", 24L, 2L, 0);
        bakeryItemRepository.save(mangpass2);
        BakeryItem darkchoc = new BakeryItem("Dark Chocolate Volcano Cake", "gluten", 25L, 2L, 0);
        bakeryItemRepository.save(darkchoc);
        BakeryItem minilem = new BakeryItem("Mini Lemon Meringue Pie", "gluten", 26L, 2L, 0);
        bakeryItemRepository.save(minilem);
        BakeryItem pecpie = new BakeryItem("Pecan Pie", "gluten", 27L, 2L, 0);
        bakeryItemRepository.save(pecpie);
//
//
//
        BakeryItem chococ = new BakeryItem("Chocolate Cake", "gluten", 28L, 9L, 0);
        bakeryItemRepository.save(chococ);
        BakeryItem chocar = new BakeryItem("Chocolate Caramel Cake", "gluten", 29L, 9L, 0);
        bakeryItemRepository.save(chocar);
        BakeryItem redvel = new BakeryItem("Red Velvet Cake", "gluten", 30L, 9L, 0);
        bakeryItemRepository.save(redvel);
        BakeryItem vicspo = new BakeryItem("Victoria Sponge Cake", "gluten", 31L, 9L, 0);
        bakeryItemRepository.save(vicspo);
        BakeryItem lemspo = new BakeryItem("Lemon Sponge Cake", "gluten", 32L, 9L, 0);
        bakeryItemRepository.save(lemspo);
        BakeryItem whicra = new BakeryItem("White Chocolate & Cranberry Cake", "gluten", 33L, 9L, 0);
        bakeryItemRepository.save(whicra);
        BakeryItem passcak = new BakeryItem("Passionfruit Cake", "gluten", 34L, 9L, 0);
        bakeryItemRepository.save(passcak);
        BakeryItem bancak = new BakeryItem("Banana Cake With Cream Cheese", "gluten", 35L, 9L, 0);
        bakeryItemRepository.save(bancak);
        BakeryItem newcak = new BakeryItem("New York Cheesecake", "gluten", 36L, 9L, 0);
        bakeryItemRepository.save(newcak);
        BakeryItem choccoca = new BakeryItem("Chocolate Coconut Cake", "gluten", 37L, 9L, 0);
        bakeryItemRepository.save(choccoca);
        BakeryItem floora = new BakeryItem("Flourless Orange Cake", "none", 38L, 9L, 0);
        bakeryItemRepository.save(floora);
//
//
//
        BakeryItem bague = new BakeryItem("Baguette", "gluten", 39L, 1L, 0);
        bakeryItemRepository.save(bague);
        BakeryItem brioch = new BakeryItem("Brioche", "gluten", 40L, 1L, 0);
        bakeryItemRepository.save(brioch);
        BakeryItem chall = new BakeryItem("Challah", "gluten", 41L, 1L, 0);
        bakeryItemRepository.save(chall);
        BakeryItem ciaba = new BakeryItem("Ciabatta", "gluten", 42L, 1L, 0);
        bakeryItemRepository.save(ciaba);
        BakeryItem cornb = new BakeryItem("Cornbread", "gluten", 43L, 1L, 0);
        bakeryItemRepository.save(cornb);
        BakeryItem focac = new BakeryItem("Focaccia", "gluten", 44L, 1L, 0);
        bakeryItemRepository.save(focac);
        BakeryItem multi = new BakeryItem("Multigrain", "gluten", 45L, 1L, 0);
        bakeryItemRepository.save(multi);
        BakeryItem pitab = new BakeryItem("Pita Bread", "gluten", 46L, 1L, 0);
        bakeryItemRepository.save(pitab);
        BakeryItem potab = new BakeryItem("Potato Bread", "gluten", 47L, 1L, 0);
        bakeryItemRepository.save(potab);
        BakeryItem ryebr = new BakeryItem("Rye Bread", "gluten", 48L, 1L, 0);
        bakeryItemRepository.save(ryebr);
        BakeryItem sodab = new BakeryItem("Soda Bread", "gluten", 49L, 1L, 0);
        bakeryItemRepository.save(sodab);
//
//
        BakeryItem whibr = new BakeryItem("White Bread", "gluten", 50L, 5L, 0);
        bakeryItemRepository.save(whibr);
        BakeryItem brobr = new BakeryItem("Brown Bread", "gluten", 51L, 5L, 0);
        bakeryItemRepository.save(brobr);
        BakeryItem vedbr = new BakeryItem("Veda Bread", "gluten", 52L, 5L, 0);
        bakeryItemRepository.save(vedbr);
        BakeryItem soubr = new BakeryItem("Sourdough Bread", "gluten", 53L, 5L, 0);
        bakeryItemRepository.save(soubr);
        BakeryItem corbr = new BakeryItem("Corn Bread", "gluten", 54L, 5L, 0);
        bakeryItemRepository.save(corbr);
        BakeryItem yeabr = new BakeryItem("Yeast Bread", "gluten", 55L, 5L, 0);
        bakeryItemRepository.save(yeabr);
        BakeryItem sofro = new BakeryItem("Soft Roll", "gluten", 56L, 5L, 0);
        bakeryItemRepository.save(sofro);
        BakeryItem morro = new BakeryItem("Morning Roll", "gluten", 57L, 5L, 0);
        bakeryItemRepository.save(morro);
//
//
//
        BakeryItem savta = new BakeryItem("Savoury Tart", "gluten", 58L, 8L, 0);
        bakeryItemRepository.save(savta);
        BakeryItem frata = new BakeryItem("Frangipane Tart", "gluten", 59L, 8L, 0);
        bakeryItemRepository.save(frata);
        BakeryItem cwcak = new BakeryItem("Carrot & Walnut Cake", "gluten", 60L, 8L, 0);
        bakeryItemRepository.save(cwcak);
        BakeryItem lemta = new BakeryItem("Lemon Meringue Tart", "gluten", 61L, 8L, 0);
        bakeryItemRepository.save(lemta);
        BakeryItem gfcbc = new BakeryItem("Gluten Free Chocolate Brownie Cake", "none", 62L, 8L, 0);
        bakeryItemRepository.save(gfcbc);
        BakeryItem chbrc = new BakeryItem("Chocolate Brownie Cake", "gluten", 63L, 8L, 0);
        bakeryItemRepository.save(chbrc);
        BakeryItem chcrt = new BakeryItem("Chocolate Caramel Tart", "gluten", 64L, 8L, 0);
        bakeryItemRepository.save(chcrt);
        BakeryItem whcht = new BakeryItem("White Chocolate Tart", "gluten", 65L, 8L, 0);
        bakeryItemRepository.save(whcht);
//
//
//
        BakeryItem msbdb = new BakeryItem("Millionaire's Shortbread", "gluten", 66L, 7L, 0);
        bakeryItemRepository.save(msbdb);
        BakeryItem mabak = new BakeryItem("Mars Bar Krispy", "gluten", 67L, 7L, 0);
        bakeryItemRepository.save(mabak);
        BakeryItem cheba = new BakeryItem("Cherry Bakewell", "gluten", 68L, 7L, 0);
        bakeryItemRepository.save(cheba);
        BakeryItem roros = new BakeryItem("Rocky Road Slice", "gluten", 69L, 7L, 0);
        bakeryItemRepository.save(roros);
        BakeryItem biscc = new BakeryItem("Biscoff Cake", "gluten", 70L, 7L, 0);
        bakeryItemRepository.save(biscc);
        BakeryItem sausr = new BakeryItem("Sausage Roll", "gluten", 71L, 7L, 0);
        bakeryItemRepository.save(sausr);
        BakeryItem scotp = new BakeryItem("Scotch Pie", "gluten", 72L, 7L, 0);
        bakeryItemRepository.save(scotp);
        BakeryItem beefp = new BakeryItem("Beef & Vegetable Pasty", "gluten", 73L, 7L, 0);
        bakeryItemRepository.save(beefp);
        BakeryItem steas = new BakeryItem("Steak Slice", "gluten", 74L, 7L, 0);
        bakeryItemRepository.save(steas);
//
//
//
        BakeryItem crbrd = new BakeryItem("Creme Brulee Doughnut", "gluten", 75L, 3L, 0);
        bakeryItemRepository.save(crbrd);
        BakeryItem chmid = new BakeryItem("Chocolate Millionaire Doughnut", "gluten", 76L, 3L, 0);
        bakeryItemRepository.save(chmid);
        BakeryItem sahor = new BakeryItem("Salted Honey Ring", "gluten", 77L, 3L, 0);
        bakeryItemRepository.save(sahor);
        BakeryItem pihir = new BakeryItem("Pistachio & Hibiscus Ring", "gluten", 78L, 3L, 0);
        bakeryItemRepository.save(pihir);
        BakeryItem pbjri = new BakeryItem("Peanut Butter and Jam Doughnut", "gluten", 79L, 3L, 0);
        bakeryItemRepository.save(pbjri);
        BakeryItem almoo = new BakeryItem("Almond Glaze Buttermilk 'Old Fashioned'", "gluten", 80L, 3L, 0);
        bakeryItemRepository.save(almoo);
        BakeryItem lempd = new BakeryItem("Lemon & Poppyseed Doughnut", "gluten", 81L, 3L, 0);
        bakeryItemRepository.save(lempd);
        BakeryItem dbwcd = new BakeryItem("Double Blueberry & White Chocolate Doughnut", "gluten", 82L, 3L, 0);
        bakeryItemRepository.save(dbwcd);
        BakeryItem ffjfd = new BakeryItem("Forest Fruits Jam filled Doughnut", "gluten", 83L, 3L, 0);
        bakeryItemRepository.save(ffjfd);
        BakeryItem mvbgd = new BakeryItem("Madagascar Vanilla Bean Glaze Doughnut", "gluten", 84L, 3L, 0);
        bakeryItemRepository.save(mvbgd);



        Image imageCroissant = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Croissant-Petr_Kratochvil.jpg/320px-Croissant-Petr_Kratochvil.jpg", "Croissant");
        imageRepository.save(imageCroissant);
        Image imageRoll = new Image("https://i2-prod.glasgowlive.co.uk/incoming/article20880009.ece/ALTERNATES/s810/0_image2-4.png", "Roll");
        imageRepository.save(imageRoll);
        Image imageWhiteLoaf = new Image("https://assets.sainsburys-groceries.co.uk/gol/6504660/1/640x640.jpg", "White Loaf");
        imageRepository.save(imageWhiteLoaf);
        Image imageChocolateCake = new Image("https://www.cookingclassy.com/wp-content/uploads/2019/10/chocolate-cake-3.jpg", "Chocolate Cake");
        imageRepository.save(imageChocolateCake);
        Image imagePainAuxChoc = new Image("https://www.bridor.com/medias/sys_master/images/images/hcb/h25/8898062188574/Pain-au-Chocolat-Savoureux-SourceHD-1200Wx1200H.png", "Pain aux Chocolat");
        imageRepository.save(imagePainAuxChoc);
        Image imageSourdoughLoaf = new Image("https://assets.sainsburys-groceries.co.uk/gol/7972999/1/640x640.jpg", "Sourdough Loaf");
        imageRepository.save(imageSourdoughLoaf);
        Image imageWholemealLoaf = new Image("https://www.deliaonline.com/sites/default/files/quick_media/cs-quick-wholemeal-loaf.jpg", "Wholemeal Loaf");
        imageRepository.save(imageWholemealLoaf);
        Image imageCinnamonBrioche = new Image("https://bakingwithbutter.com/wp-content/uploads/2021/03/brioche-cinnamon-rolls.jpg", "Cinnamon Brioche");
        imageRepository.save(imageCinnamonBrioche);
        Image imageCinnamonSwirl = new Image("https://assets.sainsburys-groceries.co.uk/gol/6543752/1/640x640.jpg", "Cinnamon Swirl");
        imageRepository.save(imageCinnamonSwirl);

        Image imagePlainBagel = new Image("https://upload.wikimedia.org/wikipedia/commons/1/1d/Bagel-Plain-Alt.jpg", "Plain Bagel");
        imageRepository.save(imagePlainBagel);
        Image imageCinnamonBagel = new Image("https://iambaker.net/wp-content/uploads/2020/05/cinn-sugar-bagel-4-1200x900.jpg", "Cinnamon Bagel");
        imageRepository.save(imageCinnamonBagel);
        Image imageEverythingBagel = new Image("https://cdn.shopify.com/s/files/1/0148/1945/9126/articles/Malik_Bagel_720x.jpg?v=1611356339", "Everything Bagel");
        imageRepository.save(imageEverythingBagel);
        Image imagePoppyseedBagel = new Image("https://media.istockphoto.com/photos/poppy-seeds-organic-bagel-picture-id667667812?k=20&m=667667812&s=612x612&w=0&h=43utOJhwznY-kfR_9pIGBpXWGYWr_Ftt8T1fpoLDxzE=", "Poppyseed Bagel");
        imageRepository.save(imagePoppyseedBagel);
        Image imageBillionairesShortbread = new Image("https://kitchenmason.com/wp-content/uploads/2020/06/Easy-Millionaire-Shortbread-Recipe-SQUARE1.jpg", "Billionaire's Shortbread");
        imageRepository.save(imageBillionairesShortbread);
        Image imageDarkChocolateBrownie = new Image("https://handletheheat.com/wp-content/uploads/2019/09/Dark-Chocolate-Brownies-SQUARE-500x500.jpg", "Dark Chocolate Brownie");
        imageRepository.save(imageDarkChocolateBrownie);
        Image imageEmpireBiscuit = new Image("https://d2n5dv5fcchjs7.cloudfront.net/wp-content/uploads/2010/04/empire-biscuit.jpg", "Empire Biscuit");
        imageRepository.save(imageEmpireBiscuit);
        Image imageBakewellSlice = new Image("https://www.deliciousmagazine.co.uk/wp-content/uploads/2018/09/320959-1-eng-GB_4433.jpg", "Bakewell Slice");
        imageRepository.save(imageBakewellSlice);
        Image imageFruitScone = new Image("https://sp-ao.shortpixel.ai/client/to_webp,q_lossy,ret_img,w_1000,h_1500/https://www.amytreasure.com/wp-content/uploads/2019/11/Fruit-Scone-close-up-portrait-1000x1500.jpg", "Fruit Scone");
        imageRepository.save(imageFruitScone);
        Image imagePlainScone = new Image("https://www.wandercooks.com/wp-content/uploads/2021/04/grandmas-plain-scones-recipe-2.jpg", "Plain Scone");
        imageRepository.save(imagePlainScone);

        Image imageLemonCranberryCake = new Image("https://sugarspiceslife.com/wp-content/uploads/2019/02/Lemon-Cranberry-Cake-500x500.jpg", "Lemon & Cranberry Cake");
        imageRepository.save(imageLemonCranberryCake);
        Image imageMangoPassionfruitCake = new Image("https://whereiscake.com/media/nqiggyxt/cakeberry_33-27022021-1.jpg?width=800&height=800&mode=crop&bgcolor=ffffff", "Mango & Passionfruit Cake");
        imageRepository.save(imageMangoPassionfruitCake);
        Image imageCarrotCake = new Image("https://i0.wp.com/www.livewellbakeoften.com/wp-content/uploads/2017/04/Carrot-Cake-with-Cream-Cheese-Frosting-3-copy.jpg?fit=1360%2C1360&ssl=1", "Carrot Cake");
        imageRepository.save(imageCarrotCake);
        Image imageOrangeCake = new Image("https://www.christinascucina.com/wp-content/uploads/2017/02/IMG_4591.jpg", "Orange Cake");
        imageRepository.save(imageOrangeCake);
        Image imageMangoPassionfruitVolcanoCake = new Image("https://i.pinimg.com/600x315/f7/c1/fc/f7c1fcd30650abc005295ca9fc50290e.jpg", "Mango & Passionfruit Volcano Cake");
        imageRepository.save(imageMangoPassionfruitVolcanoCake);
        Image imageDarkChocolateVolcanoCake = new Image("http://assets.kraftfoods.com/recipe_images/opendeploy/Dark_Molten_Chocolate_Cakes_640x428.jpg", "Dark Chocolate Volcano Cake");
        imageRepository.save(imageDarkChocolateVolcanoCake);
        Image imageMiniLemonMeringuePie = new Image("https://www.eatwell101.com/wp-content/uploads/2014/03/Lemon-Meringue-Pie-.jpg", "Mini Lemon Meringue Pie");
        imageRepository.save(imageMiniLemonMeringuePie);
        Image imagePecanPie = new Image("https://littlesunnykitchen.com/wp-content/uploads/2021/07/Pecan-Pie-Recipe-1.jpg", "Pecan Pie");
        imageRepository.save(imagePecanPie);

        Image imageChocolateCake2 = new Image("https://www.cookingclassy.com/wp-content/uploads/2019/10/chocolate-cake-3.jpg", "Chocolate Cake");
        imageRepository.save(imageChocolateCake2);
        Image imageChocolateCaramelCake = new Image("https://thebigmansworld.com/wp-content/uploads/2020/09/chocolate-caramel-cake-6.jpg", "Chocolate Caramel Cake");
        imageRepository.save(imageChocolateCaramelCake);
        Image imageRedVelvetCake = new Image("https://handletheheat.com/wp-content/uploads/2013/04/red-velvet-cake-recipe-SQUARE-500x500.jpg", "Red Velvet Cake");
        imageRepository.save(imageRedVelvetCake);
        Image imageVictoriaSpongeCake = new Image("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-1001468_10-81b47f5.jpg", "Victoria Sponge Cake");
        imageRepository.save(imageVictoriaSpongeCake);
        Image imageLemonSpongeCake = new Image("https://www.errenskitchen.com/wp-content/uploads/2020/05/Strawberry-Lemon-Cake-2-2.jpg", "Lemon Sponge Cake");
        imageRepository.save(imageLemonSpongeCake);
        Image imageWhiteChocolateCranberryCake = new Image("https://bakerbynature.com/wp-content/uploads/2017/12/CranberryBundtCake711-1-of-1.jpg", "White Chocolate & Cranberry Cake");
        imageRepository.save(imageWhiteChocolateCranberryCake);
        Image imagePassionfruitCake = new Image("https://www.rainbownourishments.com/wp-content/uploads/2021/07/vegan-passionfruit-cake-1.jpg", "Passionfruit Cake");
        imageRepository.save(imagePassionfruitCake);
        Image imageBananaCake = new Image("https://www.cookingclassy.com/wp-content/uploads/2013/05/banana-cake-11.jpg", "Banana Cake With Cream Cheese");
        imageRepository.save(imageBananaCake);
        Image imageNewYorkCheesecake = new Image("https://www.onceuponachef.com/images/2017/12/cheesecake.jpg", "New York Cheesecake");
        imageRepository.save(imageNewYorkCheesecake);
        Image imageChocolateCoconutCake = new Image("https://www.lifeloveandsugar.com/wp-content/uploads/2014/09/Coconut_Chocolate_Cake6.jpg", "Chocolate Coconut Cake");
        imageRepository.save(imageChocolateCoconutCake);
        Image imageFlourlessOrangeCake = new Image("https://www.recipetineats.com/wp-content/uploads/2020/10/Flourless-Orange-Cake_3.jpg", "Flourless Orange Cake");
        imageRepository.save(imageFlourlessOrangeCake);

        Image imageBaguette = new Image("https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/B10F0941-3518-440D-A69F-72EFF5F7826B/Derivates/D5691ACE-1B10-42D8-8364-11402524A36D.jpg", "Baguette");
        imageRepository.save(imageBaguette);
        Image imageBrioche = new Image("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/brioche-597b5f8.jpg", "Brioche");
        imageRepository.save(imageBrioche);
        Image imageChallah = new Image("https://houseofnasheats.com/wp-content/uploads/2020/08/challah-bread-4.jpg", "Challah");
        imageRepository.save(imageChallah);
        Image imageCiabatta = new Image("https://www.biggerbolderbaking.com/wp-content/uploads/2021/01/BBB11142011840-500x500.jpg", "Ciabatta");
        imageRepository.save(imageCiabatta);
        Image imageCornbread = new Image("https://www.blessthismessplease.com/wp-content/uploads/2018/03/cornbread-recipe-1-of-1-225x225.jpg", "Cornbread");
        imageRepository.save(imageCornbread);
        Image imageFocaccia = new Image("https://images.immediate.co.uk/production/volatile/sites/30/2020/08/focaccia-f599171.jpg?quality=90&resize=440,400", "Focaccia");
        imageRepository.save(imageFocaccia);
        Image imageMultigrain = new Image("https://static.toiimg.com/thumb/76626392.cms?width=1200&height=900", "Multigrain");
        imageRepository.save(imageMultigrain);
        Image imagePitaBread = new Image("https://1.bp.blogspot.com/-pLNNR3RLYW8/XpyBchIkTLI/AAAAAAAALSk/ViXch65lOOAYRXAJ1StKT-DP__XYkqZxQCLcBGAsYHQ/s1600/wooden%2Bbowl%2Bwith%2Bhomemade%2Bpita%2Bbread.jpg", "Pita Bread");
        imageRepository.save(imagePitaBread);
        Image imagePotatoBread = new Image("https://www.tastesoflizzyt.com/wp-content/uploads/2017/10/potato-bread-recipe-3-500x500.jpg", "Potato Bread");
        imageRepository.save(imagePotatoBread);
        Image imageRyeBread = new Image("https://bakerpedia.com/wp-content/uploads/2019/01/Rye-Bread_baking-processes-e1548112768873.jpg", "Rye Bread");
        imageRepository.save(imageRyeBread);
        Image imageSodaBread = new Image("https://upload.wikimedia.org/wikipedia/commons/2/29/Ben_W_Bell_Soda_Bread_Farl_05_June_2007.jpg", "Soda Bread");
        imageRepository.save(imageSodaBread);

        Image imageWhiteBread = new Image("https://www.jocooks.com/wp-content/uploads/2020/03/white-bread-1.jpg", "White Bread");
        imageRepository.save(imageWhiteBread);
        Image imageBrownBread = new Image("https://www.jessicagavin.com/wp-content/uploads/2020/04/whole-wheat-bread-21-1200.jpg", "Brown Bread");
        imageRepository.save(imageBrownBread);
        Image imageVedaBread = new Image("https://t3.ftcdn.net/jpg/02/32/65/52/360_F_232655216_Z8X3sX1RBS1GpBAxM5ERRoeiTfcojB59.jpg", "Veda Bread");
        imageRepository.save(imageVedaBread);
        Image imageSourdoughyBread = new Image("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sourdough-bread-horizontal-466-1548048509.jpg?crop=1.00xw:0.754xh;0,0.207xh&resize=1200:*", "Sourdough Bread");
        imageRepository.save(imageSourdoughyBread);
        Image imageCornBread = new Image("https://www.inspiredtaste.net/wp-content/uploads/2021/10/Cornbread-Recipe-4-1200.jpg", "Corn Bread");
        imageRepository.save(imageCornBread);
        Image imageYeastBread = new Image("https://gatherforbread.com/wp-content/uploads/2015/08/Easiest-Yeast-Bread.jpg", "Yeast Bread");
        imageRepository.save(imageYeastBread);
        Image imageSoftRoll = new Image("https://www.munatycooking.com/wp-content/uploads/2014/04/dinner-rolls-4.jpg", "Soft Roll");
        imageRepository.save(imageSoftRoll);
        Image imageMorningRoll = new Image("https://digitalcontent.api.tesco.com/v2/media/ghs/5c3a7e55-a39f-4557-b3e7-d49345625854/snapshotimagehandler_1576078324.jpeg?h=540&w=540", "Morning Roll");
        imageRepository.save(imageMorningRoll);

        Image imageSavouryTart = new Image("https://www.deliciousmagazine.co.uk/wp-content/uploads/2019/08/crab-tarts-768x960.jpg", "Savoury Tart");
        imageRepository.save(imageSavouryTart);
        Image imageFrangipaneTart = new Image("https://realfood.tesco.com/media/images/blueberry-frangipane-tarts-HERO-2eb36fe8-45f1-4fd7-be36-655893bbcc00-0-472x310.jpg", "Frangipane Tart");
        imageRepository.save(imageFrangipaneTart);
        Image imageCarrotWalnutCake = new Image("https://www.inspiredtaste.net/wp-content/uploads/2017/07/Carrot-Cake-Recipe-5-1200.jpg", "Carrot & Walnut Cake");
        imageRepository.save(imageCarrotWalnutCake);
        Image imageLemonyMeringueTart = new Image("https://www.alsothecrumbsplease.com/wp-content/uploads/2019/03/Lemon-Meringue-Tart-56.jpg", "Lemon Meringue Tart");
        imageRepository.save(imageLemonyMeringueTart);
        Image imageGFChocolateBrownieCake = new Image("https://tmbidigitalassetsazure.blob.core.windows.net/rms3-prod/attachments/37/1200x1200/Triple-Layer-Brownie-Cake_exps9280_UH132930D05_23_5bC_RMS.jpg", "Gluten Free Chocolate Brownie Cake");
        imageRepository.save(imageGFChocolateBrownieCake);
        Image imageChocolateBrownieCake = new Image("https://www.hummingbirdhigh.com/wp-content/uploads/2018/04/9D3A8835-500x500.jpg", "Chocolate Brownie Cake");
        imageRepository.save(imageChocolateBrownieCake);
        Image imageChocolateCaramelTart = new Image("https://realfood.tesco.com/media/images/RFO-1400x919-Salted-caramel-tart-f03c995c-a7dd-42f8-b578-1f2d46283086-0-1400x919.jpg", "Chocolate Caramel Tart");
        imageRepository.save(imageChocolateCaramelTart);
        Image imageWhiteChocolateTart = new Image("https://marshasbakingaddiction.com/wp-content/uploads/2018/05/white-chocolate-raspberry-tart-4-735x1103.jpg", "White Chocolate Tart");
        imageRepository.save(imageWhiteChocolateTart);


        Image imageMillionaireyShortbread = new Image("https://thebigmansworld.com/wp-content/uploads/2020/03/millionaires-shortbread9.jpg", "Millionaire's Shortbread");
        imageRepository.save(imageMillionaireyShortbread);
        Image imageMarsBarKrispy = new Image("https://i0.wp.com/traybakesandmore.com/wp-content/uploads/2021/02/MarsBarsCaramelSquares-5.jpg?resize=960%2C641", "Mars Bar Krispy");
        imageRepository.save(imageMarsBarKrispy);
        Image imageCherryBakewell = new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/BakewellCake_%28cropped%29.jpg/220px-BakewellCake_%28cropped%29.jpg", "Cherry Bakewell");
        imageRepository.save(imageCherryBakewell);
        Image imageRockyRoadSlice = new Image("https://img.taste.com.au/COv2XffA/w720-h480-cfill-q80/taste/2016/11/rocky-road-slice-9214-1.jpeg", "");
        imageRepository.save(imageRockyRoadSlice);
        Image imageBiscoffCake = new Image("https://thebakingexplorer.com/wp-content/uploads/2021/07/BiscoffDripCakeFeatured-500x500.jpg", "Biscoff Cake");
        imageRepository.save(imageBiscoffCake);
        Image imageSausageRoll = new Image("https://i2-prod.bristolpost.co.uk/incoming/article94390.ece/ALTERNATES/s1200c/2_greggs-sausage-rolls.jpg", "Sausage Roll");
        imageRepository.save(imageSausageRoll);
        Image imageScotchPie = new Image("https://www.houseofbruar.com/images/products/medium/FD41787FHPQSE.jpg", "Scotch Pie");
        imageRepository.save(imageScotchPie);
        Image imageBeefVegetablePasty = new Image("https://www.kff.co.uk/images_products/L_pasties-beef-vegetable.jpg", "Beef & Vegetable Pasty");
        imageRepository.save(imageBeefVegetablePasty);
        Image imageSteakSlice = new Image("https://www.caterite.co.uk/media/catalog/product/cache/392c3f40a6c0d2d4bb5ca71ac305d882/7/8/78d00881582402b11061c22719609c0aabfc4a59_30002.jpg", "Steak Slice");
        imageRepository.save(imageSteakSlice);

        Image imageCremeBruleeDoughnut = new Image("https://data.thefeedfeed.com/recommended/post_2806192.jpeg", "Creme Brulee Doughnut");
        imageRepository.save(imageCremeBruleeDoughnut);
        Image imageChocolateMillionaireDoughnut = new Image("https://www.thesun.co.uk/wp-content/uploads/2019/11/Millionaires-Donut-e1573120082811.jpg", "Chocolate Millionaire Doughnut");
        imageRepository.save(imageChocolateMillionaireDoughnut);
        Image imageSaltedHoneyRing = new Image("https://assets-eu-01.kc-usercontent.com/559bb7d3-88a4-01c1-79a3-dd4d5b2d2bb0/5a6ddf21-d07f-4006-b73b-90c1e5958bad/1-salted-caramel-doughnut-web.jpg", "Salted Honey Ring");
        imageRepository.save(imageSaltedHoneyRing);
        Image imagePistachioHibiscusRing = new Image("https://i0.wp.com/2.bp.blogspot.com/-nJ6YKIz2n8I/Ww3kvQ_l43I/AAAAAAAACbM/jNKmM_hvP0wfyJF9BQjS6X0J7nb96GwjQCLcBGAs/s1600/tantrum%2Bdoughnuts%2Bglasgow%2Bscotland%2B.jpg?ssl=1", "Pistachio & Hibiscus Ring");
        imageRepository.save(imagePistachioHibiscusRing);
        Image imageJamDoughnut = new Image("https://bakerbynature.com/wp-content/uploads/2014/11/IMG_6597-682x1024-2.jpg", "Peanut Butter and Jam Doughnut");
        imageRepository.save(imageJamDoughnut);
        Image imageOldFashioned = new Image("https://d2t88cihvgacbj.cloudfront.net/manage/wp-content/uploads/2018/05/Old-Fashioned-Buttermilk-Donuts-2-260x195.jpg?x66763", "Almond Glaze Buttermilk Old Fashioned");
        imageRepository.save(imageOldFashioned);
        Image imageLemonPoppyseedDoughnut = new Image("https://www.fitmittenkitchen.com/wp-content/uploads/2017/03/Lemon-Poppy-Seed-Donuts-14-copy.jpg", "Lemon & Poppyseed Doughnut");
        imageRepository.save(imageLemonPoppyseedDoughnut);
        Image imageWhiteChocolateDoughnut = new Image("https://images.squarespace-cdn.com/content/v1/5f09aa1a075e1a30d24d6cdc/1604913444359-2HF99A2MHBHSTC6OQP7Z/DSC07968.jpg", "Double Blueberry & White Chocolate Doughnut");
        imageRepository.save(imageWhiteChocolateDoughnut);
        Image imageForestFruitsJamfilledDoughnut = new Image("https://i0.wp.com/www.growntocook.com/wordpress/wp-content/uploads/2014/02/sized_IMG_9924.jpg?resize=750%2C500", "Forest Fruits Jam filled Doughnut");
        imageRepository.save(imageForestFruitsJamfilledDoughnut);
        Image imageMadagascarVanillaBeanGlazeDoughnut = new Image("https://getinspiredeveryday.com/wp-content/uploads/2015/09/Vanilla-Bean-Glazed-Honey-Cake-Doughnuts-GI-365-2.jpg", "Madagascar Vanilla Bean Glaze Doughnut");
        imageRepository.save(imageMadagascarVanillaBeanGlazeDoughnut);


        Order order1 = new Order(1L, 1L, false);
        orderRepository.save(order1);
        croissant.setOrderId(order1.getId());
        bakeryItemRepository.save(croissant);
        orderRepository.save(order1);

        Order order2 = new Order(1L, 2L, false);
        orderRepository.save(order2);
        bague.setOrderId(order2.getId());
        bakeryItemRepository.save(bague);
        chall.setOrderId(order2.getId());
        bakeryItemRepository.save(chall);
        orderRepository.save(order2);

        Order order3 = new Order(2L, 3L, false);
        orderRepository.save(order3);
        darkchoc.setOrderId(order3.getId());
        bakeryItemRepository.save(darkchoc);
        orangec.setOrderId(order3.getId());
        bakeryItemRepository.save(orangec);
        orderRepository.save(order3);

        Order order4 = new Order(2L, 4L, false);
        orderRepository.save(order4);
        mangpass2.setOrderId(order4.getId());
        bakeryItemRepository.save(mangpass2);
        pecpie.setOrderId(order4.getId());
        bakeryItemRepository.save(pecpie);
        pecpie.setOrderId(order4.getId());
        bakeryItemRepository.save(pecpie);
        orderRepository.save(order4);

        Order order5 = new Order(2L, 5L, true);
        orderRepository.save(order5);
        bagel2.setOrderId(order5.getId());
        bakeryItemRepository.save(bagel2);
        pecpie.setOrderId(order5.getId());
        bakeryItemRepository.save(pecpie);
        empire.setOrderId(order5.getId());
        bakeryItemRepository.save(empire);
        orderRepository.save(order5);

        Order order6 = new Order(2L, 6L, true);
        orderRepository.save(order6);
        empire.setOrderId(order6.getId());
        bakeryItemRepository.save(empire);
        minilem.setOrderId(order6.getId());
        bakeryItemRepository.save(minilem);
        carrotc.setOrderId(order6.getId());
        bakeryItemRepository.save(carrotc);
        orderRepository.save(order6);




    }
}