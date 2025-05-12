package com.example.ecole.Services;



import com.example.ecole.Model.MOReservation;
import com.example.ecole.Repository.REPReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SERReservation {

    @Autowired
    private REPReservation repReservation;

    public List<MOReservation> getReservations() {
        return repReservation.findAll();
    }

    public Optional<MOReservation> getReservation(int id) {
        return repReservation.findById(id);
    }

    public MOReservation addReservation(MOReservation reservation) {
        return repReservation.save(reservation);
    }
}
