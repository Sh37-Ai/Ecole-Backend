package com.example.ecole.Repository;

import com.example.ecole.Model.MOEleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface REPEleve extends JpaRepository<MOEleve, Integer> {
}
