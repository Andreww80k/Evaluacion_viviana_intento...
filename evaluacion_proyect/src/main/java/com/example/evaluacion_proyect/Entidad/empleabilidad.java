package com.example.evaluacion_proyect.Entidad;

import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "empleabilidad")

//Creamos la tabla dentro de la base de datos que vallamos a realizar
public class empleabilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleabilidad;

    @Column(length = 50)
    private Integer idAspirante;

    @Column(length = 50)
    private Integer IdOferta;


    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    //Relaciones:

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "cedulaAspirante",referencedColumnName = "cedulaAspirante",nullable = false)
    @JsonIgnore
    private aspirante rel_empleabilidad;



    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private oferta oferta_rel;


    public empleabilidad(Integer id_empleabilidad, Integer idAspirante, Integer idOferta, Date fecha, aspirante rel_empleabilidad, oferta oferta_rel) {
        this.id_empleabilidad = id_empleabilidad;
        this.idAspirante = idAspirante;
        IdOferta = idOferta;
        this.fecha = fecha;
        this.rel_empleabilidad = rel_empleabilidad;
        this.oferta_rel = oferta_rel;
    }

    public empleabilidad() {
    }

    public Integer getId_empleabilidad() {
        return id_empleabilidad;
    }

    public void setId_empleabilidad(Integer id_empleabilidad) {
        this.id_empleabilidad = id_empleabilidad;
    }

    public Integer getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(Integer idAspirante) {
        this.idAspirante = idAspirante;
    }

    public Integer getIdOferta() {
        return IdOferta;
    }

    public void setIdOferta(Integer idOferta) {
        IdOferta = idOferta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public aspirante getRel_empleabilidad() {
        return rel_empleabilidad;
    }

    public void setRel_empleabilidad(aspirante rel_empleabilidad) {
        this.rel_empleabilidad = rel_empleabilidad;
    }

    public oferta getOferta_rel() {
        return oferta_rel;
    }

    public void setOferta_rel(oferta oferta_rel) {
        this.oferta_rel = oferta_rel;
    }


    @Override
    public String toString() {
        return "empleabilidad{" +
                "id_empleabilidad=" + id_empleabilidad +
                ", idAspirante=" + idAspirante +
                ", IdOferta=" + IdOferta +
                ", fecha=" + fecha +
                ", rel_empleabilidad=" + rel_empleabilidad +
                ", oferta_rel=" + oferta_rel +
                '}';
    }
}
