package fr.free.nmallott.impl;

import fr.free.nmallott.api.Kitchen;
import fr.free.nmallott.config.Main_config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    Kitchen kitchen;

    @Test
    public void testKitchenWiring() throws Exception {

       assertTrue("Kitchen is null", kitchen != null);

    }

    @Test
    public void testCook() throws Exception {

        kitchen.prepare();

    }
}