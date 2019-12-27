package com.test;

import org.testng.annotations.Test;

import com.napmkt.mytestngproj.Calculator;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class CalculatorTest {
	
	Calculator cal;
	
  @Test(priority=1)
  public void addTest() {
	  
	  assertEquals(cal.add(10, 10), 20);
  }
  
  @Test(enabled=false)
  public void subTest() {
	  
	 assertEquals(cal.sub(35, 20), 15);
  }
  
  @Test(priority=2)
  public void mulTest() {
	  
	 assertEquals(cal.mul(10, 10), 100);
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  cal = new Calculator();
  }

  @AfterClass
  public void afterClass() {
  }

}
