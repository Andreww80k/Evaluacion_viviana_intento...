package com.example.evaluacion_proyect.Servicio;

import com.example.evaluacion_proyect.Entidad.aspirante;
import com.example.evaluacion_proyect.Entidad.oferta;
import com.example.evaluacion_proyect.Repositorio.RepositorioAspirante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioAspirante {



    private RepositorioAspirante repositorio;

    public ServicioAspirante(RepositorioAspirante repositorio){
        this.repositorio=repositorio;
    }



    public ArrayList<aspirante>ListarAspirante(){
        return (ArrayList<aspirante>)repositorio.findAll();
    }


    //Buscar Aspirante

    public  aspirante buscarAspirante(Integer id){
        if(repositorio.findById(id).isPresent())
            return repositorio.findById(id).get();
        else return null;
    }


    //Agregar

    public  String agregarAspirante(aspirante aspirante){
        if (repositorio.findById(aspirante.getCedulaAspirante()).isPresent())
            return "Este aspirante ya esta registrado";
        else{
            repositorio.save(aspirante);
            return "El aspirante se registro satisfactoriametn";
        }
    }


    //Actualizar:

    public String ActualizarAspirante(aspirante aspirante) {
        //Pregunta si existe
        if (repositorio.findById(aspirante.getCedulaAspirante()).isPresent()) {
            return "El aspirante se actualizo de forma exitosa";
        } else {
            return "El aspirante no se encuentra registrada actualmente";
        }
    }


    public String EliminarAspirantes(Integer id) {
        if (repositorio.findById(id).isPresent()) {
            repositorio.deleteById(id);
            return "ASPIRANTE ELIMINADO";

        } else {
            return "En este momento el Aspirante no se encuentra registrado";
        }

    }


}
