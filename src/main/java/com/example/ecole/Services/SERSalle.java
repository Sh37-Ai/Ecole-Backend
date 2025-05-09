package com.example.ecole.Services;


import com.example.ecole.Model.MOProf;
import org.springframework.stereotype.Repository;

import com.example.ecole.Repository.REPSalle;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Repository
public class SERSalle {

    @Autowired
    private REPSalle repSalle;

    public List<MOProf> findAll() {
        return repSalle.findAll();
    }

    public Optional<MOProf> findById(Integer id) {
        return repSalle.findById(id);
    }

}
