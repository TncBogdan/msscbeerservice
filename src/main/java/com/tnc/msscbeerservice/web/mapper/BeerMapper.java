package com.tnc.msscbeerservice.web.mapper;

import com.tnc.msscbeerservice.domain.Beer;
import com.tnc.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
