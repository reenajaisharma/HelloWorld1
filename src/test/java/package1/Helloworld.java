package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Helloworld {
	public WebDriver dr;
@Test
public void tc1()
{ WebDriver dr=new ChromeDriver();
dr.get("https://www.selenium.dev/");
	System.out.println(2)1;
	System.out.println("done");
}

@Test
public void tc2()
{
	System.out.println("second test1");
}
}
