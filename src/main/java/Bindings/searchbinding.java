package Bindings;

import Pages.NykaaHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchbinding {
	
	public String SearchData = "Lipstick";

	@Given("^I Launch the Application$")
    public void i_launch_the_application() throws Throwable {
        
    }

    @When("^I Clicked on Search area$")
    public void i_clicked_on_search_area() throws Throwable {
        NykaaHomePage.ClickAndEnterTextInSearchArea(SearchData);
    }
    
    @And("^I Entered the product$")
    public void i_entered_the_product() throws Throwable {
        
    }

    @And("^I Selected data from suggested$")
    public void i_selected_data_from_suggested() throws Throwable {
        
    }

    @Then("^I Verified that search result$")
    public void i_verified_that_search_result() throws Throwable {
        
    }

    

}
