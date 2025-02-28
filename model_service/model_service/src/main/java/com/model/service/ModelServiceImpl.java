package com.model.service;
import com.model.entity.Model;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;
@Service
public class ModelServiceImpl implements ModelService{

    List<Model> list=List.of(
            new Model(200L,"SAFARI","PETROL",500L),
            new Model(201L,"NEXON","DIESEL",500L),
            new Model(202L,"TIGOR","CNG",500L),
            new Model(203L,"CURVV","PETROL",500L),
            new Model(204L,"FORTUNER","PETROL",501L),
            new Model(205L,"CAMRY","PETROL",501L),
            new Model(206L,"GLANZA","DIESEL",501L),
            new Model(207L,"FIESTA","PETROL",502L),
            new Model(208L,"MUSTANG","PETROL",502L),
            new Model(209L,"ENDEAVOUR","PETROL",502L),
            new Model(210L,"ECOSPORT","PETROL",502L),
            new Model(211L,"X7","PETROL",503L),
            new Model(212L,"I7","PETROL",503L),
            new Model(213L,"3 SERIES","DIESEL",503L),
            new Model(214L,"7 SERIES","PETROL",503L),
            new Model(215L,"AMAZE","CNG",504L),
            new Model(216L,"CITY","PETROL",504L),
            new Model(217L,"ELEVATE","PETROL",504L),
            new Model(218L,"DZIRE","CNG",505L),
            new Model(200L,"WAGONR","PETROL",505L),
            new Model(200L,"GRAND VITARA","DIESEL",505L),
            new Model(200L,"FRONX","PETROL",505L)
    );

    @Override
    public List<Model> getModelsOfCompany(Long companyId) {
        return list.stream().filter(model->model.getCompanyId().equals(companyId)).collect(Collectors.toList());
    }
}
