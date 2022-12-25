package sn.kcmbaye.dev.demo_rev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.kcmbaye.dev.demo_rev.entities.Produit;
import sn.kcmbaye.dev.demo_rev.service.DemoService;

@SpringBootApplication
public class DemoRevApplication implements CommandLineRunner{

	@Autowired
	private DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoRevApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Produit produit = new Produit();
		produit.setName("chaussures");
		produit.setPrice(500);
		produit.setQte(3);

		Produit produit1 = new Produit();
		produit1.setName("t-shirt");
		produit1.setPrice(800);
		produit1.setQte(4);

		Produit produit2 = new Produit();
		produit2.setName("pantalon");
		produit2.setPrice(1000);
		produit2.setQte(7);

		demoService.saveProduit(produit);
		demoService.saveProduit(produit1);
		demoService.saveProduit(produit2);


		//System.out.println(demoService.getAllProduits().toString());
	}
}
