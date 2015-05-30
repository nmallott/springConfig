package fr.nmallott.impl.kitchen;

import fr.nmallott.api.Chef;
import fr.nmallott.api.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("mumKitchen")
public class MumKitchen extends AbstractKitchen {

    @Autowired
    @Qualifier("chefmum")
    public Chef chef;

    @Autowired
    public Course course;

    @Resource(name = "mumStock")
    private List<String> stock;

    @Override
    public Chef getChef() {
        return chef;
    }

    @Override
    public Course getCourse() {
        return course;
    }

    public void setStock(List<String> stock) {
        this.stock = stock;
    }

    @Override
    public List<String> getStock() {
        return stock;
    }
}
