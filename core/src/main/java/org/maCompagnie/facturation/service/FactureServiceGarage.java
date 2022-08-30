package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepository;
import org.maCompagnie.facturation.repository.FactureRepositoryGarage;

public class FactureServiceGarage {
    private static long dernierNumFacture = 112L;

    //Les numéros de factures du garage ont comme forme FACT_112
    private FactureRepositoryGarage  factureRepositoryGarage = new FactureRepositoryGarage();
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf("FACT_" + (++dernierNumFacture)));
        factureRepositoryGarage.creer(facture);
    }
}
