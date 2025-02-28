package com.company.entity;

public class Model {
    private Long mId;
    private String name;
    private String version;

    private Long companyId;

    public Model(Long mId, String name, String version, Long cId) {
        this.mId = mId;
        this.name = name;
        this.version = version;
        this.companyId = cId;
    }

    public Model() {
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
