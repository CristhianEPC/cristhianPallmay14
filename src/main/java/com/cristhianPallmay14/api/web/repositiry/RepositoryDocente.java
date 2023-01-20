/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cristhianPallmay14.api.web.repositiry;

import com.cristhianPallmay14.api.web.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author educr
 */
public interface RepositoryDocente extends JpaRepository<Docente, Integer>{
    @Query(value = "Select * from docente d where d.id_docente = :id_docente",nativeQuery = true)
    public Docente buscarDocente(Integer id);
}
