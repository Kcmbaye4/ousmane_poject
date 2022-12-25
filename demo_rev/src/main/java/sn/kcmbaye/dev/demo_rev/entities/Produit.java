package sn.kcmbaye.dev.demo_rev.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity // @Entity et @Id sont les annotations indispensables pour que la classe soit une entité jpa
@Data @NoArgsConstructor @AllArgsConstructor //Lombok
public class Produit implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue --> pour que l'Id soit auto_INCREMENT
    private Long id;
    private String name;
    private int price;
    private int qte;
}
