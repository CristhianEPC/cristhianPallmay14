/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristhianPallmay14.api.web.controller;

import com.cristhianPallmay14.api.web.entity.Docente;
import com.cristhianPallmay14.api.web.service.DocenteServiceImpl;
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
public class ControllerDocente {
    
    @Autowired
    DocenteServiceImpl docenteServiceImpl;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Docente>> obtenerLista(){
        return new ResponseEntity<>(docenteServiceImpl.findByAll(),HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Docente> crear(@RequestBody Docente d){
        return new ResponseEntity<>(docenteServiceImpl.save(d),HttpStatus.CREATED);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@PathVariable Integer id){
        docenteServiceImpl.delete(id);
    }
    
    @PutMapping("/modificar/(id)")
    public ResponseEntity<Docente> update(@PathVariable Integer id,@RequestBody Docente d){
        if (docenteServiceImpl.findById(id)==null) {
            return ResponseEntity.notFound().build();
        }
        d.setNombre(d.getNombre());
        d.setApellido(d.getApellido());
        d.setCelular(d.getCelular());
        d.setEmail(d.getEmail());
        Docente newObjetc = docenteServiceImpl.save(d);
        return ResponseEntity.ok(newObjetc);
    }
}
