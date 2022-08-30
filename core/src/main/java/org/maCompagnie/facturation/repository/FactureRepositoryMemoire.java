package org.maCompagnie.facturation.repository;

import org.maCompagnie.facturation.model.Facture;

import java.util.ArrayList;
import java.util.List;

public class FactureRepositoryMemoire implements FactureRepositoryInterface {
    private static List<Facture> factures = new ArrayList<>();
    public void creer (Facture facture){
        factures.add(facture);
        System.out.println("La facture avec le numéro " + facture.getNumero() + " pour " + facture.getNomClient() + " a bien été ajoutée.");
    }

}
