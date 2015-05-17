package fr.free.nmallott.impl;

import fr.free.nmallott.api.Chef;
import fr.free.nmallott.api.Course;

/**
 * Created by nicolas on 17/05/2015.
 */
abstract public class KitchenAction {

    abstract Chef getChef();

    protected abstract Course getCourse();

    public void prepare(){
        getChef().cook(getCourse());
    }


}
