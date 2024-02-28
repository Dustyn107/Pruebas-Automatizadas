package ec.com.practice.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/opencart.feature"},
        glue = {"ec/com/practice/steps"},
        plugin = "pretty",
        snippets = CAMELCASE

)
public class RunnerTest {
}
