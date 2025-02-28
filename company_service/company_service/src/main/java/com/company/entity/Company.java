package com.company.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private Long companyId;
    private String name;
    private String origin;
    private String rating;

    List<Model> models=new ArrayList<>();

    public Company(String rating, Long cId, String name, String origin, List<Model> models) {
        this.rating = rating;
        this.companyId = cId;
        this.name = name;
        this.origin = origin;
        this.models = models;
    }

    public Company(Long cId, String name, String origin, String rating) {
        this.companyId = cId;
        this.name = name;
        this.origin = origin;
        this.rating = rating;
    }

    public Company() {
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}


