package BikeDetails;

import java.util.ArrayList;
import java.util.List;

public class Bike {
    private String color;
    private String brandName;
    private String chasisNumber;
    private List<String> features = new ArrayList<>();

//    public Bike(String color, String brandName, String chasisNumber, List<String> featureList) {
//        this.color = color;
//        this.brandName = brandName;
//        this.chasisNumber = chasisNumber;
//        this.features = features;
//    }
    public Bike(String color, String brandName, String chasisNumber, List<String> featureList) {
    this.color = color;
    this.brandName = brandName;
    this.chasisNumber = chasisNumber;
    this.features = featureList;
}
    public Bike() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    public void setChasisNumber(String chasisNumber) {
        this.chasisNumber = chasisNumber;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }


}
