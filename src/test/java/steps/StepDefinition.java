package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	
	//before hook
	@Before
	public void setUp()
	{
		System.out.println("in before hook method..");
	}
	
	//after hook
	@After
	public void tearDown()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@AfterStep
	public void screenShot()
	{
		System.out.println("screenshot taken..");
	}
	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}
		
	}

	@Given("user launch app using url {string}")
	public void user_launch_app_using_url(String url) {
	  
          driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("user enters text {string} in textbox using xpath {string}")
	public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	    
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user clicks login button using xpath {string}")
	public void user_clicks_login_button_using_xpath(String xpath) {
	    
		driver.findElement(By.xpath(xpath)).click();
	}


	@Then("user verifies title to be {string}")
	public void user_verifies_title_to_be(String expTitle) {
	    
		Assert.assertEquals(expTitle, driver.getTitle());
	}

	@When("user clicks using xpath {string}")
	public void user_clicks_using_xpath(String xpath) {
	   
		driver.findElement(By.xpath(xpath)).click();
	}
	@When("user enters details in registration form")
	public void user_enters_details_in_registration_form(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<List<String>> allLists=dataTable.asLists();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(allLists.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(allLists.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(allLists.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(allLists.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(allLists.get(0).get(4));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(allLists.get(0).get(5));
	
	}
		
		
	@When("user enters details in registration form2")
	public void user_enters_details_in_registration_form2(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String,String>> listMap= dataTable.asMaps();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(listMap.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(listMap.get(0).get("password"));
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys(listMap.get(0).get("confirm password"));
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(listMap.get(0).get("full name"));
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys(listMap.get(0).get("email"));
		driver.findElement(By.xpath("//input[@name='captcha']")).sendKeys(listMap.get(0).get("captcha"));
		
		
	}



	
	
	
	
	}




