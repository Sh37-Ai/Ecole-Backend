package com.example.ecole.Services;

import com.example.ecole.Repository.REPEleve;
import com.example.ecole.Model.MOEleve;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SEREleve {

    @Autowired
    private REPEleve repEleve;

    public List<MOEleve> getMOEleve() {
        return repEleve.findAll();
    }

    public MOEleve getMOEleveById(Integer id) {
        return repEleve.findById(id).orElse(null);
    }

    public MOEleve createMOEleve(MOEleve me) {
        return repEleve.save(me);
    }

    public MOEleve updateMOEleve(MOEleve me, Integer id) {
        MOEleve m = getMOEleveById(id);

        if (me.getAdresse() != null) {
            m.setAdresse(me.getAdresse());
        }
        if (me.getNom() != null) {
            m.setNom(me.getNom());
        }
        if (me.getPrenom() != null) {
            m.setPrenom(me.getPrenom());
        }
        if (me.getTelephone() != null) {
            m.setTelephone(me.getTelephone());
        }
        if (me.getClasse() != null) {
            m.setClasse(me.getClasse());
        }

        return repEleve.save(m);
    }


    public void deleteMOEleve(Integer id) {
        MOEleve me = repEleve.findById(id).orElse(null);
        repEleve.delete(me);
    }

}
