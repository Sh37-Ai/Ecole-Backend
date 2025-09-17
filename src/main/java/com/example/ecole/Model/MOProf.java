package com.example.ecole.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;


@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Table(name="Prof")
public class MOProf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_prof;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String adresse;

    @NonNull
    private int telephone;

    @Column(nullable = true) // Si tu autorises la nullité dans la base
    private Integer role;

    @ManyToOne
    @JoinColumn(name = "id_salle")
    private MOSalle salle;

    @OneToMany(mappedBy = "prof")
    @JsonManagedReference
    private List<MOClasseProf> ClasseProfs;


}
