package com.gmail.malikchettih.rd.springbootmicroservices.edgeservice.client;

import com.gmail.malikchettih.rd.springbootmicroservices.edgeservice.data.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.hateoas.Resources;

@FeignClient("beer-catalog-service")
public interface BeerClient {

    @GetMapping("/beers")
    Resources<Beer> readBeers();
}
