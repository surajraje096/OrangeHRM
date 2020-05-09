package RunnerClass;

import java.io.File;






import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Administrator\\Desktop\\FreeCrmBDDFramework\\src\\main\\java\\Features\\login.feature",//the path of features file
	glue={"stepDefinitions"}
	
	
	)


public class MyRunner {
	
	
	
}
