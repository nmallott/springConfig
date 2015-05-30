package fr.nmallott.impl.chef;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;

/**
 * Created by nicolas on 24/05/2015.
 */
public class AbstractChef implements Chef {

    String name;

    Course course;

    @Override
    public void cook(Course course) {
        System.out.println("Chef " + name + " prepare a " + course + ".");
    }
}
