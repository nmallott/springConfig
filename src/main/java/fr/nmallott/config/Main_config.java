package fr.nmallott.config;

import fr.nmallott.impl.ApplePie;
import fr.nmallott.impl.ChefConstant;
import fr.nmallott.impl.RestaurantKitchen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by nicolas on 06/04/2015.
 */
@Configuration
@ComponentScan(basePackageClasses = {Main_config.class, ApplePie.class})
@ImportResource("classpath:spring-config.xml")
public class Main_config {

    @Bean(name = "restaurantKit")
    RestaurantKitchen restaurantKitchen(ChefConstant chefConstant, ApplePie course){
        RestaurantKitchen kitchen = new RestaurantKitchen();
        kitchen.setChef(chefConstant);
        kitchen.setCourse(course);
        return kitchen;
    }

}
