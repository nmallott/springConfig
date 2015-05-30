package fr.nmallott.impl;

import fr.nmallott.api.Kitchen;
import fr.nmallott.config.Main_config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;

/**
 * Created by nicolas on 06/04/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main_config.class)
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

        assertNotNull("mumKitchen is null", mumkitchen);
        assertNotNull("restaurantKitchen is null", restaurantkitchen);
        assertNotNull("sodexokitchen is null", sodexokitchen);

    }

    @Test
    public void testChefInKitchen() {
        assertNotNull("There is no chef in mumKitchen", mumkitchen.getChef());
        assertNotNull("There is no chef in sodexo", sodexokitchen.getChef());
        assertNotNull("There is no chef in restaurant", restaurantkitchen.getChef());
    }

    @Test
    public void testStockNotEmpty() throws Exception {
        assertNotNull("There is nothin in mumKitchen stock", mumkitchen.getStock());
        assertFalse("There is nothin in mumKitchen stock", mumkitchen.getStock().isEmpty());

    }
}