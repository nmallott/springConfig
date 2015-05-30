package fr.nmallott.impl.course;

import org.springframework.stereotype.Component;

/**
 * Created by nicolas on 06/04/2015.
 */
@Component("applepie")
public class ApplePie extends AbstractCourse {
    @Override
    public String toString() {
        return "an apple pie.";
    }
}
