package au.com.altx;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/features"})

/*@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/features"},tags = {"not @TThirtyThreeExistingCustomer",
        "not @MFSmartSearchAPI","not @AddNewMemberAccount","not @SubjectAccessRequest", "not @MergeMember", "not @AnnualAllowanceForT24Policy", "not @MessageControllerAPI"})*/

//@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources/features/api/ImportantMemberInfoControllerAPI.feature"},tags = {"not @TThirtyThreeExistingCustomer"})

public class RunCucumberTest {

}
