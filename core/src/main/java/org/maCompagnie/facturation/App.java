package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class App {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class);
        FactureControllerInterface factureController = context.getBean(FactureControllerInterface.class);
        factureController.creerFacture();
    }

}
