package fr.free.nmallott.impl;

import fr.free.nmallott.api.Kitchen;
import fr.free.nmallott.config.Main_config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by nicolas on 06/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = Main_config.class)
public class KitchenTest {

    @Autowired
    @Qualifier("mumKitchen")
    Kitchen mumkitchen;

    @Autowired
    @Qualifier("restaurantKitchen")
    Kitchen restaurantkitchen;

    @Test
    public void testKitchenWiring() throws Exception {

        assertTrue("mumKitchen is null", mumkitchen != null);
        assertTrue("restaurantKitchen is null", restaurantkitchen != null);

    }

    @Test
    public void testCook() throws Exception {

        mumkitchen.prepare();
        restaurantkitchen.prepare();

    }
}