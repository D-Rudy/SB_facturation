package org.maCompagnie.facturation.repository.database;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FactureRepositoryDatabase implements FactureRepositoryInterface {
    @Override
    public void creer (Facture facture){
      /* PreparedStatement statement = connexion.prepareStatement ("INSERT INTO facture (num_facture, nom_client) VALUES (?,?)");
     statement.executeUpdate();*/
        System.out.println("BDD: La facture avec le numéro " + facture.getNumero() + " pour " + facture.getNomClient() + " a bien été ajoutée.");
    }

    @Override
    public List<Facture> list() {
        Facture facture1 = new Facture();
        facture1.setNumero("Num_1");
        facture1.setNomClient("Cavalry Buster");
        Facture facture2 = new Facture();
        facture2.setNumero("Num_2");
        facture2.setNomClient("Solid Battler");
        return List.of(facture1,facture2);
    }
}
