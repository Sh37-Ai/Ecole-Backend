package com.example.ecole.Controllers;


import com.example.ecole.Model.MOReservation;
import com.example.ecole.Repository.REPReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CONReservation {

    @Autowired
    private REPReservation repReservation;

    @GetMapping("/Reservation")
    public List<MOReservation> getReservations() {
        return repReservation.findAll();
    }

    @GetMapping("/Reservation/{id}")
    public Optional<MOReservation> getReservation(@PathVariable int id) {
        return repReservation.findById(id);
    }

    @PostMapping("/Reservation")
    public ResponseEntity<MOReservation> save(@RequestBody MOReservation reservation) {
        return ResponseEntity.ok(repReservation.save(reservation));
    }

}
