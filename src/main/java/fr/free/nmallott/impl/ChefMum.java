package fr.free.nmallott.impl;

import fr.free.nmallott.api.Chef;
import fr.free.nmallott.api.Course;
import org.springframework.stereotype.Component;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("chefmum")
public class ChefMum implements Chef {
    @Override
    public void cook(Course course) {
        System.out.println("Mum cook " + course);
    }
}
