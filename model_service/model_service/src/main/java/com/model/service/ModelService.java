package com.model.service;
import com.model.entity.Model;
import java.util.List;
public interface ModelService {
    public List<Model> getModelsOfCompany(Long companyId);

}
