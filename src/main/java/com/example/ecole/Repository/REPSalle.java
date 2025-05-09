package com.example.ecole.Repository;


import com.example.ecole.Model.MOProf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ecole.Model.MOSalle;

import java.util.List;

@Repository
public interface REPSalle extends JpaRepository<MOProf, Integer> {
}
