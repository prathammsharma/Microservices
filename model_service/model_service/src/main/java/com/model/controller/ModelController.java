package com.model.controller;
import com.model.entity.Model;
import com.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @RequestMapping("/company/{companyId}")
    public List<Model> getModels(@PathVariable("companyId") Long companyId) {
        return this.modelService.getModelsOfCompany(companyId);
    }
}