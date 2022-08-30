package org.maCompagnie.facturation.controller;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureServiceInterface;

public class FactureControllerGarage implements FactureControllerInterface
{
    private FactureServiceInterface factureService;
    public void creerFacture() {
        String nomClient = "test";//nom recupérer depuis un formulaire
        Facture facture = new Facture();
        facture.setNomClient(nomClient);
        factureService.creerFacture(facture);
    }
}
