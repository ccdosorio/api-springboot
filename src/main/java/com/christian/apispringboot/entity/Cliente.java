package com.christian.apispringboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes", schema = "db-market")
@Getter
@Setter
public class Cliente {

    @Id
    private String id;

    private String nombre;
    private String apellidos;
    private Long celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
