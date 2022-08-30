package org.maCompagnie.facturation.controller;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureServiceInterface;

public class FactureControllerWeb implements FactureControllerInterface
{
    private FactureServiceInterface factureService;
    public void creerFacture() {
        String nomClient = "Phoenix Armor Suit";//nom recupérer depuis un formulaire
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
