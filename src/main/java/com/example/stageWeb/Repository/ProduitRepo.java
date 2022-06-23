package com.example.stageWeb.Repository;

import com.example.stageWeb.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


public interface ProduitRepo  extends JpaRepository<Produit,Long> {
    Produit findProduitById(Long id);
    @Query("select p from Produit p where p.of= :of")
    List<Produit> findProduitByOf(String of);
    @Query("select p from Produit p where p.client= :client")
    List<Produit> findProduitByClient(String client);
    @Transactional
    @Modifying
    void deleteProduitById(Long id);
    @Transactional
    @Modifying
    @Query("update Produit p set  p.client= :client ,p.lot = :lot , p.of= :of , p.qteLot= :qteLot where p.id= :id")
     int updateProduitBy( Long id , String client , String lot , String of , Integer qteLot) ;


}
