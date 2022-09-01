package org.maCompagnie.facturation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"org.maCompagnie.facturation.controller.web", "org.maCompagnie.facturation.service.prefixe", "org.maCompagnie.facturation.repository.database"})
@PropertySource("classpath:application.properties")
public class AppConfig {
}
