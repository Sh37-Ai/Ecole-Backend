package com.example.ecole.Controllers;

import com.example.ecole.Model.*;
import java.util.List;
import java.util.Optional;

import com.example.ecole.Repository.REPProf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecole.Services.SERProf;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CONSalle {

    @Autowired
    private REPProf repSalle;

    @GetMapping("/Salle")
    public List<MOProf> findAll() {
        return repSalle.findAll();
    }

    @GetMapping("/Salle/{id}")
    public Optional<MOProf> findById(@PathVariable Integer id) {
        return repSalle.findById(id);
    }


}
