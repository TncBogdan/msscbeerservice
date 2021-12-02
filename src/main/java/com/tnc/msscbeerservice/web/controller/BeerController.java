package com.tnc.msscbeerservice.web.controller;

import com.tnc.msscbeerservice.service.BeerService;
import com.tnc.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

import static org.springframework.http.HttpStatus.*;

@RequestMapping("api/v1/beer")
@RestController
@RequiredArgsConstructor
public class BeerController {

    private BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID id){

        return ResponseEntity.ok(beerService.getById(id));
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveBeer(@Validated @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto>updateBeer(@Validated @PathVariable("beerId") UUID id, @RequestBody BeerDto beerDto)
    {
        return new ResponseEntity<>(beerService.updateBeer(id, beerDto), NO_CONTENT);
    }
}
