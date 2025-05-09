package com.example.ecole.Repository;

import com.example.ecole.Model.MOClasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface REPClasse extends JpaRepository<MOClasse, Integer> {
}
