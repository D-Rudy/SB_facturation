package org.maCompagnie.facturation.repository;

import org.maCompagnie.facturation.model.Facture;

import java.util.List;

public interface FactureRepositoryInterface {
    void creer (Facture facture);
    List<Facture> list();
}

