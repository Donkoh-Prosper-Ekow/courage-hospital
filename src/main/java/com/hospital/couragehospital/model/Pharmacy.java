package com.hospital.couragehospital.model;

public class Pharmacy {
    private String drugId;
    private String drugName;
    private String manuDate;
    private String expDate;
    private String drugInStock;
    private String drugOutOfStock;
    private String price;

    public Pharmacy(){}

    public Pharmacy(String drugId, String drugName, String manuDate, String expDate, String drugInStock, String drugOutOfStock,String price){
        this.drugId=drugId;
        this.drugName=drugName;
        this.manuDate=manuDate;
        this.expDate=expDate;
        this.drugInStock=drugInStock;
        this.drugOutOfStock=drugOutOfStock;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManuDate() {
        return manuDate;
    }

    public void setManuDate(String manuDate) {
        this.manuDate = manuDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getDrugInStock() {
        return drugInStock;
    }

    public void setDrugInStock(String drugInStock) {
        this.drugInStock = drugInStock;
    }

    public String getDrugOutOfStock() {
        return drugOutOfStock;
    }

    public void setDrugOutOfStock(String drugOutOfStock) {
        this.drugOutOfStock = drugOutOfStock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                ", drugId='" + drugId + '\'' +
                ", drugName='" + drugName +
                ", manuDate='" + manuDate +
                ", expDate='" + expDate +
                ", drugInStock=" + drugInStock +
                ", drugOutOfStock=" + drugOutOfStock +
                ", price='" + price +
                '}';
    }
}