package com.example.evaluacion_proyect.Repositorio;


import com.example.evaluacion_proyect.Entidad.empleabilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleabilidad extends JpaRepository<empleabilidad,Integer> {
}
