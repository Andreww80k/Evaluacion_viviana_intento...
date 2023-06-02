package com.example.evaluacion_proyect.Entidad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "oferta")
//Creamos la tabla dentro de la base de datos

public class oferta {

    @Id//LLave primaria
    @Column(length = 20)
    private Integer id;

    @Column(nullable = false,length = 50)
    private String nombre;

    @Column(nullable = false,length = 50)
    private String descripcion;


    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio;

    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;


    //Relacion
    @OneToMany(mappedBy = "oferta_rel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<empleabilidad> ofertas;



    public oferta() {
    }

    public oferta(Integer id, String nombre, String descripcion, Date fecha_inicio, Date fecha_fin, Set<oferta> ofertas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }



    @Override
    public String toString() {
        return "oferta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", ofertas=" + ofertas +
                '}';
    }
}
