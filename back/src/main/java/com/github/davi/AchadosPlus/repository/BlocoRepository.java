package com.github.davi.AchadosPlus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.davi.AchadosPlus.Model.Entity.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Integer> {

}
