package appium;

import java.io.File;
import java.net.MalformedURLException;

public class ToDoListTest {

	public static void main(String[] args) throws MalformedURLException {

		// Install and open application
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "app/");
		File app = new File(appDir, "ToDoList.apk");

	}

}
