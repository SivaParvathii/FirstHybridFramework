package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.CorejavaPage;
import pompages.SkillraryLoginPage;
import pompages.WishlistPage;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchTextBox(pdata.getPropertydata("coursedata"));
		s.gobutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.seleniumtraining();
		
		WishlistPage w=new WishlistPage(driver);
		utilies.switchFrame(driver);
		Thread.sleep(5000);
		w.playbutton();
		Thread.sleep(10000);
		w.pausebutton();
		utilies.switchbackframe(driver);
		w.addtowishlistbtn();
		
	
	}

}
