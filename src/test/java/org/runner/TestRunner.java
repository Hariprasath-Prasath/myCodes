package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Featurse",snippets = SnippetType.CAMELCASE,
glue = "org.stepdef", dryRun = false,
stepNotifications = true)
public class TestRunner {

}
