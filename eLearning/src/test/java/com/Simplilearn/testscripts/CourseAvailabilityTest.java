package com.Simplilearn.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Simplilearn.pages.CoursePage;
import com.Simplilearn.pages.HomePage;

public class CourseAvailabilityTest extends BaseTest {

	@Test
	public void courseAvailability() {
		
		HomePage homePage = new HomePage(driver);
		
//		4) Hover the pointer over 'All Courses'.
		homePage.hoverAllCourse();
		
//		5) Hover the pointer over 'Software Development'
		homePage.hoverSoftwareDev();
		
//		6) Click on 'Automation Testing Masters Program'
		homePage.clickAutomation();
		
		CoursePage coursePage = new CoursePage(driver);
		
//		7) Verify the text ‘Automation Test Engineer' is visible on the next page
		String expectedTitle = "Automation Test Engineer";
		String actualTitle = coursePage.verifyTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
