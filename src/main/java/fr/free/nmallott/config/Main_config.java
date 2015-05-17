package fr.free.nmallott.config;

import fr.free.nmallott.impl.ApplePie;
import fr.free.nmallott.impl.ChefConstant;
import fr.free.nmallott.impl.RestaurantKitchen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nicolas on 06/04/2015.
 */
@Configuration
@ComponentScan(basePackageClasses = {Main_config.class, ApplePie.class})
public class Main_config {

    @Bean(name = "restaurantKit")
    RestaurantKitchen restaurantKitchen(ChefConstant chefConstant, ApplePie course){
        RestaurantKitchen kitchen = new RestaurantKitchen();
        kitchen.setChef(chefConstant);
        kitchen.setCourse(course);
        return kitchen;
    }

}
