package com.example.evaluacion_proyect.Servicio;


import com.example.evaluacion_proyect.Entidad.oferta;
import com.example.evaluacion_proyect.Repositorio.RepositorioOfertas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioOferta {
    //Repositorio como atributo



    private RepositorioOfertas repositorio;


    public ServicioOferta(RepositorioOfertas repositorio){
        this.repositorio=repositorio;
    }


    public ArrayList<oferta> listarOferta(){
        return (ArrayList<oferta>)repositorio.findAll();

    }


    //Buscar Oferta por Jpa

    public oferta buscarOferta(Integer id){
        if (repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();
        else return null;
    }

    //Agregar
    public String agregarOferta(oferta oferta){
        if (repositorio.findById(oferta.getId()).isPresent())
            return "ESSTA OFERTA YA ESTA REGISTRADA ";

        else {
            repositorio.save(oferta);
            return "LA OFERTA SE HA REGISTRADO SATISFACTORIAMENTE";
        }
    }
    public String ActualizarOferta(oferta oferta) {
        //Pregunta si existe
        if (repositorio.findById(oferta.getId()).isPresent()) {
            return "La oferta se actualizo de forma exitosa";
        } else {
            return "La oferta no se encuentra registrada actualmente";
        }
    }

    public String Eliminaroferta(Integer id) {
        if (repositorio.findById(id).isPresent()) {
            repositorio.deleteById(id);
            return "OFERTA ELIMINADA";

        } else {
            return "En este momento la oferta no se encuentra registrada";
        }

    }





}
