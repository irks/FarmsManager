package com.farmsmanager.controller;

import com.farmsmanager.domain.Field;
import com.farmsmanager.services.IFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FieldController {

    @Autowired
    IFieldService fieldService;

    @RequestMapping(value = "/fields", method = RequestMethod.GET)
    public List<Field> findFields() {
        List<Field> fields = fieldService.findAll();
        return fields;
    }
} 

