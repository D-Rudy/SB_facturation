package org.maCompagnie.facturation.controller.web;

import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FactureControllerWeb implements FactureControllerInterface {
    @Autowired
    private FactureServiceInterface factureService;

    public void creerFacture() {
        String nomClient = "Phoenix Armor Suit";//nom recupérer depuis un formulaire
        Facture facture = new Facture();
        facture.setNomClient(nomClient);
        factureService.creerFacture(facture);
    }

    @RequestMapping("/facture-home")
    public String displayHome() {
        System.out.println("displayHome ok...");
        return "index";
    }

    public FactureServiceInterface getFactureService() {
        return factureService;
    }

    public void setFactureService(FactureServiceInterface factureService) {
        this.factureService = factureService;
    }
}
