package com.tnc.msscbeerservice.web.controller;

import com.tnc.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.*;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto>getBeer(@PathVariable("beerId") UUID id){

        return new ResponseEntity<>(BeerDto.builder().build(), OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto>saveBeer(@RequestBody BeerDto beerDto){
        return new ResponseEntity<>(CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto>updateBeer(@PathVariable("beerId") UUID id, @RequestBody BeerDto beerDto)
    {
        return new ResponseEntity<>(NO_CONTENT);
    }
}
