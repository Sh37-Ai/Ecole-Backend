package com.example.ecole.Controllers;

import com.example.ecole.Services.*;
import com.example.ecole.Model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CONClasseprof {

    @Autowired
    private SERClasseProf serClasseprof;

    @GetMapping("Classeprof/{id}")
    public MOClasseProf getClasseprof(@PathVariable int id) {
        return serClasseprof.findById(id);

    }

    @GetMapping("Classeprof")
    public List<MOClasseProf> findAll() {
        return serClasseprof.findAll();
    }

    @PostMapping("Classeprof")
    public MOClasseProf save(@RequestBody MOClasseProf prof) {
        return serClasseprof.save(prof);
    }
}
