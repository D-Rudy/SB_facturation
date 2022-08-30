package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;

public class FactureServiceGarage implements FactureServiceInterface{
    private static long dernierNumFacture = 112L;

    //Les numéros de factures du garage ont comme forme FACT_112
    private FactureRepositoryInterface factureRepository;//On n'instancie pas de classe concrète pour éviter les dépendances
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf("FACT_" + (++dernierNumFacture)));
        factureRepository.creer(facture);
    }
}
