package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;

import java.util.List;

public interface FactureServiceInterface {
    void creerFacture (Facture facture);
    void setFactureRepository(FactureRepositoryInterface factureRepository);
    List<Facture> getFactureList();
}
