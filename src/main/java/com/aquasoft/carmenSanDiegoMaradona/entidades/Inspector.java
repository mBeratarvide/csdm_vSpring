package com.aquasoft.carmenSanDiegoMaradona.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inspector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInspector;


}
