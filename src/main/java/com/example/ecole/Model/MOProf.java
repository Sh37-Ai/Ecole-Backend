package com.example.ecole.Model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;


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

    @ManyToOne
    @JoinColumn(name = "id_ClasseProf")
    private MOClasseProf ClasseProf;






}
