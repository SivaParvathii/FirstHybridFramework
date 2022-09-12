package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pompages.AddtoCartPage;
import pompages.SkillraryDemoLoginPage;
import pompages.SkillraryLoginPage;


public class Testcase1 extends BaseClass
{
	@Test
	public void tc1() 
	{
      SkillraryLoginPage s=new SkillraryLoginPage(driver);
      s.gearsbutton();
      s.skillrarydemoapplication();
      utilies.switchingtabs(driver);
      
      SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
      utilies.mouseHover(driver,sd.getCoursetab());
      sd.seleniumtrainingtab();
      
      AddtoCartPage d=new AddtoCartPage(driver);
      
      utilies.doubleClick(driver,d.getAddbtn());
      d.carttocartbtn();
      utilies.alertpopup(driver);
	}

}
