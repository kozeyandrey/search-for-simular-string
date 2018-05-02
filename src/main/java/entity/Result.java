package entity;

import org.json.simple.JSONObject;

public class Result {
    private Integer id;
    private JSONObject calculations;
    private String name;
    private String feature;
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JSONObject getCalculations() {
        return calculations;
    }

    public void setCalculations(JSONObject calculations) {
        this.calculations = calculations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
