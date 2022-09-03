package org.maCompagnie.facturation.service.numero;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;
import org.maCompagnie.facturation.service.FactureServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class FactureServiceNumero implements FactureServiceInterface {
    private static long dernierNumFacture = 0L;
    private FactureRepositoryInterface factureRepository;
    public void creerFacture (Facture facture){
        facture.setNumero(String.valueOf(++dernierNumFacture));
        factureRepository.creer(facture);
    }

    public static long getDernierNumFacture() {
        return dernierNumFacture;
    }

    public static void setDernierNumFacture(long dernierNumFacture) {
        FactureServiceNumero.dernierNumFacture = dernierNumFacture;
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
}
