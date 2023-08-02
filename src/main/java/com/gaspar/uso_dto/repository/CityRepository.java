package com.gaspar.uso_dto.repository;

import com.gaspar.uso_dto.dto.CityDto;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gaspar.uso_dto.entity.City;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    @Query("""
            SELECT new com.gaspar.uso_dto.dto.CityDto(c.id,c.name,c.country) FROM City c
            """
    )
    List<CityDto> findAllDtos();
}
