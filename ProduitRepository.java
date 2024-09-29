package com.KhadiProject.demo.repository;

import com.KhadiProject.demo.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
