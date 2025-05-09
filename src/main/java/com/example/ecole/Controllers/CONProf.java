package com.example.ecole.Controllers;

import com.example.ecole.Model.MOProf;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecole.Services.SERProf;


@RestController
public class CONProf {

    @Autowired
    private SERProf repProf;

    @GetMapping("/prof")
    public List<MOProf> getProfList(){
        return repProf.getRepProfList();
    }

    @GetMapping("/prof/{id}")
    public Optional<MOProf> getProf(@PathVariable int id){
        return repProf.getRepProf(id);
    }


}
