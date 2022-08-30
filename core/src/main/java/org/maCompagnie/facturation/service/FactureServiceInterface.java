package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;

public interface FactureServiceInterface {
    void creerFacture (Facture facture);
    public void setFactureRepository(FactureRepositoryInterface factureRepository);
}
