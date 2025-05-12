package com.example.ecole.Repository;


import com.example.ecole.Model.MOReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REPReservation extends JpaRepository<MOReservation, Integer> {
}
