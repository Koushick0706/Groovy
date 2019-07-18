package Baseclass

import java.sql.Driver

import org.openqa.selenium.WebDriver

class Google 
{
	
	String name;
	
	static main(args)
	{
		Google test = new Google();
		test.testgoogle();
	}
	
void testgoogle() 
{
	name="Koushick";
	if (name.equals("Koushick")) 
	{
		println "The Name is Correct Absolutley";
	}
	
	while (name=="Koushick") {
		println "Ha Ha Yes Absolutley."
		break;
	}
	
}

}
