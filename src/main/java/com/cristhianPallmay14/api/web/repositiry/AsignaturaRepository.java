/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cristhianPallmay14.api.web.repositiry;

import com.cristhianPallmay14.api.web.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author educr
 */
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>{
     @Query(value = "Select * from asignatura a1 where a1.id_asignatura = :id_asignatura",nativeQuery = true)
     public Asignatura buscarAsignatura(Integer id_asignatura);
}
