package com.example.ecole.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ecole.Model.MOProf;

import java.util.List;


@Repository
public interface REPProf extends JpaRepository<MOProf, Integer> {

}
