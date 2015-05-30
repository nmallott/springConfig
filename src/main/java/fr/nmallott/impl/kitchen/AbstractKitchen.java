package fr.nmallott.impl.kitchen;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;
import fr.nmallott.api.Kitchen;

import java.util.List;

/**
 * Created by nicolas on 30/05/2015.
 */
public abstract class AbstractKitchen implements Kitchen {

    @Override
    public Chef getChef() {
        return null;
    }

    @Override
    public Course getCourse() {
        return null;
    }

    @Override
    public List<String> getStock() {
        return null;
    }

    @Override
    public void setStock() {
    }
}
