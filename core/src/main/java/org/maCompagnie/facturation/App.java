package org.maCompagnie.facturation;

import org.maCompagnie.facturation.controller.FactureControllerInterface;
import org.maCompagnie.facturation.service.FactureServiceInterface;
import org.maCompagnie.facturation.service.prefixe.FactureServicePrefixe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"org.maCompagnie.facturation.controller.web" /*, "org.maCompagnie.facturation.service.prefixe"*/, "org.maCompagnie.facturation.repository.database"})
@PropertySource("classpath:application.properties")
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        FactureControllerInterface factureController = context.getBean(FactureControllerInterface.class);
        //Instancie l'interface pour pouvoir changé d'implémentation  plus simplement
        factureController.creerFacture();
    }
    @Bean
    public FactureServiceInterface configureFactureService(){
        return new FactureServicePrefixe();
    }
}
