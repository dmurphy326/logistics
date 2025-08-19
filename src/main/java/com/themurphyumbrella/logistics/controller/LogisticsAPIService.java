package com.themurphyumbrella.logistics.controller;

import com.themurphyumbrella.logistics.model.Item;
import com.themurphyumbrella.logistics.model.Location;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logistic")
public class LogisticsAPIService {
    Item item;
    Location location;

    @GetMapping("{item}")
    public Item getItem(String itemId) {
        return item;
    }

    @GetMapping("{locationId}")
    public Location getLocation(String locationId) {
        return location;
    }

    @PostMapping("/createItem")
    public String createItem(@RequestBody Item item) {
        this.item = item;
        return "Success";
    }

    @PutMapping("/updateItem")
    public String updateItem(@RequestBody Item item) {
        this.item = item;
        return "Success";
    }

    @PostMapping("/createLocation")
    public String createLocation(@RequestBody Location location) {
        this.location = location;
        return "Success";
    }

    @PutMapping("/updateLocation")
    public String updateLocation(@RequestBody Location location) {
        this.location = location;
        return "Success";
    }
}
