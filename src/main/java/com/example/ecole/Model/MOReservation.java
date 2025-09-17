package com.example.ecole.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.sql.Time;
import java.sql.Timestamp;


@Builder
@Getter
@Setter

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Entity
@Table(name="reservation")
public class MOReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reservation;

    @NonNull
    private String horaire;

    @ManyToOne
    @JoinColumn(name = "id_ClasseProf")
    private MOClasseProf classeprof;

    @ManyToOne
    @JoinColumn(name = "id_Salle")
    @JsonBackReference
    private MOSalle salle;

}
