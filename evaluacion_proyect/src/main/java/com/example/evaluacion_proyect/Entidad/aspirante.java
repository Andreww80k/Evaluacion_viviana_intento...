package com.example.evaluacion_proyect.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "aspirante")
public class aspirante {

    @Id
    @Column(length = 15)
    private  Integer cedulaAspirante;

    @Column(nullable = false,length = 50)
    private String nombre_aspirante;


    @Column(length = 2)
    private String edad;


    @Column(length = 15)
    private String genero;

    @Column(length = 50)
    private String codigo_profesion;

    @Column(length = 11)
    private String id_agencia;


    //Relacion
   @ManyToOne(fetch = FetchType.LAZY,optional = false)
   @JoinColumn(name = "idProfesion",referencedColumnName = "idProfesion",nullable = false)
   @JsonIgnore
   private profesion profesion;



    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "nit",referencedColumnName = "nit",nullable = false)
    @JsonIgnore
    private agencia agencias;


    @OneToMany(mappedBy = "rel_empleabilidad",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<empleabilidad>empleabilidad;



    public aspirante() {
    }

    public aspirante(Integer cedulaAspirante, String nombre_aspirante, String edad, String genero, String codigo_profesion, String id_agencia, com.example.evaluacion_proyect.Entidad.profesion profesion, com.example.evaluacion_proyect.Entidad.agencia agencia, Set<com.example.evaluacion_proyect.Entidad.empleabilidad> empleabilidad) {
        this.cedulaAspirante = cedulaAspirante;
        this.nombre_aspirante = nombre_aspirante;
        this.edad = edad;
        this.genero = genero;
        this.codigo_profesion = codigo_profesion;
        this.id_agencia = id_agencia;
        this.profesion = profesion;
        this.agencias = agencia;
        this.empleabilidad = empleabilidad;
    }

    public Integer getCedulaAspirante() {
        return cedulaAspirante;
    }

    public void setCedulaAspirante(Integer cedulaAspirante) {
        this.cedulaAspirante = cedulaAspirante;
    }

    public String getNombre_aspirante() {
        return nombre_aspirante;
    }

    public void setNombre_aspirante(String nombre_aspirante) {
        this.nombre_aspirante = nombre_aspirante;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigo_profesion() {
        return codigo_profesion;
    }

    public void setCodigo_profesion(String codigo_profesion) {
        this.codigo_profesion = codigo_profesion;
    }

    public String getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }

    public com.example.evaluacion_proyect.Entidad.profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(com.example.evaluacion_proyect.Entidad.profesion profesion) {
        this.profesion = profesion;
    }

    public com.example.evaluacion_proyect.Entidad.agencia getAgencia() {
        return agencias;
    }

    public void setAgencia(com.example.evaluacion_proyect.Entidad.agencia agencia) {
        this.agencias = agencia;
    }

    public Set<com.example.evaluacion_proyect.Entidad.empleabilidad> getEmpleabilidad() {
        return empleabilidad;
    }

    public void setEmpleabilidad(Set<com.example.evaluacion_proyect.Entidad.empleabilidad> empleabilidad) {
        this.empleabilidad = empleabilidad;
    }

    @Override
    public String toString() {
        return "aspirante{" +
                "cedulaAspirante=" + cedulaAspirante +
                ", nombre_aspirante='" + nombre_aspirante + '\'' +
                ", edad='" + edad + '\'' +
                ", genero='" + genero + '\'' +
                ", codigo_profesion='" + codigo_profesion + '\'' +
                ", id_agencia='" + id_agencia + '\'' +
                ", profesion=" + profesion +
                ", agencia=" + agencias +
                ", empleabilidad=" + empleabilidad +
                '}';
    }
}
