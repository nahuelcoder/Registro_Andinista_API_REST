package com.nahuel.apitesting.repositories;

import com.nahuel.apitesting.entities.Montaña;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MontañaRepository extends BaseRepository<Montaña, Long> {

    @Query(
            value = "SELECT * FROM montaña WHERE montaña.nombre LIKE %:filtro%",
            nativeQuery = true
    )
    List<Montaña> searchNativo(@Param("filtro") String filtro);

}
