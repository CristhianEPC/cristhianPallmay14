/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristhianPallmay14.api.web.service;

import com.cristhianPallmay14.api.web.entity.Docente;
import com.cristhianPallmay14.api.web.repositiry.RepositoryDocente;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author educr
 */

@Service
public class DocenteServiceImpl extends GeneriServiceImpl<Docente, Integer>{
    @Autowired
    RepositoryDocente repositoryDocente;

    @Override
    public CrudRepository<Docente, Integer> getDao() {
        return repositoryDocente;
    }
    
    public Docente buscarDocente(Integer id){
        return repositoryDocente.buscarDocente(id);
    }
}
