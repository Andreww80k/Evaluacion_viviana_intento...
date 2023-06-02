package com.example.evaluacion_proyect.Entidad;

import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="profesion")


public class profesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProfesion;

    @Column(nullable = false,length = 50)
    private String nombre;


    @OneToMany(mappedBy = "profesion",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<aspirante>aspirantes;





    public profesion() {
    }

    public profesion(Integer idProfesion, String nombre, Set<aspirante> aspirantes) {
        this.idProfesion = idProfesion;
        this.nombre = nombre;
        this.aspirantes = aspirantes;
    }


    public Integer getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(Integer idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<aspirante> getAspirantes() {
        return aspirantes;
    }

    public void setAspirantes(Set<aspirante> aspirantes) {
        this.aspirantes = aspirantes;
    }

    @Override
    public String toString() {
        return "profesion{" +
                "idProfesion=" + idProfesion +
                ", nombre='" + nombre + '\'' +
                ", aspirantes=" + aspirantes +
                '}';
    }
}



