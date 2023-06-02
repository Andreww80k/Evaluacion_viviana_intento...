package com.example.evaluacion_proyect.Entidad;

import jakarta.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="agencia")
public class agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Generar los valores
    private Integer nit;

    @Column(nullable = false,length = 50)
    private String nombre_agencia;

    @Column(length = 10)
    private String telefono_agencia;

    @Column(length = 50)
    private String direccion_agencia;


    //Relacion
    @OneToMany(mappedBy = "agencias",cascade = CascadeType.ALL,fetch = FetchType.LAZY)//"estudiante(llave foranea)", es para realizar lo que son las relaciones de uno a muchos
    private Set<aspirante> aspirantes ;
    //Relacion ahora si


    public agencia(){

    }

    public agencia(Integer nit, String nombre_agencia, String telefono_agencia, String direccion_agencia, Set<aspirante> aspirantes) {
        this.nit = nit;
        this.nombre_agencia = nombre_agencia;
        this.telefono_agencia = telefono_agencia;
        this.direccion_agencia = direccion_agencia;
        this.aspirantes = aspirantes;
    }


    public Integer getNit() {
        return nit;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    public String getTelefono_agencia() {
        return telefono_agencia;
    }

    public void setTelefono_agencia(String telefono_agencia) {
        this.telefono_agencia = telefono_agencia;
    }

    public String getDireccion_agencia() {
        return direccion_agencia;
    }

    public void setDireccion_agencia(String direccion_agencia) {
        this.direccion_agencia = direccion_agencia;
    }

    public Set<aspirante> getAspirantes() {
        return aspirantes;
    }

    public void setAspirantes(Set<aspirante> aspirantes) {
        this.aspirantes = aspirantes;
    }

    @Override
    public String toString() {
        return "agencia{" +
                "nit=" + nit +
                ", nombre_agencia='" + nombre_agencia + '\'' +
                ", telefono_agencia='" + telefono_agencia + '\'' +
                ", direccion_agencia='" + direccion_agencia + '\'' +
                ", aspirantes=" + aspirantes +
                '}';
    }
}
