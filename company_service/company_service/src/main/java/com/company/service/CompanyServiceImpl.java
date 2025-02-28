package com.company.service;
import com.company.entity.Company;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class CompanyServiceImpl implements CompanyService {
    List<Company> list=List.of(
            new Company(500L,"PRATHAM TATA","INDIA","5 STAR"),
            new Company(501L,"TOYOTA","JAPAN","3 STAR"),
            new Company(502L,"FORD","UNITED STATES","4 STAR"),
            new Company(503L,"BMW","GERMANY","5 STAR"),
            new Company(504L,"HONDA","JAPAN","4 STAR"),
            new Company(505L,"SUZUKI","JAPAN","3 STAR")

    );

    @Override
    public Company getCompany(Long id) {
        return list.stream().filter(company->company.getCompanyId().equals(id)).findAny().orElse(null);
    }



}
