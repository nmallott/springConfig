package fr.free.nmallott.impl;

import fr.free.nmallott.api.Course;
import org.springframework.stereotype.Component;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("applepie")
public class ApplePie implements Course {
    @Override
    public String toString() {
        return "an apple pie.";
    }
}
