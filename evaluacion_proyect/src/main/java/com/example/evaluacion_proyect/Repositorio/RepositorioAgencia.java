package com.example.evaluacion_proyect.Repositorio;


import com.example.evaluacion_proyect.Entidad.agencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAgencia extends JpaRepository<agencia,String> {
}
