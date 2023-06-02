package com.example.evaluacion_proyect.Repositorio;

import com.example.evaluacion_proyect.Entidad.aspirante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioAspirante extends JpaRepository<aspirante,Integer> {
}
