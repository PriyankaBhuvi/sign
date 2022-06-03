package com.FacebookPages;

import org.openqa.selenium.By;

import generic.BaseTest;

      public class SignUpPage extends BaseTest {
    
      public void setFirstNameOnFacebookPage() {
    	  
       getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(getFisrtName());
    	  
     }
      
    	public void setLastNameOnFacebookPage() {
    		
    	getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(getLastName());
    	
    	
    }
        public void setRegisterMailId() {
    	   
	   getDriver().findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getRandomNumber(8));
	   
     }
      public void setPasswordOnFacebookPage() {
    	  
	    getDriver().findElement(By.xpath("//input[@name='reg_password_']")).sendKeys(getPassword());
	    
      }   
      public void setBirthDateOnFacebookPage() {
    	  
	   getDriver().findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(getRandomBirthDate());
	   
	   getDriver().findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(getRandomMonth());
	   
	   getDriver().findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(getRandomYear());
	   
      }
      
      }
	
      