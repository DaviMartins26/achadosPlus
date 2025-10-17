package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Integer> {
}
