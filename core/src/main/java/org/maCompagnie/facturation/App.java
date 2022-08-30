package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureController;
import org.maCompagnie.facturation.controller.FactureControllerGarage;
import org.maCompagnie.facturation.model.Facture;
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
            factureController.creerFacture();
        }
        //configuration du garage
        else if (configuration ==2) {
            FactureControllerGarage factureControllerGarage = new FactureControllerGarage();
            factureControllerGarage.creerFacture();

        }
    }
}
