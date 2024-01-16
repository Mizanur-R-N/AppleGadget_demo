package dataprovidorPackage;

import org.testng.annotations.DataProvider;

public class DataProviderOrderInfo {

    @DataProvider(name = "orderInfo")
    public static Object[][] DataSet() {
        return new Object[][]{
                {"Dulquer Salmaan", "01234567890", "Dhaka,Bangladesh"}

        };
    }
}
