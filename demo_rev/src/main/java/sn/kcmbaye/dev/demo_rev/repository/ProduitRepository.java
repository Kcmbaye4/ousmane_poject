package sn.kcmbaye.dev.demo_rev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.kcmbaye.dev.demo_rev.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
