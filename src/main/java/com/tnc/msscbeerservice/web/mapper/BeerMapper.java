package com.tnc.msscbeerservice.web.mapper;

import com.tnc.msscbeerservice.domain.Beer;
import com.tnc.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToDto(Beer beer);

    Beer dtoToBeer(BeerDto beerDto);
}
