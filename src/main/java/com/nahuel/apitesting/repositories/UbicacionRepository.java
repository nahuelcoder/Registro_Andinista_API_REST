package com.nahuel.apitesting.repositories;

import com.nahuel.apitesting.entities.Ubicacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UbicacionRepository extends BaseRepository<Ubicacion, Long>{

    @Query(
            value = "SELECT * FROM ubicacion WHERE ubicacion.ubicacion LIKE %:filtro%",
            nativeQuery = true
    )
    List<Ubicacion> searchNativo(@Param("filtro") String filtro);

}
