package com.cogniznant.truyum.microservice.menuitem.controller;

import com.cogniznant.truyum.microservice.menuitem.model.MenuItem;
import com.cogniznant.truyum.microservice.menuitem.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("${details.all.customer.url}")
    public ResponseEntity<List<MenuItem>> getListMenuItems(
            @RequestHeader(name = "Authorization", required = false) String bearerToken){

        List<MenuItem> menuItemList = this.menuItemService.getAllMenuItems();
        if(!menuItemList.isEmpty()){
            return ResponseEntity.ok(menuItemList);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
