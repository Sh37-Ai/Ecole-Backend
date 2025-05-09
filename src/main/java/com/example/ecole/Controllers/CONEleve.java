package com.example.ecole.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.ecole.Services.*;
import com.example.ecole.Model.MOEleve;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CONEleve {

    @Autowired
    private SEREleve repEleve;

    @GetMapping("/eleves/{id}")
    public MOEleve findById(@PathVariable Integer id) {
        return repEleve.getMOEleveById(id);

    }

    @GetMapping("/eleves")
    public ResponseEntity<List<MOEleve>> findAll() {
        List<MOEleve> eleves = repEleve.getMOEleve();
        return new ResponseEntity<>(eleves, HttpStatus.OK);
    }

    @DeleteMapping("/eleves/{id}")
    public void delete(@PathVariable Integer id) {
        repEleve.deleteMOEleve(id);

    }

    @PutMapping("/eleves/{id}")
    public MOEleve update(@PathVariable Integer id, @RequestBody MOEleve me) {
        return repEleve.updateMOEleve(me,id);
    }

    @PostMapping("/eleves")
    public MOEleve create(@RequestBody MOEleve me) {
        return repEleve.createMOEleve(me) ;
    }



}
