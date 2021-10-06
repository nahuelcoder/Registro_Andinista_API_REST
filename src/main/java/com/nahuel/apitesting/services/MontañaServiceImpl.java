package com.nahuel.apitesting.services;

import com.nahuel.apitesting.entities.Montaña;
import com.nahuel.apitesting.repositories.BaseRepository;
import com.nahuel.apitesting.repositories.MontañaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MontañaServiceImpl extends BaseServiceImpl<Montaña, Long> implements MontañaService {

    @Autowired
    public MontañaRepository montañaRepository;

    public MontañaServiceImpl(BaseRepository<Montaña, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Montaña> search(String filtro) throws Exception {
        try {
            List<Montaña> personas = montañaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
