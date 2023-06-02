package com.example.evaluacion_proyect.Controlador;


import com.example.evaluacion_proyect.Entidad.agencia;
import com.example.evaluacion_proyect.Servicio.ServicioAgencia;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorAgencia {


    //Insanciamos clase que es el mismo servicio


    private ServicioAgencia service;

    public ControladorAgencia(ServicioAgencia service){
        this.service=service;
    }


    //Crear la ruta y retornar a un arraylist


    @GetMapping("/ListarAgencia")
    public ArrayList<agencia>ListarAge(){
        return service.ListarAgencia();
    }





    //Crear el metodo de controlador para buscar la agencia:

    @GetMapping("/BuscarAgencia nombre")
    public agencia BuscarAgencia(@PathVariable("nombre")String nombre){
        return service.buscarAgencia(nombre);
    }

    //Crear metodo para agregar:
    @PostMapping("/agregarAgencia")
    public String agregarAgencia(@RequestBody agencia agencia) {
        return service.agregarAgencia(agencia);
    }
    //Metodo para Actualizar con Put

    @PutMapping("/actualizarAgencia")
    public String actualizarAgencia(@RequestBody agencia agencia){
        return service.actualizarAgencia(agencia);

    }

    //Metodo para Eliminar
    @DeleteMapping("/eliminarAgencia/{id}")
    public String eliminarAgencia(@PathVariable("id")String nombre){
        return  service.eliminarAgencia(nombre);
    }



}
