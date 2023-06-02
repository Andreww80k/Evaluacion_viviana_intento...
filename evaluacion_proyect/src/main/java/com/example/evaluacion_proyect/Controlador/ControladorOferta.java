package com.example.evaluacion_proyect.Controlador;


import com.example.evaluacion_proyect.Entidad.oferta;
import com.example.evaluacion_proyect.Servicio.ServicioOferta;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControladorOferta {


    private ServicioOferta service;

    public ControladorOferta(ServicioOferta service){
        this.service=service;
    }



    //Crear una ruta que retorne un arraylist

    @GetMapping("/ListarOfertas")
    public ArrayList<oferta>listarOferta(){
        return service.listarOferta();
    }


    //Metodo de agregar:

    @PostMapping("/agregarOfertas")
    public String agregarOfertas(@RequestBody oferta oferta){
        return service.agregarOferta(oferta);
    }



    //Metodo de actualizar:

    @PutMapping("/actualizarOfertas")
    public String actualizarOfertas(@RequestBody oferta  oferta){
        return  service.ActualizarOferta(oferta);
    }


    //Metodo de eliminar:

    @DeleteMapping("/eliminarOfertas/{id}")
    public String eliminarOfertas(@PathVariable("id")Integer id){
        return service.Eliminaroferta(id);
    }
}
