package com.nahuel.apitesting.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "montaña")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Montaña extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "altura")
    private int altura;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_ubicacion")
    private Ubicacion ubicacion;

}
