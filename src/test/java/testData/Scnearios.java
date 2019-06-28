package testData;

import org.testng.annotations.DataProvider;

public class Scnearios {
    @DataProvider(name = "ProvideAccessNumbers")
    public static Object[][] getDataFromDataprovider() {
        return new Object[][]{
                {"Individual", "786504"},
                {"Business", "786505"},
                {"FM", "786506"}
        };
    }
}

