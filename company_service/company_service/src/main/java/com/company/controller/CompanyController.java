package com.company.controller;
import com.company.entity.Company;
import com.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{companyId}")
    public Company getCompany(@PathVariable("companyId") Long companyId)
    {
        Company company=this.companyService.getCompany(companyId);

        List models=this.restTemplate.getForObject("http://model-service/model/company/"+company.getCompanyId(), List.class);
        company.setModels(models);
        return company;
    }
}
