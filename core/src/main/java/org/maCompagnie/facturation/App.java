package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FactureControllerInterface factureController = context.getBean(FactureControllerInterface.class);
        //Instancie l'interface pour pouvoir changé d'implémentation  plus simplement
        factureController.creerFacture();
    }
}
