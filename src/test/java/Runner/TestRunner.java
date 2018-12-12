package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * Created by Radha on 10/12/2018.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/Reports/","json:target/Reports/cucumber.json"},
        features ="features",
        glue= "Steps",
        tags={"@Login"}
    )

public class TestRunner {

    }
