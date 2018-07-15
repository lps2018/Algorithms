package Collections.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"};
        System.out.println(Arrays.toString(asset));
        List<String> assetList = Arrays.asList(asset);
        assetList.add(0,"KV");
        System.out.println(assetList);

    }
}
