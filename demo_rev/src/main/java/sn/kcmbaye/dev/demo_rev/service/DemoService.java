package sn.kcmbaye.dev.demo_rev.service;

import sn.kcmbaye.dev.demo_rev.entities.Produit;
import sn.kcmbaye.dev.demo_rev.repository.ProduitRepository;

import java.util.List;

public interface DemoService {
    Produit saveProduit(Produit produit); // Cette méthode permet d'ajouter un nouveau produit
    List<Produit> getAllProduits(); // Cette méthode permet de lister l'ensemble des produits

}
