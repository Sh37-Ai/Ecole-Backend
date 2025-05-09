package com.example.ecole.Model;


import jakarta.persistence.*;
import lombok.* ;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
@Getter(AccessLevel.PROTECTED)
@Setter(AccessLevel.PROTECTED)
@ToString

@Entity
@Table(name = "classe")
public class MOClasse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_classe;

    @NonNull
    private int nb_eleves;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    private List<MOEleve> eleves;

    @ManyToOne
    @JoinColumn(name = "id_ClasseProf")
    private MOClasseProf ClasseProf;


    public int getNombreEleves() {
        return eleves != null ? eleves.size() : 0;
    }







}
