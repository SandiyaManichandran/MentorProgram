package BikeDetails;

import java.util.List;

public interface BikeInterface {
    void createbikeInfo(String color, String brandName, String chasisNumber, List<String> featureList);

    void showBikes();
}
