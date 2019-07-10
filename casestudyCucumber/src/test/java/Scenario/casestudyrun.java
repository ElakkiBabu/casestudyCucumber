package Scenario;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:scr/cucumber-reports"},features= {"src/test/resources/Scenario/scenario1.feature","src/test/resources/Scenario/scenario2.feature","src/test/resources/Scenario/scenario3.feature","src/test/resources/Scenario/scenario4.feature"},monochrome=true)
public class casestudyrun {

}
