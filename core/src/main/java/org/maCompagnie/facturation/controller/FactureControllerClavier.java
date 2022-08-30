package org.maCompagnie.facturation.controller;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureServiceInterface;

import java.util.Scanner;

public class FactureControllerClavier implements FactureControllerInterface{
    private FactureServiceInterface factureService;
    public void creerFacture(){
        System.out.println( "Quel est le nom du client?" );
        Scanner input = new Scanner(System.in);
        String nomClient = input.nextLine();
        Facture facture = new Facture();
        facture.setNomClient(nomClient);
        factureService.creerFacture(facture);
    }

    public FactureServiceInterface getFactureService() {
        return factureService;
    }

    public void setFactureService(FactureServiceInterface factureService) {
        this.factureService = factureService;
    }
}
