package com.example.ps5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcEngineUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestCalculator() {
		assertEquals(CalcEngine.getFuturevalue(3,10000.00,3.25),"11022.66");
	}

	private void assertEquals(String string, String futurevalue) {
		// TODO Auto-generated method stub
		
	}

	


}