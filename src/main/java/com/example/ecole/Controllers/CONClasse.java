package com.example.ecole.Controllers;

import java.util.List;
import java.util.Optional;

import com.example.ecole.Services.*;
import com.example.ecole.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CONClasse {
    @Autowired
    private SERClasse serClasse;

    @GetMapping("/Classe")
    public List<MOClasse> getClasses() {
        return serClasse.findAll();
    }

    @GetMapping("/Classe/{id}")
    public Optional<MOClasse> getClass(@PathVariable int id) {
        return serClasse.findById(id);
    }


}
