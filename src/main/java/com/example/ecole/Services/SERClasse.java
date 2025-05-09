package com.example.ecole.Services;

import com.example.ecole.Repository.REPClasse;
import com.example.ecole.Model.MOClasse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SERClasse {

    @Autowired
    private REPClasse repClasse;

    public SERClasse(REPClasse repClasse) {
        this.repClasse = repClasse;
    }

    public Optional<MOClasse> findById(int id) {
        return repClasse.findById(id);
    }

    public List<MOClasse> findAll() {
        return repClasse.findAll();
    }

    public void save(MOClasse moClasse) {
        repClasse.save(moClasse);
    }
    public void delete(MOClasse moClasse) {
        repClasse.delete(moClasse);
    }

    public int getnb_elevesById(int id) {
        Optional<MOClasse> classeOpt = repClasse.findById(id);
        if (classeOpt.isPresent()) {
            MOClasse classe = classeOpt.get();
            return classe.getNombreEleves();
        } else {
            throw new EntityNotFoundException("Classe non trouvée avec l'id : " + id);
        }
    }

}
