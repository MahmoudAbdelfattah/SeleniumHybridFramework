package com.inetbanking.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Running_Failing_Test_With_Retry_Analyzer implements IRetryAnalyzer {

	
	int counter=0;
	int retrylimit=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(counter<retrylimit)
		{
			counter++;
			return true;
			
		}else {
		return false;
		}
	}

}
