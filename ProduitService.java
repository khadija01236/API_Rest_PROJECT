package com.KhadiProject.demo.service;

import com.KhadiProject.demo.modele.Produit;

import java.util.List;


/**
 * Interface pour la gestion des produits.
 */

public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);
}
