/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristhianPallmay14.api.web.controller;

import com.cristhianPallmay14.api.web.entity.Asignatura;
import com.cristhianPallmay14.api.web.service.AsignaturaServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author educr
 */

@RestController
@RequestMapping("/api")
public class ControllerAsignatura {
    
    @Autowired
    AsignaturaServiceImpl asignaturaServiceImpl;
    
    @GetMapping("/listaA")
    public ResponseEntity<List<Asignatura>> obtenerLista(){
        return new ResponseEntity<>(asignaturaServiceImpl.findByAll(),HttpStatus.OK);
    }
    
    @PostMapping("/crearA")
    public ResponseEntity<Asignatura> crear(@RequestBody Asignatura a){
        return new ResponseEntity<>(asignaturaServiceImpl.save(a),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminarA")
    public void eliminar(@PathVariable Integer id){
        asignaturaServiceImpl.delete(id);
    }
    
    @PutMapping("/modificarA/(id)")
    public ResponseEntity<Asignatura> update(@PathVariable Integer id,@RequestBody Asignatura a){
        if (asignaturaServiceImpl.findById(id)==null) {
            return ResponseEntity.notFound().build();
        }
        
        a.setNombre(a.getNombre());
        a.setCarrera(a.getCarrera());
        a.setHora_f(a.getHora_f());
        a.setHora_h(a.getHora_h());
        Asignatura newObject = asignaturaServiceImpl.save(a);
        return ResponseEntity.ok(newObject);
    }
}
