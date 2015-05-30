package fr.nmallott.api;

import java.util.List;

/**
 * Created by nicolas on 06/04/2015.
 */
public interface Kitchen {

    Chef getChef();

    Course getCourse();

    List<String> getStock();

    void setStock();
}
