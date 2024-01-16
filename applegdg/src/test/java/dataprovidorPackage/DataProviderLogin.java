package dataprovidorPackage;

import org.testng.annotations.DataProvider;

public class DataProviderLogin {

    @DataProvider(name = "LoginCredentails")
    public static Object[][] DataSet() {
        return new Object[][]{
//                {"valid", "200000041810", "02522016"},
//                {"valid", "200000027814", "02522016"},
//                {"valid", "200000063516", "02522016"},
//                {"valid", "200000052035", "02522016"},
//                {"valid", "200000021059", "02522016"},
//                {"valid", "200000027828", "02522016"},
//                {"valid", "200000041196", "02522016"},
//                {"valid", "200000027811", "02522016"},
                {"invalid", "abc", "123a678"},
                {"valid", "", "02522016"},
                {"valid", "015213458965325831015", ""},
                {"valid", "01912383299", "Test#1234"},
        };
    }
}