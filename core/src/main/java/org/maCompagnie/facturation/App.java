package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureController;
import org.maCompagnie.facturation.controller.FactureControllerGarage;
import org.maCompagnie.facturation.controller.FactureControllerMagasin2;
import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepository;
import org.maCompagnie.facturation.repository.FactureRepositoryGarage;
import org.maCompagnie.facturation.service.FactureService;
import org.maCompagnie.facturation.service.FactureServiceGarage;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Dans quelle configuration êtes vous ?");
        int configuration = input.nextInt();

        //Configuration de base
        if (configuration == 1){
            FactureController factureController = new FactureController();
            FactureService factureService = new FactureService();
            factureController.setFactureService(factureService);
            FactureRepository factureRepository = new FactureRepository();
            factureService.setFactureRepository(factureRepository);
            factureController.creerFacture();
        }
        //configuration du garage
        else if (configuration ==2) {
            FactureControllerGarage factureController = new FactureControllerGarage();
            FactureServiceGarage factureService = new FactureServiceGarage();//On instancie un nouveau service
            factureController.setFactureService(factureService);//On injecte le serviceGarage dans le controlleur
            FactureRepositoryGarage factureRepository = new FactureRepositoryGarage();//on instancie un nouveau repository
            factureService.setFactureRepository(factureRepository);//On injecte ce nouveau repository dans le service
            factureController.creerFacture();

        }
        else if (configuration ==3) {
            FactureControllerGarage factureController = new FactureControllerGarage();
            FactureService factureService = new FactureService();//On instancie un nouveau service
            factureController.setFactureService(factureService);//On injecte le serviceGarage dans le controlleur
            FactureRepositoryGarage factureRepository = new FactureRepositoryGarage();//on instancie un nouveau repository
            factureService.setFactureRepository(factureRepository);//On injecte ce nouveau repository dans le service
            factureController.creerFacture();

        }
        else if (configuration ==4) {
            FactureControllerMagasin2 factureController = new FactureControllerMagasin2();
            FactureService factureService = new FactureService();//On instancie un nouveau service
            factureController.setFactureService(factureService);//On injecte le serviceGarage dans le controlleur
            FactureRepositoryGarage factureRepository = new FactureRepositoryGarage();//on instancie un nouveau repository
            factureService.setFactureRepository(factureRepository);//On injecte ce nouveau repository dans le service
            factureController.creerFacture();

        }
    }
}
