package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocoloRepository extends JpaRepository<Protocolo, Integer> {
    // Aqui você pode colocar filtros específicos no futuro
}
