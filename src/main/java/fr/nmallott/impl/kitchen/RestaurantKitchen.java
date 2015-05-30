package fr.nmallott.impl.kitchen;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;

/**
 * Created by nicolas on 17/05/2015.
 */
//@Component("restaurantKitchen")
public class RestaurantKitchen extends AbstractKitchen {

    private Chef chef;

    private Course course;

    @Override
    public Chef getChef() {
        return chef;
    }

    @Override
    public Course getCourse() {
        return course;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
