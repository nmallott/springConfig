package fr.nmallott.impl;

import fr.nmallott.api.Chef;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("chefconstant")
public class ChefConstant extends AbstractChef implements Chef {

    @PostConstruct
    public void setup() {
        this.name = "Constant";
    }

}
