package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution extends Utility {
  @Test//5
  public void f() {
	  System.out.println("This is test1");
  }
  @BeforeMethod//4
  public void beforeMethod() {
	  System.out.println("This is before methood annotation");
  }

  @AfterMethod//6
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

 @Test
 public void Test2() {
	 System.out.println("this is test2");
 }
  
  
  @BeforeClass//3
  public void beforeClass() {
	  System.out.println("this is before class annotation");
  }

  @AfterClass//7
  public void afterClass() {
	  
	 System.out.println("this is after class annotation");
  }

  @BeforeTest//2
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest//8
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite//1
  public void beforeSuite() {
	 System.out.println("this is before suite");
  }

  @AfterSuite//9
  public void afterSuite() {
	  System.out.println("this is after suite annotation");
  }

}
