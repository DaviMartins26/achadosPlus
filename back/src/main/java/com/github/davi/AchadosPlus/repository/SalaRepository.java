package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer> {
    List<Sala> findByBlocoIdBloco(Integer idBloco);
}
