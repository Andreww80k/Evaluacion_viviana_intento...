package com.example.evaluacion_proyect.Servicio;


import com.example.evaluacion_proyect.Entidad.empleabilidad;
import com.example.evaluacion_proyect.Entidad.oferta;
import com.example.evaluacion_proyect.Repositorio.RepositorioEmpleabilidad;
import com.example.evaluacion_proyect.Repositorio.RepositorioOfertas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

@Service
public class ServicioEmpleabilidad {




    private  RepositorioEmpleabilidad repositorio;

    //llamamos al repositorio  de ofertas;


    private RepositorioOfertas oferRepo;



    //Constructor


    public ServicioEmpleabilidad(RepositorioEmpleabilidad repositorio, RepositorioOfertas oferRepo) {
        this.repositorio = repositorio;
        this.oferRepo = oferRepo;
    }

    public ArrayList<empleabilidad>listarEmpleabilidad(){
        return (ArrayList<empleabilidad>) repositorio.findAll();
    }




    //Metodo para agregar:


    public String AgregarEmpleabilidad(empleabilidad empleabilidad){
        //Preguntan si existe

        if (repositorio.findById(empleabilidad.getId_empleabilidad()).isPresent())
            return "El empleado ya esta registrado";

        else {
            repositorio.save(empleabilidad);
            return "El empleado se registro satisfactoriamente";
        }





    }















}
