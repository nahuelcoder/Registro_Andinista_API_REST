package com.nahuel.apitesting.services;

import com.nahuel.apitesting.entities.Montaña;

import java.util.List;

public interface MontañaService extends BaseService<Montaña, Long>{

    List<Montaña> search(String filtro) throws Exception;

}
