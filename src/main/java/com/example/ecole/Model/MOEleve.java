package com.example.ecole.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Table(name= "eleves")
public class MOEleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_eleve;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String adresse;

    @NonNull
    private String telephone;

    @ManyToOne
    @JoinColumn(name = "classe_id", nullable = false)
    private MOClasse classe;

    public MOClasse getClasse() {
        return classe;
    }

    public void setClasse(MOClasse classe) {
        this.classe = classe;
    }

    @JsonProperty("classe_id") // ajoute un champ JSON pour l'ID de la classe
    public Integer getClasseId() {
        return classe != null ? classe.getId_classe() : null;
    }


    public Integer getId_eleve() {
        return id_eleve;
    }
    public void setId_eleve(Integer id_eleve) {
        this.id_eleve = id_eleve;
    }

    // Getter et Setter pour nom
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour prenom
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getter et Setter pour adresse
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter et Setter pour telephone
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



}
