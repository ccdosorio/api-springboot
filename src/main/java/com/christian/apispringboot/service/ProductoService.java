package com.christian.apispringboot.service;

import com.christian.apispringboot.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> getAll();

    List<Producto> getByCategoria(int idCategoria);

    Optional<List<Producto>> getEscasos(int cantidad);
}
