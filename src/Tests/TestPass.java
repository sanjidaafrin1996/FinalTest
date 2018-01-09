package Tests;

import java.util.Locale;

import org.testng.annotations.Test;

import base.Config;
import locators.Locator1;
import values.Value1;

public class TestPass extends Config {
	 Locator1 loc= new Locator1();
	 Value1 val = new  Value1();
	 @Test
		public void createFBAccountWith18less (){
		 			 typeByXpath (loc.firstNameLocators, val.firstNameValue);
				
				// verify the last name field
				typeByXpath (loc.lastNameLocators, val.lastNameValue);
				clickbyxpath(loc.femaleLocators);
				typeByXpath (loc.newphoneemailLocators, val.newphoneemailValue);
				
				
				
				// dropdown
				//DropdownByXpath (loc.yyDropdownLoc, val.eighteenLessYearValue);
			}
			
			
			// dropdown
			//dropDownByXpath (loc.yyDropdownLoc, val.eighteenPlusYearValue);
		}
		

	
	

 
