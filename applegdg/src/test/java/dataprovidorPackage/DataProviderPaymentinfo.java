package dataprovidorPackage;

import org.testng.annotations.DataProvider;

public class DataProviderPaymentinfo {

    @DataProvider(name = "paymentInfo")
    public static Object[][] DataSet() {
        return new Object[][]{
                {"Dulquer Salmaan", "dulquer@mail.com", "01234567890", "Dhaka,Bangladesh"}
        };
    }
}
