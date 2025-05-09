package com.example.ecole.Model;

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
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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


}
