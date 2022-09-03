package org.maCompagnie.facturation.service.prefixe;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;
import org.maCompagnie.facturation.service.FactureServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class FactureServicePrefixe implements FactureServiceInterface {
    @Value("${facture.numFacture}")
    private long dernierNumFacture;
    @Value("${facture.prefix}")
    private String prefix;
    private File fichier;
    @Autowired
    private FactureRepositoryInterface factureRepository;//On n'instancie pas de classe concrète pour éviter les dépendances
    public void creerFacture (Facture facture){
        facture.setNumero(prefix + (++dernierNumFacture));
        factureRepository.creer(facture);
    }


    public FactureRepositoryInterface getFactureRepository() {
        return factureRepository;
    }

    public void setFactureRepository(FactureRepositoryInterface factureRepository) {
        this.factureRepository = factureRepository;
    }

    @Override
    public List<Facture> getFactureList() {
        return factureRepository.list();
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
