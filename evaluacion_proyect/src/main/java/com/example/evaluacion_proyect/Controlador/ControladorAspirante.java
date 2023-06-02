package com.example.evaluacion_proyect.Controlador;


import com.example.evaluacion_proyect.Entidad.aspirante;
import com.example.evaluacion_proyect.Servicio.ServicioAgencia;
import com.example.evaluacion_proyect.Servicio.ServicioAspirante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorAspirante {

    //Instanciamos calse que es el mismo servicio



    private ServicioAspirante service;

    public ControladorAspirante(ServicioAspirante service){
        this.service=service;
    }


    //Crear la ruta y retornar a un arraylist


    @GetMapping("/ListarAspirante")
    public ArrayList<aspirante>ListarAspirante(){
        return service.ListarAspirante();
    }



    @GetMapping("/BuscarAspirante{id}")
    public aspirante BuscarAspirante(@PathVariable("id")Integer id){
        return service.buscarAspirante(id);
    }


    //Crear Metodo para Agregar:
    @PostMapping("/agregarAspirante")
    public String agregarAspirante(@RequestBody aspirante aspirante){
        return service.agregarAspirante(aspirante);
    }

    //Actualizar:

    @PutMapping("/ActualizarAspirante")
    public String ActualizarAspirantes(@RequestBody aspirante aspirante){
        return service.ActualizarAspirante(aspirante);
    }

    //Eliminar
    @DeleteMapping("/eliminarAspirante/{id}")
    public String eliminarAspirante(@PathVariable("id")Integer id){
        return service.EliminarAspirantes(id);
    }
}
