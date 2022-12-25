package sn.kcmbaye.dev.demo_rev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.kcmbaye.dev.demo_rev.entities.Produit;
import sn.kcmbaye.dev.demo_rev.repository.ProduitRepository;

import java.util.List;

@Service // Cette annotation permet de dire à Spring que c'est cette classe qui représente note classe métier
public class DemoServiceImpl implements DemoService{

    @Autowired // Cette annotation permet d'injecter le repository
    private ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
