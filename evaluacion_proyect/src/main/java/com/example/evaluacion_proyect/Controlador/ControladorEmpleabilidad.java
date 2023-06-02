package com.example.evaluacion_proyect.Controlador;


import com.example.evaluacion_proyect.Entidad.empleabilidad;
import com.example.evaluacion_proyect.Servicio.ServicioEmpleabilidad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorEmpleabilidad {


    private ServicioEmpleabilidad service;

    public ControladorEmpleabilidad(ServicioEmpleabilidad service){
        this.service=service;
    }
    @GetMapping("/ListarEmpleabilidad")
    public ArrayList<empleabilidad> listarCli() {
        return service.listarEmpleabilidad();
    }




}
