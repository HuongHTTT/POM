package basicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class basicTest {
	//Creating extendReport and ExtendTest reference values
	ExtentReports report;
	ExtentTest logger;

	@Test
	public void verifysum(){
		//create object for report with filepath
		report = new ExtentReports("./Reports/TestReport.html");
		//start the test
		logger = report.startTest("verifysum");
		//log the status in report
		logger.log(LogStatus.INFO, "calc started");
		int a = 50, b=80, c;
		c = a + b;
		Assert.assertEquals(c, 130);
		//pass the test in report
		logger.log(LogStatus.PASS, "Test Verified");
		//End the test
		report.endTest(logger);
		//flush the data to repor
		report.flush();
	}
}
