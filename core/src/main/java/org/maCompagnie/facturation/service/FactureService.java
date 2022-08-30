package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepository;

public class FactureService {
    private static long dernierNumFacture = 0L;

    private FactureRepository factureRepository = new FactureRepository();
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf(++dernierNumFacture));
        factureRepository.creer(facture);
    }
}
