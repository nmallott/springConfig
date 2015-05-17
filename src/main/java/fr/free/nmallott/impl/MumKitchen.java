package fr.free.nmallott.impl;

import fr.free.nmallott.api.Chef;
import fr.free.nmallott.api.Course;
import fr.free.nmallott.api.Kitchen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component
public class MumKitchen implements Kitchen {

    @Autowired
    @Qualifier("chefmum")
    public Chef chef;

    @Autowired
    public Course course;

    @Override
    public void prepare(){
        chef.cook(course);
    }
}
