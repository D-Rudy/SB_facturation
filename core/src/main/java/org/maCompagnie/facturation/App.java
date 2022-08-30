package org.maCompagnie.facturation;

import org.maCompagnie.facturation.model.Facture;
import org.maCompagnie.facturation.service.FactureService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Quel est le nom du client?" );
        Scanner input = new Scanner(System.in);
        String nomClient = input.nextLine();
        Facture facture = new Facture();
        facture.setNomClient(nomClient);
        FactureService factureService = new FactureService();
        factureService.creerFacture(facture);

    }
}
