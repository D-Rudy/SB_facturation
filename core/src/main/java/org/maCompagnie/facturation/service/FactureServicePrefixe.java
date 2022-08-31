package org.maCompagnie.facturation.service;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;

import java.io.File;

public class FactureServicePrefixe implements FactureServiceInterface{
    private long dernierNumFacture = 112L;
    private String prefix;
    private File fichier;

    //Les numéros de factures du garage ont comme forme FACT_112
    private FactureRepositoryInterface factureRepository;//On n'instancie pas de classe concrète pour éviter les dépendances
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf(prefix + (++dernierNumFacture)));
        factureRepository.creer(facture);
    }


    public FactureRepositoryInterface getFactureRepository() {
        return factureRepository;
    }

    public void setFactureRepository(FactureRepositoryInterface factureRepository) {
        this.factureRepository = factureRepository;
    }

    public long getDernierNumFacture() {
        return dernierNumFacture;
    }

    public void setDernierNumFacture(long dernierNumFacture) {
        this.dernierNumFacture = dernierNumFacture;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public File getFichier() {
        return fichier;
    }

    public void setFichier(File fichier) {
        this.fichier = fichier;
    }
}
