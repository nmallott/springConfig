package fr.nmallott.impl;

import fr.nmallott.api.Chef;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("chefmum")
public class ChefMum extends AbstractChef implements Chef {

    @PostConstruct
    public void setup() {
        this.name = "Mum";
    }
}
