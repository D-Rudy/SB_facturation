package org.maCompagnie.facturation.repository.database;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.repository.FactureRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class FactureRepositoryDatabase implements FactureRepositoryInterface {
    public void creer (Facture facture){
      /* PreparedStatement statement = connexion.prepareStatement ("INSERT INTO facture (num_facture, nom_client) VALUES (?,?)");
     statement.executeUpdate();*/
        System.out.println("BDD: La facture avec le numéro " + facture.getNumero() + " pour " + facture.getNomClient() + " a bien été ajoutée.");
    }
}
