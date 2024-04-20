package com.samsung.sroki.domain;

public class Product {
    private String name;
    private int freshnessId;

    private String data;

    public Product(String name,  String data){
        this.name= name;
        this.data=data;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreshnessId() {
        return freshnessId;
    }

    public void setFreshnessId(int freshnessId) {
        this.freshnessId = freshnessId;
    }
}
