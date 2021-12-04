package com.tnc.msscbeerservice.bootstrap;

import com.tnc.msscbeerservice.domain.Beer;
import com.tnc.msscbeerservice.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0543252345230";
    public static final String BEER_2_UPC = "9675976656346";
    public static final String BEER_3_UPC = "2357487698760";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {

        if (beerRepository.count() == 0) {
            loadBeerObjects();
        }
    }

    private void loadBeerObjects() {
        var b1 =Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle("IPA")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(BEER_1_UPC)
                .price(new BigDecimal("12.95"))
                .build();
       var b2 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle("PALE_ALE")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(BEER_2_UPC)
                .price(new BigDecimal("10.95"))
                .build();
       var b3 = Beer.builder()
                .beerName("Ursus")
                .beerStyle("ALE")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(BEER_3_UPC)
                .price(new BigDecimal("10.95"))
                .build();

        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);
    }
}
