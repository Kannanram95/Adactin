package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
    @Before
    public void launch(){
        toChromelaunch();
    }

    @After
    public void close(){
        driver.quit();
    }
}
