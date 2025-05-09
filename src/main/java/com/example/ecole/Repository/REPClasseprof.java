package com.example.ecole.Repository;


import com.example.ecole.Model.MOClasseProf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REPClasseprof extends JpaRepository<MOClasseProf, Integer> {
}
