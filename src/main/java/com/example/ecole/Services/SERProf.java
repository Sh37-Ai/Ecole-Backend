package com.example.ecole.Services;


import com.example.ecole.Model.MOProf;
import com.example.ecole.Repository.REPProf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class SERProf {

    @Autowired
    private REPProf repProf;

    public Optional<MOProf> getRepProf(int id) {
        return repProf.findById(id) ;
    }



    public void setRepProf(REPProf repProf) {
        this.repProf = repProf;
    }

    public List<MOProf> getRepProfList(){
        return repProf.findAll();
    }


}
