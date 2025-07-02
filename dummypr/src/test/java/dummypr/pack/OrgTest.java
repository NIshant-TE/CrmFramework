package dummypr.pack;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		//String USERNAME=System.getProperty("username");
		//String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(" execute createOrgTest");
	}

	@Test
	public void modifyOrgTest() {  
		System.out.println("cxecute modifyOrgTest");
		
	}
	@Test
	public void deleteOrgTest() {
		System.out.println("cxecute deleteOrgTest");
		
	}
}
