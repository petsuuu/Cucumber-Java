package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/alugar_filme.feature",
		glue = "br.ce.wcaquino.steps",
		plugin = {"pretty","html:target/report-html","json:target/report.json"},
		tags ="~@ignore",
		//mvn teste ( execução cmd)
		monochrome = false, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false,
		strict= false)
public class RunnerTest {

}

//mvn test -Dcucumber.options="-h"
