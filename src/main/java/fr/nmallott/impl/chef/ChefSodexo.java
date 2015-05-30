package fr.nmallott.impl.chef;

import fr.nmallott.api.Chef;
import fr.nmallott.impl.chef.AbstractChef;

/**
 * Created by nicolas on 06/04/2015.
 */
public class ChefSodexo extends AbstractChef implements Chef {
    public void setName(String name) {
        this.name = name;
    }
}
