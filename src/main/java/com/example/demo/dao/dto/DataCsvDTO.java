package com.example.demo.dao.dto;

import com.opencsv.bean.CsvBindByName;

public class DataCsvDTO {
    @CsvBindByName(column = "Policy_id")
    String policyId;
    @CsvBindByName(column = "Fuel")
    String fuel;
    @CsvBindByName(column="Premium")
    String premium;
    @CsvBindByName(column = "collision")
    String collision;
    public DataCsvDTO() {
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCollision() {
        return collision;
    }

    public void setCollision(String collision) {
        this.collision = collision;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }
}
