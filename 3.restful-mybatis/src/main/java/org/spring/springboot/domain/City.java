package org.spring.springboot.domain;

/**
 * 城市实体类
 */
public class City {

    /**
     * 城市编号,省份编号,城市名称,描述
     */
    private Long id;
    private Long provinceId;
    private String cityName;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
