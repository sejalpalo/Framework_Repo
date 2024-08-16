package Pac1;

import org.testng.annotations.Test;

public class ContactTest {
  @Test
  public void CreatecontactTest() {
	  String URL = System.getProperty("url");
	  String BROWSER = System.getProperty("browser");
	  String USERNAME = System.getProperty("username");
	  String PASSWORD= System.getProperty("password");
	  System.out.println(URL);
	  System.out.println(BROWSER);
	  System.out.println(USERNAME);
	  System.out.println(PASSWORD);
	  System.out.println("excute createcontactTest");
  }
  @Test
  public void modifyContactTest() {
	  System.out.println("execute modifycontactTest");
  }
  @Test
  public void deleteContactTest() {
	  System.out.println("execute deletecontactTest");
  }
  
}
