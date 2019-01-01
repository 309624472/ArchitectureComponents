package me.francis.databinding.java.model;

public class AddressEntity {
    private String province;
    private int proviceCode;
    private String city;
    private int cityCode;
    private String detail;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
