package commanUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LIstenerImplimentation implements ITestListener{
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		String methodname = result.getMethod().getMethodName();
//		Reporter.log(methodname+"Testscript execution is started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscrpt execution is passed",true);
		
		
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscrpt execution is fail",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname+"Testscrpt execution is skipped",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		JavaUtil jUtil = new JavaUtil();
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreport/report"+jUtil.getRandomNumber()+".html");
		reporter.config().setDocumentTitle("vtiger");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("organization");
		
//		use Extentreport to generate exetentreport
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("OS", "Window");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Chromeversion", "121");
		report.setSystemInfo("Author", "pune");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
