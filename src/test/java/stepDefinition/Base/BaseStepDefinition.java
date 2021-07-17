package stepDefinition.Base;

public class BaseStepDefinition {

    BaseSteps baseSteps = new BaseSteps();

    //@Given("^open browser$")
    public void open_browser() throws Throwable {
        baseSteps.initilize();
    }

}
