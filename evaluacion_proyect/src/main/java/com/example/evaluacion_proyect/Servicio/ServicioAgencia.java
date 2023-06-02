package com.example.evaluacion_proyect.Servicio;


import com.example.evaluacion_proyect.Entidad.agencia;
import com.example.evaluacion_proyect.Repositorio.RepositorioAgencia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioAgencia {
    //Repositorio como atributo

    private RepositorioAgencia repositorio;

    public ServicioAgencia(RepositorioAgencia repositorio){
        this.repositorio=repositorio;
    }

    public ArrayList<agencia>ListarAgencia(){
        return (ArrayList<agencia>) repositorio.findAll();
    }



    //Buscar Agencia por jpa

    public agencia buscarAgencia(String nombre){
        if (repositorio.findById(nombre).isPresent());
        if (repositorio.findById(nombre).isPresent())
            return repositorio.findById(nombre).get();

        else return null;
    }



    //Metodo de agregar Agencia

    public String agregarAgencia(agencia agencia) {
        //Pregunta si existen:

        if (repositorio.findById(agencia.getNombre_agencia()).isPresent()) {
            return "La agencia ya estaba registrada";
        } else {
            repositorio.save(agencia);
            return "La agencia se resgistro satisfactoriamente";
        }


    }
        //Metodo de actualizar;
        public String actualizarAgencia(agencia agencia ) {


            if (repositorio.findById(agencia.getNombre_agencia()).isPresent()){
                repositorio.save(agencia);
                return "El cliente se actualizo de forma exitosa";
            }
            else{
                return "El cliente no se encuentra registrado actualemente";
            }
        }

        //Para eliminar una agencia

    public String eliminarAgencia( String nombre){
        if (repositorio.findById(nombre).isPresent()){
            repositorio.deleteById(nombre);
            return "El cliente ha sido Eliminado";
        }
        else {
            return "Ahora el Cliente no se encuentra registrado";
        }
    }


    }


