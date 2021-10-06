package com.nahuel.apitesting.services;

import com.nahuel.apitesting.entities.Ubicacion;
import com.nahuel.apitesting.repositories.BaseRepository;
import com.nahuel.apitesting.repositories.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionServiceImpl extends BaseServiceImpl<Ubicacion, Long> implements UbicacionService{

    @Autowired
    public UbicacionRepository ubicacionRepository;

    public UbicacionServiceImpl(BaseRepository<Ubicacion, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Ubicacion> search(String filtro) throws Exception {
        try {
            List<Ubicacion> localidades = ubicacionRepository.searchNativo(filtro);
            return localidades;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
