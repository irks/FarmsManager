package com.farmsmanager.services;

import com.farmsmanager.domain.Field;
import com.farmsmanager.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService implements IFieldService {

    @Autowired
    FieldRepository fieldRepository;

    @Override
    public List<Field> findAll() {
        List<Field> fields = fieldRepository.findAll();
        return fields;
    }
}

