package com.example.ecole.Model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import com.example.ecole.Model.MOClasse;
import com.example.ecole.Model.MOSalle;

@Getter
@Setter
@Entity
@Table(name="salle")
public class MOSalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Salle;

    @NonNull
    private String nom;

    @OneToMany(mappedBy = "salle")
    private List<MOProf> profs;


}
