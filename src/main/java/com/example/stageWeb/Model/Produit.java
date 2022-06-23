package com.example.stageWeb.Model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Produit")
@DynamicUpdate
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String of ;
    private String client ;
    private String lot ;
    private Integer qteLot ;

    public Produit(){}

    public Produit( String of, String client, String lot, Integer qteLot) {

       this.of=of;
        this.client = client;
        this.lot = lot;
        this.qteLot = qteLot;
    }
    public Produit(Long id , String of, String client, String lot, Integer qteLot) {
        this.id=id;
        this.of=of;
        this.client = client;
        this.lot = lot;
        this.qteLot = qteLot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOF() {
        return of;
    }

    public void setOF(String OF) {
        this.of = OF;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public Integer getQteLot() {
        return qteLot;
    }

    public void setQteLot(Integer qteLot) {
        this.qteLot = qteLot;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", OF='" + of + '\'' +
                ", client='" + client + '\'' +
                ", lot='" + lot + '\'' +
                ", qteLot=" + qteLot +
                '}';
    }
}
