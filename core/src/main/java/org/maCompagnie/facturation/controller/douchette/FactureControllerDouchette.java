package org.maCompagnie.facturation.controller.douchette;

import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureServiceInterface;
import org.springframework.stereotype.Controller;

//@Controller
public class FactureControllerDouchette implements FactureControllerInterface {
    private FactureServiceInterface factureService;
    @Override
    public void creerFacture() {
        //Simulation d'une douchette
        System.out.println("Usage d'une douchette");
        Facture facture = new Facture();
        facture.setNomClient("Gifted Bird");
        factureService.creerFacture(facture);
    }

    public FactureServiceInterface getFactureService() {
        return factureService;
    }

    public void setFactureService(FactureServiceInterface factureService) {
        this.factureService = factureService;
    }
}
