package com.example.ecole.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecole.Repository.REPClasseprof;
import com.example.ecole.Model.MOClasseProf;

import java.util.List;


@Service
public class SERClasseProf {

    @Autowired
    private REPClasseprof repClasseprof;

    public MOClasseProf findById(int id) {
        return repClasseprof.findById(id).orElse(null);
    }
    public List<MOClasseProf> findAll() {
        return repClasseprof.findAll();
    }

}
