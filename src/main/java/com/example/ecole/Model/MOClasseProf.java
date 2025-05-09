package com.example.ecole.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "classeprof")
public class MOClasseProf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ClasseProf;

    @NonNull
    private String matiere;

    @ManyToOne
    @JoinColumn(name = "id_classe")
    private MOClasse classe;

    @ManyToOne
    @JoinColumn(name = "id_prof")
    private MOProf prof;

}

