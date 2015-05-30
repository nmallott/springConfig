package fr.nmallott.impl.kitchen;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;

/**
 * Created by nicolas on 23/05/2015.
 */
public class SodexoKitchen extends AbstractKitchen {

    private Chef chef;
    private Course course;

    public SodexoKitchen(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public SodexoKitchen() {
    }

    @Override
    public Chef getChef() {
        return chef;
    }

    @Override
    public Course getCourse() {
        return course;
    }

}
