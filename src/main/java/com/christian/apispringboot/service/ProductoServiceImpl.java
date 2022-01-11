package com.christian.apispringboot.service;

import com.christian.apispringboot.entity.Producto;
import com.christian.apispringboot.repository.ProductoCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{
    private ProductoCrudRepository productoCrudRepository;

    @Override
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    @Override
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    @Override
    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
}
