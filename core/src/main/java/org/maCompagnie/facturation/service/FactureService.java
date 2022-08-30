package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;

public class FactureService implements FactureServiceInterface {
    private static long dernierNumFacture = 0L;

    private FactureRepositoryInterface factureRepository;
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf(++dernierNumFacture));
        factureRepository.creer(facture);
    }
}
