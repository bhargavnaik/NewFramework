package filesandfolders;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
         String  projectFolder=System.getProperty("user.dir");
		
		System.out.println(projectFolder);
		
		File screenshotFolder=new File(projectFolder+"\\ScreenShots");
		
		screenshotFolder.mkdir();
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
         String date = simpleDateFormat.format(new Date());
         //System.out.println(date);
         
         date=date.replace(":", "-");
         System.out.println(date);
		
       File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File(screenshotFolder+"\\"+date+".png"));
		
		driver.quit();
	}

}
