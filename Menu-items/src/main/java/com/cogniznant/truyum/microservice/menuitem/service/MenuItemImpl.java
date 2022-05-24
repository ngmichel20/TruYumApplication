package com.cogniznant.truyum.microservice.menuitem.service;

import com.cogniznant.truyum.microservice.menuitem.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuItemImpl implements MenuItemService{


    @Override
    public List<MenuItem> getAllMenuItems() {
        List<MenuItem> listMenuItem = new ArrayList<>();
        MenuItem sandwich = new MenuItem(1, "Sandwich", 99, "Main Course",  true);
        MenuItem pizza = new MenuItem(2, "Pizza", 149, "Main Course",  false);
        MenuItem burger = new MenuItem(3, "Burger", 129, "Main Course",  false);
        listMenuItem.add(sandwich);
        listMenuItem.add(pizza);
        listMenuItem.add(burger);
        return listMenuItem;
    }
}
