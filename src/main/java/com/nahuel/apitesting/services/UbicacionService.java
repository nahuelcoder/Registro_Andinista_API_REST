package com.nahuel.apitesting.services;

import com.nahuel.apitesting.entities.Ubicacion;

import java.util.List;

public interface UbicacionService extends BaseService<Ubicacion, Long>{

    List<Ubicacion> search(String filtro) throws Exception;

}
