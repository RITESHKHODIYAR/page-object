package testcases1;


//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

//import object_repository.OLD_GmailLogin;
import Object_repo.Signin_Unable_page;
import Object_repo.Signin_email_page;
//import object_repository.Signin_email_page;
//import object_repository.Signin_pwd_page;

public class LoginTestcase2 {
	
	//Signin_email_page emailpage;
	//Signin_pwd_page pwdpage;
	
	
	

	public static void main(String[] args) throws InterruptedException	{
		Signin_Unable_page signinunable;
		System.setProperty("webdriver.chrome.driver","E:\\IDM (Internet download manager)\\Compressed\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		Signin_email_page emailpage=new Signin_email_page(driver);
		
		PageFactory.initElements(driver, emailpage);
		
		emailpage.enteremailid("ritesh");
		signinunable = emailpage.clickNext();
		
		Thread.sleep(5000);
		signinunable.clickTerms();

		System.out.println("End of code");
		
	}
	

}
