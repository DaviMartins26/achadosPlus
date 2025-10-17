package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocoloRepository extends JpaRepository<Protocolo, Integer> {
    // Filtros devem ficar aqui no futuro? Ou tentar fazer via JS?
}
