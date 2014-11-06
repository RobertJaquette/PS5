package com.example.ps5;

	public class CalcEngine {
		
				public static String getFuturevalue(int year, double Intialamount, double AnnualRate){
				String futurevalue = "";
				double futurevalues= Intialamount * Math.pow((1 + AnnualRate), (year));
				futurevalue = futurevalues + "";
				return futurevalue;		
			
			}
		}

