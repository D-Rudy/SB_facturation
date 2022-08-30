package org.maCompagnie.facturation.repository;

import org.maCompagnie.facturation.model.Facture;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class FactureRepositoryGarage implements FactureRepositoryInterface{
    public void creer (Facture facture){
      /* PreparedStatement statement = connexion.prepareStatement ("INSERT INTO facture (num_facture, nom_client) VALUES (?,?)");
     statement.executeUpdate();*/
        System.out.println("La facture avec le numéro " + facture.getNumero() + " pour " + facture.getNomClient() + " a bien été ajoutée.");
    }
}
