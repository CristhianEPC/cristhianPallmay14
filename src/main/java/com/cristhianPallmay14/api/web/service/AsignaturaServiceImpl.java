/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristhianPallmay14.api.web.service;

import com.cristhianPallmay14.api.web.entity.Asignatura;
import com.cristhianPallmay14.api.web.repositiry.AsignaturaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author educr
 */
@Service
public class AsignaturaServiceImpl extends GeneriServiceImpl<Asignatura, Integer>{
    
    @Autowired
    AsignaturaRepository asignaturaRepository;

    @Override
    public CrudRepository<Asignatura, Integer> getDao() {
        return asignaturaRepository;
    }
    
    public Asignatura buscarAsignatura(Integer id){
        return asignaturaRepository.buscarAsignatura(id);
    }
    
}
