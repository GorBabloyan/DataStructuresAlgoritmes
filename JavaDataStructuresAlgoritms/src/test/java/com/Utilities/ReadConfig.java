package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is " + e.getMessage());
        }
    }



    //region <Getting Variables for gameLaunchURL API>


    public String getAssetsUrl() {
        return pro.getProperty("AssetsURL");
    }
    public int getTimeZone() {
        return Integer.parseInt(pro.getProperty("Timezone"));
    }
    public String getLanguage() {
        return pro.getProperty("LanguageId");
    }
    public boolean getIsForMobile() {
        return Boolean.parseBoolean(pro.getProperty("ForMobile"));
    }
    public String getClientSessionToken() {
        return pro.getProperty("clientSessionToken");
    }
    public String getLoginUrl() {
        return pro.getProperty("loginUrl");
    }
    public String getClientLoginCredentials() {
        return pro.getProperty("loginCredential");
    }

    public double getBetAmount() {
        return Double.parseDouble(pro.getProperty("BetAmount"));
    }








    //endregion




}
