package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({"system:properties",
        "classpath:${webdriver}.driver.properties",
        "classpath:local.driver.properties"})
public interface WebDriverConfig extends Config {

    @Key("remote")
    boolean isRemote();

    @Key("url")
    String getURL();

    @Key("browser")
    String getBrowser();

    @Key("browser.version")
    String getBrowserVersion();

}