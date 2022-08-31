package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureControllerClavier;
import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.maCompagnie.facturation.controller.FactureControllerWeb;
import org.maCompagnie.facturation.controller.FactureControllerDouchette;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;
import org.maCompagnie.facturation.repository.FactureRepositoryMemoire;
import org.maCompagnie.facturation.repository.FactureRepositoryDatabase;
import org.maCompagnie.facturation.service.FactureServiceInterface;
import org.maCompagnie.facturation.service.FactureServiceNumero;
import org.maCompagnie.facturation.service.FactureServicePrefixe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FactureControllerInterface factureController = context.getBean(FactureControllerInterface.class);
        //Instancie l'interface pour pouvoir changé d'implémentation  plus simplement
        factureController.creerFacture();
    }
}
