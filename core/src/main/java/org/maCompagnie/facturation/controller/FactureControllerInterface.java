package org.maCompagnie.facturation.controller;

import org.maCompagnie.facturation.service.FactureServiceInterface;

public interface FactureControllerInterface {
    void creerFacture();
    void setFactureService(FactureServiceInterface factureService);
}
