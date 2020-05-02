package com.usa.listener;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.usa.baseclass.SuperClass;
import com.usa.utility.UtilityFile;

public class Listerner extends SuperClass implements ITestListener  {
 public ExtentReports extent;
 public ExtentHtmlReporter HtmlReporter;
 public ExtentTest logger;
 
 
	@Override
	public void onTestStart(ITestResult result) {
		
			
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger=extent.createTest(result.getName());
	logger=logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		
		try {
			UtilityFile.screenshot(driver, "Failed Test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.YELLOW));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "report-" + timeStamp + ".html";

		HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Extentreport/" + repName);
		
		
		HtmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

		extent = new ExtentReports();

		extent.attachReporter(HtmlReporter);
		extent.setSystemInfo("Host name", "moudood choudhury");
		extent.setSystemInfo("Environemnt", "UAT");
		extent.setSystemInfo("user", "moudood");
	

		HtmlReporter.config().setDocumentTitle("Ecommerce Test Project"); 
		HtmlReporter.config().setReportName("GroupTwo Test Report"); 
		HtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); 
		HtmlReporter.config().setTheme(Theme.DARK);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}



}
