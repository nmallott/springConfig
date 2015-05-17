package fr.free.nmallott.config;

import fr.free.nmallott.impl.ApplePie;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nicolas on 06/04/2015.
 */
@Configuration
@ComponentScan(basePackageClasses = {Main_config.class, ApplePie.class})
public class Main_config {
}
