package com.techprimers.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.techprimers.testing",
        format = {"json:target/reports/results.json", "html:target/reports/results.html"}
)
public class CucumberTest {
}
