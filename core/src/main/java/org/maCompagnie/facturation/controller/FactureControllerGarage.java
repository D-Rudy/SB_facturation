package org.maCompagnie.facturation.controller;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureService;
import org.maCompagnie.facturation.service.FactureServiceGarage;

import java.util.Scanner;

public class FactureControllerGarage
{
    public void creerFactureAvecForm(){
        String nomClient = "test";//nom recupérer depuis un formulaire
        Facture facture = new Facture();
        facture.setNomClient(nomClient);

        FactureServiceGarage factureServiceGarage = new FactureServiceGarage();
        factureServiceGarage.creerFacture(facture);
    }
}
