package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
