package com.example.evaluacion_proyect.Repositorio;


import com.example.evaluacion_proyect.Entidad.oferta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioOfertas extends JpaRepository<oferta,Integer> {
}
