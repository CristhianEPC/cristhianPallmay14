/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristhianPallmay14.api.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author educr
 */

@Entity
@Table(name = "asignatura")
@Getter
@Setter
public class Asignatura {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Integer id_asig;
    
    @ManyToOne
    @JoinColumn(name="id_docente",referencedColumnName = "id_docente" )
    private Docente docente;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "carrera")
    private String carrera;
    
    @Column(name = "hora_h")
    private String hora_h;
    
    @Column(name = "hora_f")
    private String hora_f;
}
