package fr.nmallott.impl;

import fr.nmallott.api.Kitchen;
import fr.nmallott.config.Main_config;
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
    @Qualifier("restaurantKit")
    Kitchen restaurantkitchen;

    @Autowired
    @Qualifier("sodexoKit")
    Kitchen sodexokitchen;

    @Test
    public void testKitchenWiring() throws Exception {

        assertTrue("mumKitchen is null", mumkitchen != null);
        assertTrue("restaurantKitchen is null", restaurantkitchen != null);
        assertTrue("sodexokitchen is null", sodexokitchen != null);

    }

    @Test
    public void testCook() throws Exception {

        mumkitchen.prepare();
        restaurantkitchen.prepare();
        sodexokitchen.prepare();

    }
}