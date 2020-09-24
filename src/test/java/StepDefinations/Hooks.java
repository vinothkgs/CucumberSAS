package StepDefinations;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import Base.Base;
import POM.Home;
import cucumber.api.java.Before;

public class Hooks extends Base{
	
	@Before
	public void browserLaunch() {
		getDriverAcces();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LaunchUrl("https://www.flysas.com/en/");
		Home h= new Home();
		click(h.getPannerClose());

	}

}
