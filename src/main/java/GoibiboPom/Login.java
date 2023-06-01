package GoibiboPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GoComBase.GoBaseClass;

public class Login extends GoBaseClass {
	
	
public Login ()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//p[contains(text(),'LOGIN / SIGNUP')])[2]") 
	private WebElement login;
	

	@FindBy(xpath="//h3[contains(text(),'Login/Signup')]")
	private WebElement loginTitle;
	
	@FindBy(xpath="//input[@class='loginCont__input']") 
	private WebElement mobileNumberlabel;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/div/div/form/div/input") 
	private WebElement enterMmobileNumber;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement continueButton;
	
	@FindBy(xpath="//h3[contains(text(),'Verify OTP')]") 
	private WebElement OTPtitle;
	
	@FindBy(xpath="(//input[@class='verifyOtpCont__otpFiled '])[1]") 
	private WebElement enterOTP;
	
	@FindBy(xpath="//div[contains(text(),'Enter 4 digit OTP sent to')]") 
	private WebElement enterOTPlabel;
	
	
	@FindBy(xpath="//input[@class='loginCont__input']") 
	private WebElement enterName;
	
	@FindBy(xpath="(//span[@class='loginCont__label'])[2]") 
	private WebElement emailIDlabel;
	
	@FindBy(xpath="//input[@placeholder='Enter your email address']") 
	private WebElement enterEmail;
	
	@FindBy(xpath="//button[contains(text(),'Lets Go')]") 
	private WebElement letsGoButton;
	
	@FindBy(xpath="//button[contains(text(),'I’ll do it later')]") 
	private WebElement willDoItLater;
	
	@FindBy(xpath="//div[@class='login__tab_wrapper']") 
	private WebElement profile;
	
	@FindBy(xpath="//span[@class='profile_name_char']") 
	private WebElement firstNameIcon;
	
	@FindBy(xpath="//span[@class='uname-truncated uname-truncated2 gr-text-capitalize']") 
	private WebElement profileName;
	
	@FindBy(xpath="//div[@class='login__tab gotrible']") 
	private WebElement profileclick;
	
	@FindBy (xpath = "	//div[@class='login__tab gotrible']//child:: ul/li[1]")
	private WebElement viewprofileclick;
	
	public WebElement getProfileclick() {
		return profileclick;
	}
	public void setProfileclick(WebElement profileclick) {
		this.profileclick = profileclick;
	}
	public WebElement getViewprofileclick() {
		return viewprofileclick;
	}
	public void setViewprofileclick(WebElement viewprofileclick) {
		this.viewprofileclick = viewprofileclick;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLoginTitle() {
		return loginTitle;
	}
	public WebElement getMobileNumberlabel() {
		return mobileNumberlabel;
	}
	public WebElement getEnterMmobileNumber() {
		return enterMmobileNumber;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getOTPtitle() {
		return OTPtitle;
	}
	public WebElement getEnterOTP() {
		return enterOTP;
	}
	public WebElement getEnterOTPlabel() {
		return enterOTPlabel;
	}
	
	public WebElement getEnterName() {
		return enterName;
	}
	public WebElement getEmailIDlabel() {
		return emailIDlabel;
	}
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	public WebElement getLetsGoButton() {
		return letsGoButton;
	}
	public WebElement getWillDoItLater() {
		return willDoItLater;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getFirstNameIcon() {
		return firstNameIcon;
	}
	public WebElement getProfileName() {
		return profileName;
	}
}



