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

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quel classe de controlleur utilisez vous ? ");
        String controlleurClass = input.nextLine();

        System.out.println("Quel classe de service utilisez vous ? ");
        String serviceClass = input.nextLine();

        System.out.println("Quel classe de repository utilisez vous ? ");
        String repositoryClass = input.nextLine();

        FactureControllerInterface factureController = null; //On la déclare ici car nous ne savons pas de quel type elle sera
        FactureServiceInterface factureService = null;
        FactureRepositoryInterface factureRepository = null;

        try {
            //reflexivitée(Instancie un objet sur la base d'un nom de classe d'après la saisie de l'utilisateur
            factureController = (FactureControllerInterface) Class.forName(controlleurClass).getDeclaredConstructor().newInstance();
            factureService = (FactureServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            factureRepository = (FactureRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        factureController.setFactureService(factureService);
        factureService.setFactureRepository(factureRepository);

        factureController.creerFacture();
    }
}
