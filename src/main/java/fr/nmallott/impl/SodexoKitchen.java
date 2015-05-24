package fr.nmallott.impl;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;
import fr.nmallott.api.Kitchen;

/**
 * Created by nicolas on 23/05/2015.
 */
public class SodexoKitchen extends KitchenAction implements Kitchen{

    private Chef chef;
    private Course course;

    public SodexoKitchen(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public SodexoKitchen() {
    }

    @Override
    Chef getChef() {
        return chef;
    }

    @Override
    protected Course getCourse() {
        return course;
    }

    @Override
    public void prepare() {
        chef.cook(course);
    }
}
